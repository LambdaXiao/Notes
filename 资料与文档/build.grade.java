gradle项目自动编译的时候要读取的配置文件。比如指定项目的依赖包等。
build.grade有两个，一个是全局的，一个是在模块里面。
全局的build.grade主要设置的是声明仓库源，gradle的版本号说明等。

./build.gradle

buildscript {            //设置脚本的运行环境
    repositories {
        // 声明仓库源，比如我们构建了一个安卓的库，现在想要把库上传到jcenter中供别人一起使用，则可以上传到jcenter中
        // 具体上传步骤见：http://www.jcodecraeer.com/a/anzhuokaifa/Android_Studio/2015/0227/2502.html
        jcenter()
    }
    dependencies {
        // 说明gradle的版本号
        classpath 'com.android.tools.build:gradle:1.3.0'

        // NOTE: Do not place your application dependencies here; they belong
        // in the individual module build.gradle files
    }
}

// 所有项目都继承这个配置
allprojects {
    repositories {
        mavenLocal()
        jcenter()
    }
}
//配置全局的sdk版本号，其他module引用这个的
ext {
compileSdkVersion = 23
buildToolsVersion = '23.0.1'
minSdkVersion = '15'
targetSdkVersion = '22'
supportLibraryVersion = '24.0.0'
gradleVersion = '2.0.0-beta7'
}

./app/build.grade                          //设置了模块的gradle构建配置 ,说明module的类型，com.android.application为程序，com.android.library为库

 apply plugin: 'com.android.application'   // 说明这个模块是安卓项目，如果是多模块开发，有可能有的值为java/war



    buildscript {                                   //设置脚本的运行环境
         
	 repositories {                             //支持java 依赖库管理（maven/ivy）,用于项目的依赖。
            mavenCentral()
        }
        
        dependencies {                              //依赖包的定义。支持maven/ivy，远程，本地库，也支持单文件
            classpath 'com.android.tools.build:gradle:0.4'
        }
    }

android {                                          // 配置了所有android构建的参数
    
    compileSdkVersion 23                           //编译sdk的版本，也就是API Level，例如API-19、API-20、API-21等等。
    buildToolsVersion "23.0.1"                     //build tools的版本，其中包括了打包工具aapt、dx等等。这个工具的目录位于你的sdk目录/build-tools/下

    aaptOptions.cruncherEnabled = false  
    aaptOptions.useNewCruncher = false             //关闭Android Studio的PNG合法性检查的

    defaultConfig {                                //默认配置
        
        applicationId "com.awesomeproject"         // 应用包名
        minSdkVersion 16                           //最小sdk版本，如果设备小于这个版本或者大于maxSdkVersion(一般不用)将无法安装这个应用     
        targetSdkVersion 22                        //目标sdk版本，如果设备等于这个版本那么android平台就不进行兼容性检查，运行效率会高一点
        
        versionCode 1                              // 版本号,版本更新了几次，第一版应用是1，以后每更新一次加1
        versionName "1.0"                          //版本信息，这个会显示给用户，就是用户看到的版本号	
    
        archivesBaseName = "weshare-$versionName"  //指定打包成Jar文件时候的文件名称
        
        ndk {                                                     // 原生
            moduleName "xiaopaowifisafe"                          //设置库(so)文件名称
            ldLibs "log", "z", "m", "jnigraphics", "android"
            //引入库，比如要用到的__android_log_print
            abiFilters "armeabi", "x86", "armeabi-v7a"            //, "x86"  显示指定支持的ABIs
            cFlags "-std=c++11 -fexceptions"                      // C++11
            stl "gnustl_static"
        }

	multiDexEnabled true                       //当方法数超过65535(方法的索引使用的是一个short值，而short最大值是65535)的时候允许打包成多个dex文件，动态加载dex。这里面坑很深啊
        
       
    }

    buildTypes {                                            //build类型
        release {                                           //release版本的配置
            zipAlignEnabled true                            //是否支持zip
            shrinkResources true                            // 移除无用的resource文件
            minifyEnabled true                              //是否进行混淆
            proguardFiles getDefaultProguardFile('proguard-android.txt'), 'proguard-rules.pro'  //指定混淆规则文件,release的Proguard默认为Module下的proguard-rules.pro文件.           
            debuggable false                                //是否支持调试
            signingConfig signingConfigs.release            //设置签名信息
             
            ndk {                                                                 //ndk的一些配置
                // cFlags "-std=c++11 -fexceptions -O3 -D__RELEASE__"             // C++11
                // platformVersion  = "19"
                moduleName "xiaopaowifisafe" //设置库(so)文件名称
                ldLibs "log", "z", "m", "jnigraphics", "android"
                //引入库，比如要用到的__android_log_print
                abiFilters "armeabi", "x86", "armeabi-v7a"//, "x86"
                cFlags "-std=c++11 -fexceptions" // C++11
                stl "gnustl_static"
            }
            
            applicationVariants.all { variant ->                                  //采用动态替换字符串的方式生成不同的release.apk
                variant.outputs.each { output ->
                    def outputFile = output.outputFile
                    if (outputFile != null && outputFile.name.endsWith('release.apk')) {
                        def timeStamp = new Date().format('yyyyMMddHH');
                        def fileName = "WeShare-${defaultConfig.versionName}" + "-" + timeStamp + "-lj-" + ".apk";
                        output.outputFile = file("${outputFile.parent}/${fileName}")
                    }
                }
            }
            jniDebuggable false                                                 //关闭jni调试
        }
        debug {                                                                //debug版本的配置
            minifyEnabled false
            zipAlignEnabled true          
            shrinkResources true                                               // 移除无用的resource文件
            proguardFiles getDefaultProguardFile('proguard-android.txt'), 'proguard-rules.pro'
            debuggable true
//          jniDebuggable true
            ndk {
                cFlags "-std=c++11 -fexceptions -g -D __DEBUG__" // C++11
            }
            jniDebuggable true
        }
    }

	
    lintOptions {                   //程序在编译的时候会检查lint，有任何错误提示会停止build，我们可以关闭这个开关
        abortOnError false          //即使报错也不会停止打包     
        checkReleaseBuilds false    //打包release版本的时候进行检测
        
    }

	
    sourceSets {                                            //默认的一些文件路径的配置
        main {
             manifest.srcFile 'AndroidManifest.xml'         //指定AndroidManifest文件
            java.srcDirs = ['src']                          //指定source目录
            resources.srcDirs = ['src']                     //指定source目录
            aidl.srcDirs = ['src']                          //指定source目录
            renderscript.srcDirs = ['src']                  //指定source目录
            res.srcDirs = ['res']                           //指定资源目录
            assets.srcDirs = ['assets']                     //指定assets目录
            jniLibs.srcDirs = ['libs']                      //指定lib库目录
        }
	debug.setRoot('build-types/debug')                  //指定debug模式的路径
        release.setRoot('build-types/release')              //指定release模式的路径
    }

	
    dexOptions {                          //multiDex的一些相关配置，这样配置可以让你的编译速度更快
        preDexLibraries = false           //让它不要对Lib做preDexing        
        incremental true                  //开启incremental dexing,优化编译效率，这个功能android studio默认是关闭的。       
        javaMaxHeapSize "4g"              //增加java堆内存大小
    }


    compileOptions {
         //在这里你可以进行 Java 的版本配置，
         //以便使用对应版本的一些新特性
    }

    signingConfigs {                                 //签名配置
        release {                                    //发布版签名配置
            storeFile file("fk.keystore")            //密钥文件路径
            storePassword "123"                      //密钥文件密码
            keyAlias "fk"                            //key别名
            keyPassword "123"                        //key密码
        }
        debug {                                      //debug版签名配置
            storeFile file("fk.keystore")
            storePassword "123"
            keyAlias "fk"
            keyPassword "123"
        }
    }

   packagingOptions {
        exclude 'META-INF/ASL2.0'
        exclude 'META-INF/LICENSE'
        exclude 'META-INF/NOTICE'
        exclude 'META-INF/MANIFEST.MF'
    }
    productFlavors {
           //在这里你可以设置你的产品发布的一些东西，
           //比如你现在一共软件需要发布到不同渠道，
           //且不同渠道中的包名不同，那么可以在此进行配置；
           //甚至可以设置不同的 AndroidManifest.xml 文件。
        xiaopao {
        }
        googlePlay {
        }
        solo {
        }
    }
    productFlavors.all {
        flavor -> flavor.manifestPlaceholders = [UMENG_CHANNEL_VALUE: name]
    }
    //所谓ProductFlavors其实就是可定义的产品特性，
    //配合 manifest merger 使用的时候就可以达成在一次编译
    //过程中产生多个具有自己特性配置的版本。

    //上面这个配置的作用就是，为每个渠道包产生不同的 UMENG_CHANNEL_VALUE 的值。
}


repositories {                                 //远程依赖
        
    mavenCentral()                             //从中央库里面获取依赖
    maven{                                     //或者使用指定的本地maven库
        url "file://F:/githubrepo/releases"
    }  
    
    maven{                                     //或者使用指定的远程maven库
        url "远程库地址" 
    }
}

task copyNativeLibs(type: Copy) {              //.so文件的导入
        from fileTree(dir: 'libs', include: 'armeabi/*.so') into 'build/lib'
    }

dependencies {                                                // 依赖的工具包
    compile fileTree(dir: 'libs', include: ['*.jar'])         //编译lib目录下的.jar文件
    compile 'com.android.support:appcompat-v7:23.0.0'         //编译来自Jcenter的第三方开源库
    compile project(':Easylink')                              //编译附加的项目
}


apply plugin: 'com.google.gms.google-services'                //声明是要使用谷歌服务框架


task showMeCache << {                                         //第三方依赖库的本地缓存路径
    configurations.compile.each { println it }
}
//使用maven仓库。android有两个标准的library文件服务器，一个jcenter一个maven。两者毫无关系。
//jcenter有的maven可能没有，反之亦然。
//如果要使用jcenter的话就把mavenCentral()替换成jcenter()
repositories {
    mavenCentral()
}










./app/proguard-rules.pro
这个和上面说的一样混淆文件

./gradle.properties
grade的运行环境配置，比如使用多少内存之类的。

./gradlew 和 ./gradlew.bat
自动完成 gradle 环境的脚本，在linux和mac下直接运行gradlew会自动完成gradle环境的搭建。

./local.properties
配置SDK或者NDK的环境路径，各个机器上这个变量可能都是不一样的，所以不应该进入版本库

./setting.gradle
整个项目的管理，比如这个项目包含哪些模块等。

./XXX.iml 和 ./app/app.iml
iml是Intellij模块文件。Intellij是一款JAVA的IDE。Android Studio是基于开源的Intellij IDEA开发出来的IDE。
所以Android Studio有的IDE功能是需要有.iml才能使用的。比如我们删除了iml文件，可能就在Android Studio中看不到一些目录了。