AndroidManifest.xml配置文件详解

AndroidManifest.xml配置文件对于Android应用开发来说是非常重要的基础知识，本文旨在总结该配置文件中重点的用法，以便日后查阅。下面是一个标准的AndroidManifest.xml文件样例。

<?xml version="1.0" encoding="utf-8"?>

<manifest>

<!-- 基本配置 -->  
<uses-permission />  
<permission />  
<permission-tree />  
<permission-group />  
<instrumentation />  
<uses-sdk />  
<uses-configuration />  
<uses-feature />  
<supports-screens />  
<compatible-screens />  
<supports-gl-texture />  
  
<!-- 应用配置 -->  
<application>  
      
    <!-- Activity 配置 -->  
    <activity>  
        <intent-filter>  
            <action />  
            <category />  
            <data />  
        </intent-filter>  
        <meta-data />  
    </activity>  
      
    <activity-alias>  
        <intent-filter> . . . </intent-filter>  
        <meta-data />  
    </activity-alias>  
      
    <!-- Service 配置 -->  
    <service>  
        <intent-filter> . . . </intent-filter>  
        <meta-data/>  
    </service>  
      
    <!-- Receiver 配置 -->  
    <receiver>  
        <intent-filter> . . . </intent-filter>  
        <meta-data />  
    </receiver>  
      
    <!-- Provider 配置 -->  
    <provider>  
        <grant-uri-permission />  
        <meta-data />  
    </provider>  
      
    <!-- 所需类库配置 -->  
    <uses-library />  

</application>
</manifest>

从以上示例代码中，我们可以看出Android配置文件采用XML作为描述语言，每个XML标签都不同的含义，大部分的配置参数都放在标签的属性中，下面我们便按照以上配置文件样例中的先后顺序来学习Android配置文件中主要元素与标签的用法。

<manifest>

AndroidManifest.xml配置文件的根元素，必须包含一个<application>元素并且指定xlmns:android和package属性。xlmns:android指定了Android的命名空间，默认情况下是“http://schemas.android.com/apk/res/android”；而package是标准的应用包名，也是一个应用进程的默认名称，以本书微博应用实例中的包名为例，即“com.app.demos”就是一个标准的Java应用包名，我们为了避免命名空间的冲突，一般会以应用的域名来作为包名。当然还有一些其他常用的属性需要注意一下，比如android:versionCode是给设备程序识别版本用的，必须是一个整数值代表app更新过多少次；而android:versionName则是给用户查看版本用的，需要具备一定的可读性，比如“1.0.0”这样的。<manifest>标签语法范例如下。

<manifest xmlns:android="http://schemas.android.com/apk/res/android" package="string" android:sharedUserId="string" android:sharedUserLabel="string resource" android:versionCode="integer" android:versionName="string" android:installLocation=["auto" | "internalOnly" | "preferExternal"] > ... ... </manifest>

<uses-permission>

为了保证Android应用的安全性，应用框架制定了比较严格的权限系统，一个应用必须声明了正确的权限才可以使用相应的功能，例如我们需要让应用能够访问网络就需要配置“android.permission.INTERNET”，而如果要使用设备的相机功能，则需要设置“android.permission.CAMERA”等。<uses-permission>就是我们最经常使用的权限设定标签，我们通过设定android:name属性来声明相应的权限名，比如在微博应用实例中，我们就是根据应用的所需功能声明了对应的权限，相关代码如下。

<manifest ...> ... ... <!-- 网络相关功能 --> <uses-permission android:name="android.permission.INTERNET" /> <uses-permission android:name="android.permission.ACCESS_NETWORK_STATE" /> <uses-permission android:name="android.permission.ACCESS_COARSE_LOCATION" /> <uses-permission android:name="android.permission.ACCESS_FINE_LOCATION" /> <!-- 读取电话状态 --> <uses-permission android:name="android.permission.READ_PHONE_STATE"/> <!-- 通知相关功能 --> <uses-permission android:name="android.permission.VIBRATE" /> ... ... </manifest>

<permission>

权限声明标签，定义了供给<uses-permission>使用的具体权限，通常情况下我们不需要为自己的应用程序声明某个权限，除非需要给其他应用程序提供可调用的代码或者数据，这个时候你才需要使用<permission>标签。该标签中提供了android:name权限名标签，权限图标android:icon以及权限描述android:description等属性，另外还可以和<permission-group>以及<permission-tree>配合使用来构造更有层次的、更有针对性权限系统。<permission>标签语法范例如下。

<permission android:description="string resource" android:icon="drawable resource" android:label="string resource" android:name="string" android:permissionGroup="string" android:protectionLevel=["normal" | "dangerous" | "signature" | "signatureOrSystem"] />

<instrumentation>

用于声明Instrumentation测试类来监控Android应用的行为并应用到相关的功能测试中，其中比较重要的属性有：测试功能开关android:functionalTest，profiling调试功能开关android:handleProfiling，测试用例目标对象android:targetPackage等。另外，我们需要注意的是Instrumentation对象是在应用程序的组件之前被实例化的，这点在组织测试逻辑的时候需要被考虑到。<instrumentation>标签语法范例如下。

<instrumentation android:functionalTest=["true" | "false"] android:handleProfiling=["true" | "false"] android:icon="drawable resource" android:label="string resource" android:name="string" android:targetPackage="string" />

<uses-sdk>

用于指定Android应用中所需要使用的SDK的版本，比如我们的应用必须运行于Android 2.0以上版本的系统SDK之上，那么就需要指定应用支持最小的SDK版本数为5；当然，每个SDK版本都会有指定的整数值与之对应，比如我们最常用的Android 2.2.x的版本数是8。当然，除了可以指定最低版本之外，<uses-sdk>标签还可以指定最高版本和目标版本，语法范例如下。

<uses-sdk android:minSdkVersion="integer" android:targetSdkVersion="integer" android:maxSdkVersion="integer" />

<uses-configuration>与<uses-feature>

这两个标签都是用于描述应用所需要的硬件和软件特性，以便防止应用在没有这些特性的设备上安装。<uses-configuration>标签中，比如有些设备带有D-pad或者Trackball这些特殊硬件，那么android:reqFiveWayNav属性就需要设置为true；而如果有一些设备带有硬件键盘，android:reqHardKeyboard也需要被设置为true。另外，如果设备需要支持蓝牙，我们可以使用<uses-feature android:name="android.hardware.bluetooth" />来支持这个功能。这两个标签主要用于支持一些特殊的设备中的应用，两个标签的语法范例分别如下。

<uses-configuration android:reqFiveWayNav=["true" | "false"] android:reqHardKeyboard=["true" | "false"] android:reqKeyboardType=["undefined" | "nokeys" | "qwerty" | "twelvekey"] android:reqNavigation=["undefined" | "nonav" | "dpad" | "trackball" | "wheel"] android:reqTouchScreen=["undefined" | "notouch" | "stylus" | "finger"] />

<uses-feature android:name="string" android:required=["true" | "false"] android:glEsVersion="integer" />

<uses-library>

用于指定Android应用可使用的用户库，除了系统自带的android.app、android.content、android.view和android.widget这些默认类库之外，有些应用可能还需要一些其他的Java类库作为支持，这种情况下我们就可以使用<uses-library>标签让ClassLoader加载其类库供Android应用运行时用。<uses-library>标签的用法很简单，以下是语法范例。

<uses-library android:name="string" android:required=["true" | "false"] />

小贴士： 当运行Java程序时，首先运行JVM（Java虚拟机），然后再把Java类加载到JVM里头运行，负责加载Java类的这部分就叫做ClassLoader。当然，ClassLoader是由多个部分构成的，每个部分都负责相应的加载工作。当运行一个程序的时候，JVM启动，运行BootstrapClassLoader，该ClassLoader加载java核心API（ExtClassLoader和AppClassLoader也在此时被加载），然后调用ExtClassLoader加载扩展API，最后AppClassLoader加载CLASSPATH目录下定义的Class，这就是一个Java程序最基本的加载流程。

<supports-screens>

对于一些应用或者游戏来说，只能支持某些屏幕大小的设备或者在某些设备中的效果比较好，我们就会使用<supports-screens>标签来指定支持的屏幕特征。其中比较重要的属性包括：屏幕自适应属性android:resizeable，小屏（android:smallScreens）、中屏（android:normalScreens）、大屏（android:largeScreens）和特大屏（android:xlargeScreens）支持属性，按屏幕渲染图像属性android:anyDensity以及最小屏幕宽度属性android:requiresSmallestWidthDp等。<supports-screens>标签的语法范例如下。

<supports-screens android:resizeable=["true"| "false"] android:smallScreens=["true" | "false"] android:normalScreens=["true" | "false"] android:largeScreens=["true" | "false"] android:xlargeScreens=["true" | "false"] android:anyDensity=["true" | "false"] android:requiresSmallestWidthDp="integer" android:compatibleWidthLimitDp="integer" android:largestWidthLimitDp="integer"/>

<application>

应用配置的根元素，位于<manifest>下层，包含所有与应用有关配置的元素，其属性可以作为子元素的默认属性，常用的属性包括：应用名android:label，应用图标android:icon，应用主题android:theme等。当然，<application>标签还提供了其他丰富的配置属性，由于篇幅原因就不列举了，大家可以打开Android SDK文档来进一步学习，以下是语法范例。

<application android:allowTaskReparenting=["true" | "false"] android:allowBackup=["true" | "false"] android:backupAgent="string" android:banner="drawable resource" android:debuggable=["true" | "false"] android:description="string resource" android:enabled=["true" | "false"] android:hasCode=["true" | "false"] android:hardwareAccelerated=["true" | "false"] android:icon="drawable resource" android:isGame=["true" | "false"] android:killAfterRestore=["true" | "false"] android:largeHeap=["true" | "false"] android:label="string resource" android:logo="drawable resource" android:manageSpaceActivity="string" android:name="string" android:permission="string" android:persistent=["true" | "false"] android:process="string" android:restoreAnyVersion=["true" | "false"] android:requiredAccountType="string" android:restrictedAccountType="string" android:supportsRtl=["true" | "false"] android:taskAffinity="string" android:testOnly=["true" | "false"] android:theme="resource or theme" android:uiOptions=["none" | "splitActionBarWhenNarrow"] android:usesCleartextTraffic=["true" | "false"] android:vmSafeMode=["true" | "false"] > . . . </application>

Android:allowTaskReparenting

当一个与当前任务有亲缘 关系的任务被带到前台时，用这个属性来指定应用程序中定义的Activity能否从他们当前的任务中转移到这个有亲缘关系的任务中。如果设置为true， 则能够转移，如果设置为false，则应用程序中的Activity必须保留在它们所在的任务中。默认值是false。 <activity>元素有它们自己的allowTaskReparenting属性，它能够覆盖<application>元素中的设置。

android:allowBackup

是否允许备份应用的数据，默认是true,当备份数据的时候，它的数据会被备份下来。如果设为false，那么绝对不会备份应用的数据，即使是备份整个系统。

android:backupAgent

这个属性用于定义应用程 序备份代理的实现类的名称，这个类是BackupAgent类的一个子类。它的属性值应该是完整的Java类的名称 （如，com.example.project.MyBackupAgent）。但是，也可以使用用”.”符号开头的简称 （如，.MyBackupAgent），系统会把<manifest>元素中指定的包名追加到”.”符号的前面。

android:debuggable

这个属性用于指定应用程序是否能够被调试，即使是以用户模式运行在设备上的时候。如果设置为true，则能够被调试，否则不能调试，默认值是false。

android:description

这个属性用于定义应用程序相关的用户可读文本，它要比应用程序标签更长、更详细。它的的值必须被设置成一个字符串资源的引用。跟label属性不一样，label属性可以使用原生的字符串。这个属性没有默认值。

android:enabled

这个属性用于指定 Android系统能否实例化应用程序组件。如果设置为true，这个可以实例化其组件，否则不能够实例化。如果这个属性被设置为true，那么就会使用 每个组件自己enabled属性的设置来判断其是否能够被实例化。如果这个属性被设置为false，它会覆盖其所有组件自己指定的值，应用程序中的所有组 件都会被禁用。

默认值是true。

android:hasCode

这个属性用于设置应用程序是否包含了代码，如果设置为true，则包含代码，否则不包含任何代码。在这个属性被设置为false的时候，系统在加载组件的时候不会试图加载任何应用程序的代码。默认值是true。 如果应用程序没有使用任何应用内置组件类以外的组件，那么这个应用程序就不会有任何自己的代码，像使用AliasActivity类的Activity，是很少发生的。

android:hardwareAccelerated

这个属性用于设置能够给应用程序中的所有Activity和View对象启用硬件加速渲染。如果设置为true，则应该启用，如果设置为false，则不会启用。默认值是false。

从Android3.0 开始，应用程序可以使用硬件加速的OpenGL渲染器，来改善很多共同的2D图形操作的性能。当硬件加速渲染被启动的时候，在Canvas、Paint、 Xfermode、ColorFilter、Shader和Camera中的大多数操作都会被加速。这样会使动画、滚动更加平滑，并且会改善整体的响应效 果，即使应用程序没有明确的使用框架的OpenGL类库。

要注意的是，不是所有的OpenGL 2D操作都会被加速。如果启用了硬件加速渲染器，就要对应用程序进行测试，以确保使用渲染器时不发生错误。

android:icon

这个属性用于设置应用程 序的整个图标，以及每个应用组件的默认图标。对于<activity>、<activity- alias>、<service>、<service>、<receiver> 和<provider>元素，请看它们各自的icon属性。 设置这个属性时，必须要引用一个包含图片的可绘制资源（例如，“@drawable/icon”）。没有默认的图标。

android:killAfterRestore

这个属性用于指定在全系统的恢复操作期间，应用的设置被恢复以后，对应的问题程序是否应该被终止。单包恢复操作不会导致应用程序被关掉。全系统的复原操作通常只会发生一次，就是在电话被首次建立的时候。第三方应用程序通常不需要使用这个属性。 默认值是true，这意味着在全系统复原期间，应用程序完成数据处理之后，会被终止。

android:largeHeap

无论您的应用程序的进程应该是一个多大的Dalvik堆。这适用于为应用程序创建的所有进程。它只适用于加载到进程中的第一个应用程序，如果你使用一个共享的用户身份证，允许多个应用程序使用一个进程，他们都必须使用此选项一致或他们将有不可预测的结果。

大多数应用程序不应该需要这个，而应该把重点放在减少对性能的整体内存使用上。启用此也不保证可用内存的固定增加，因为一些设备被其总可用内存限制。

查询可用的内存大小在运行时，使用的方法getmemoryclass()或getlargememoryclass()。

android:label

这个属性用于设置应用程 序整体的用户可读的标签，并也是每个应用程序组件的默认标签。对于<activity>、<activity- alias>、<service>、<receiver>和<provider>元素，请看它们各自的 label属性。

设置这个属性值时，应该引用一个字符串资源。以便它能够跟用户界面中的其他字符串一样能够被本地化。但是为了应用程序开发的便利，也能够用原生的字符串来设置。

android:logo

这个属性用于给整个应用程序设置一个Logo，而且它也是所有Activity的默认Logo。 设置这个属性时，必须要引用一个包含图片的可绘制资源（如：“@drawable/logo”）。没有默认的Logo。

android:manageSpaceActivity

这个属性定义了一个完整的Activity子类的名字，系统能够把这个名字加载到由用户管理被应用程序所占用的设备上的内存。这个Activity也应该用<activity>元素来声明。

android:name

这整个属性用完整的Java类名，给应用程序定义了一个Application子类的实现。当应用程序进程被启动时，这个类在其他任何应用程序组件被实例化之前实例化。 这个子类实现是可选的，大多数应用程序不需要一个子类的实现。如果没有实现自己的子类，Android系统会使用基本的Application类的一个实例。

android:permission

这个属性定义了一个权限，为了跟应用程序进行交互，客户端必须要有这个权限。这个属性是为给所有的应用程序组件设置权限提供了便利的方法。它能够被独立组件所设置的permission属性所覆盖。

android:persistent

这个属性用户设置应用程序是否应该时刻保持运行状态，如果设置为true，那么就保持，否则不保持。默认值是false。普通的应用程序不应该设置这个属性，持久运行模式仅用于某些系统级的应用程序。

android:process

这个属性用于定义一个进程名称，应用程序的所有组件都应该运行在这个进程中。每个组件都能够用它自己process属性的设置来覆盖这个<application>元素中的设置。 默认情况下，当应用程序的第一个组件需要运行时，Android系统就会给这个应用程序创建一个进程。然后，应用中的所有组件都运行在这个进程中。默认的进程名是跟<manifest>元素中设置的包名进行匹配的。 通过设置这个属性，能够跟另外一个应用程序共享一个进程名，能够把这两个应用程序中的组件都安排到同一个进程中运行---但是仅限于这两个应用程序共享一个用户ID，并且带有相同的数字证书。 如果这个进程名称用“：”开头，那么在需要的时候，就会给应用程序创建一个新的、私有的进程。如果进程名用小写字符开头，就会用这个名字创建一个全局的进程，这个全局的进程能够被其他应用程序共享，从而减少资源的使用。

android:restoreAnyVersion

设置这个属性表示应用程序准备尝试恢复任何备份的数据集，即使备份比设备上当前安装的应用程序的版本要新。这个属性设置为true，即使是在版本不匹配而产生数据兼容性提示的时候，也会允许备份管理来恢复备份的数据，所以要谨慎使用。 这个属性的默认值是false。

android:taskAffinity

这个属性给应用的所有的Activity设置了一个亲缘关系名，除了那些用它们自己的taskAffinity属性设置不同亲缘关系的组件。 默认情况下，应用程序中的所有Activity都会共享相同的亲缘关系，亲缘关系的名称跟由<manifest>元素设置的包名相同。

android:theme

这个属性给应用程序中所有的Activity设置默认的主题，属性值要引用一个样式资源。每个独立的Activity的主题会被它们自己的theme属性所覆盖。

android:uiOptions

这个属性设置了Activity的UI的额外选项。它必须是下表中的一个值： 值 说明

none

默认设置，没有额外的UI选项。

splitActionBarWhenNarrow

在水平空间受到限制的时 候，会在屏幕的底部添加一个用于显示ActionBar中操作项的栏，例如：在纵向的手持设备上。而不是在屏幕顶部的操作栏中显示少量的操作项。它会把操 作栏分成上下两部分，顶部用于导航选择，底部用于操作项目。这样就会确保可用的合理空间不仅只是针对操作项目，而且还会在顶部给导航和标题留有空间。菜单 项目不能被分开到两个栏中，它们要显示在一起。

<activity>

Activity活动组件（即界面控制器组件）的声明标签，Android应用中的每一个Activity都必须在AndroidManifest.xml配置文件中声明，否则系统将不识别也不执行该Activity。<activity>标签中常用的属性有：Activity对应类名android:name，对应主题android:theme，加载模式android:launchMode（详见2.1.3.4节），键盘交互模式android:windowSoftInputMode等，其他的属性用法大家可以参考Android SDK文档学习。另外，<activity>标签还可以包含用于消息过滤的<intent-filter>元素，当然还有可用于存储预定义数据的<meta-data>元素，以下是<activity>标签的语法范例。

<activity android:allowTaskReparenting=["true" | "false"] android:alwaysRetainTaskState=["true" | "false"] android:clearTaskOnLaunch=["true" | "false"] android:configChanges=["mcc", "mnc", "locale", "touchscreen", "keyboard", "keyboardHidden", "navigation", "orientation", "screenLayout", "fontScale", "uiMode"] android:enabled=["true" | "false"] android:excludeFromRecents=["true" | "false"] android:exported=["true" | "false"] android:finishOnTaskLaunch=["true" | "false"] android:hardwareAccelerated=["true" | "false"] android:icon="drawable resource" android:label="string resource" android:launchMode=["multiple" | "singleTop" | "singleTask" | "singleInstance"] android:multiprocess=["true" | "false"] android:name="string" android:noHistory=["true" | "false"]
android:permission="string" android:process="string" android:screenOrientation=["unspecified" | "user" | "behind" | "landscape" | "portrait" | "sensor" | "nosensor"] android:stateNotNeeded=["true" | "false"] android:taskAffinity="string" android:theme="resource or theme" android:windowSoftInputMode=["stateUnspecified", "stateUnchanged", "stateHidden", "stateAlwaysHidden", "stateVisible", "stateAlwaysVisible", "adjustUnspecified", "adjustResize", "adjustPan"] >
... ... </activity>

<activity-alias>

Activity组件别名的声明标签，简单来说就是Activity的快捷方式，属性android:targetActivity表示的就是其相关的Activity名，当然必须是前面已经声明过的Activity。除此之外，其他比较常见的属性有：Activity别名名称android:name，别名开关android:enabled，权限控制android:permission等。另外，我们还需要注意的是，Activity别名也是一个独立的Activity，可以拥有自己的<intent-filter>和<meta-data>元素，其语法范例如下。

<activity-alias android:enabled=["true" | "false"] android:exported=["true" | "false"] android:icon="drawable resource" android:label="string resource" android:name="string" android:permission="string" android:targetActivity="string" > ... ... </activity-alias>

<intent-filter>与<action>、<category>、<data>

<intent-filter>用于Intent消息过滤器的声明，在前面的2.1.3.2节中我们已经对Android应用框架中的Intent消息作过比较详细的介绍，我们了解到Intent消息对于Android应用系统来说，是非常重要的“粘合剂”，<intent-filter>元素可以放在<activity>、<activity-alias>、<service>和<receiver>元素标签中，来区分可用于处理消息的Activity控制器、Service服务和广播接收器Broadcast Receiver。另外，我们还知道Intent消息还包含有名称、动作、数据、类别等几个重要属性。这点与该标签的写法也有一定的关系，比如<intent-filter>中必须包含有<action>元素，即用于描述具体消息的名称；<category>标签则用于表示能处理消息组件的类别，即该Action所符合的类别；而<data>元素则用于描述消息需要处理的数据格式，我们甚至还可以使用正则表达式来限定数据来源。当然，这些元素和标签的具体用法我们还需要慢慢学习，下面是标准<intent-filter>元素标签的语法范例。

<intent-filter android:icon="drawable resource" android:label="string resource" android:priority="integer" > <action android:name="string" /> <category android:name="string" /> <data android:host="string" android:mimeType="string" android:path="string" android:pathPattern="string" android:pathPrefix="string" android:port="string" android:scheme="string" /> </intent-filter>

<meta-data>

用于存储预定义数据，和<intent-filter>类似，<meta-data>也可以放在<activity>、<activity-alias>、<service>和<receiver>这四个元素标签中。Meta数据一般会以键值对的形式出现，个数没有限制，而这些数据都将被放到一个Bundle对象中，程序中我们则可以使用ActivityInfo、ServiceInfo甚至ApplicationInfo对象的metaData属性中读取。假设我们在一个Activity中定义了一个<meta-data>元素，相关示例用法如下。

java代码获取值： ActivityInfo info=this.getPackageManager() .getActivityInfo(getComponentName(), PackageManager.GET_META_DATA); String msg=info.metaData.getString("myMsg"); <activity...> <meta-data android:name="testData" android:value="Test Meta Data"></meta-data> </activity>

ActivityInfo info = this.getPackageManager() .getActivityInfo(getComponentName(), PackageManager.GET_META_DATA); String testData = info.metaData.getString("testData"); System.out.println("testData:" + testData);

<service>

Service服务组件的声明标签，用于定义与描述一个具体的Android服务，主要属性有：Service服务类名android:name，服务图标android:icon，服务描述android:label以及服务开关android:enabled等。关于Service服务组件的概念和用法请参考2.1.4.2节的内容，以下是<service>标签的语法范例。

<service android:enabled=["true" | "false"] android:exported=["true" | "false"] android:icon="drawable resource" android:label="string resource" android:name="string" android:permission="string" android:process="string" > ... ... </service>

<receiver>

Boardcast Receiver广播接收器组件的声明标签，用于定义与描述一个具体的Android广播接收器，其主要属性和<service>标签有些类似：Boardcast Receiver接收器类名android:name，接收器图标android:icon，接收器描述android:label以及接收器开关android:enabled等。关于Boardcast Receiver广播接收器组件的概念和用法请参考2.1.4.3节的内容，以下是<receiver>标签的语法范例。

<receiver android:enabled=["true" | "false"] android:exported=["true" | "false"] android:icon="drawable resource" android:label="string resource" android:name="string" android:permission="string" android:process="string" > ... ... </receiver>

<provider>与<grant-uri-permission>

除Activity、Service和Boardcast Receiver之外的另一个“四大组件”，也就是Content Provider内容提供者的声明标签。关于内容提供者组件的概念和用法请参考2.1.4.4节的内容，不再赘述。<provider>标签除了和其他组件相同的android:name、android:icon和android:label等基础属性之外，还提供了用于支持其功能的特殊属性，如：内容提供者标识名称android:authorities，对指定URI授予权限标识android:grantUriPermission以及具体的读、写权限，即android:readPermission和android:writePermission等。当然，这些属性的具体用法我们还需要慢慢学习，以下是<provider>标签的语法范例。

<provider android:authorities="list" android:enabled=["true" | "false"] android:exported=["true" | "false"] android:grantUriPermissions=["true" | "false"] android:icon="drawable resource" android:initOrder="integer" android:label="string resource" android:multiprocess=["true" | "false"] android:name="string" android:permission="string" android:process="string" android:readPermission="string" android:syncable=["true" | "false"] android:writePermission="string" > ... ... </provider>