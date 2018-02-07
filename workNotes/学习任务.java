坚持每天学习一点，进步一点
(养成好的代码书写习惯，结构清晰整洁，换行，运算符前后空格，多加注释)
(github,http://www.wanandroid.com/，csdn,新浪微博，博客园，开源中国社区，麦子学院，极客学院，网易云课堂，慕课网，51TCO ，23code，拉钩)
（Teitter,Dribbble,Behance,LinkedIn,Quora,知乎，LOFTER,UI中国，SegmentFault,stackoverflow,微信小程序）
（TeamViewer,取色器，ps,webstorm）

注册Google邮箱Gmail,记住大牛及其GitHub账号

多看看招聘网站上面的岗位要求，以此摆正学习方向，把握前沿技术。
============================================================
运用最新风格技术做一个行情demo
===============================    大纲     =============================
1，NDK学习

2，JNI学习

3，设计模式 mvp,mvvm,单例，工厂

4，基本程序框架，底部导航菜单，侧滑菜单，viewpager+fragment滑动指示器

5，数据解析XML、json

6，网络通信

7，Activity、Fragment切换动画

8，dialog、popupwindow、spinner等弹出框下拉选项，刷新等待进度条，开关控件

9，追寻google 以往历史发布及最新技术动态，下载Android studio工具并熟练使用，gradle，翻墙技巧

10，分享功能

11,分时k线画图

12，Webview 嵌入html5  js交互,jquery mobile

	jQuery Mobile 是创建移动 web 应用程序的框架。
	jQuery Mobile 适用于所有流行的智能手机和平板电脑。
	jQuery Mobile 使用 HTML5 和 CSS3 通过尽可能少的脚本对页面进行布局。

13，各种选项卡切换控件

14,程序换护色

15，捕捉程序异常日志

16,程序在线升级更新版本

17,短信验证功能

18,apk反编译
	防止反编译的代码混淆法（在eclipse自动生成的default.properties文件中加上一句“proguard.config=proguard.cfg”就可以了）

19.写入写出文件到手机，到SD卡，字符串加解密，编码转换，二进制图片转换

20.android 应用测试及测试工具，熟悉发布流程

21.熟悉android SDK

22.activity 启动模式，栈管理

23,Material谷歌全新UI风格，
	Recyclerview,
	CardView
	Palette,
	SwipeRefreshLayout
	NavigationView
	Drawerlayout
	Snackbar
android.support.v7.widget.Toolbar
android.support.design.widget.TabLayout
android.support.design.widget.CoordinatorLayout
android.support.design.widget.AppBarLayout
android.support.design.widget.CollapsingToolbarLayout
android.support.design.widget.FloatingActionButton
android.support.design.widget.NavigationView
android.support.v4.widget.NestedScrollView
android.support.v4.widget.DrawerLayout
android.support.v4.view.ViewPager

你的主界面内容，必须放置在Drawerlayout中的第一个位置
  根据自己的需要来放置控件，
      例如：LinearLayout布局或者RelativeLayout布局；
  也可以是单个控件，
用来放Drawerlayout中的内容，
  这里使用NavigationView来实现类似Google pLay中的侧滑栏效果，
  必须在build.gradle中添加compile 'com.android.support:design:22.2.0'；
如果使用NavigationView（其他控件也是一样）的特有属性，需要加上命名空间：
              xmlns:app="http://schemas.android.com/apk/res-auto"；
      另外，一定要添加android:layout_gravity="left"属性。
CoordinatorLayout是这次新添加的一个增强型的FrameLayout，通过它可以实现很多东西：
        例如：
            1.界面向上滚动逐渐隐藏Toolbar；
            2.在其中可以放置浮动的View，就像Floating Action Button。
AppBarLayout跟它的名字一样，把容器类的组件全部作为AppBar。
          将AppBarLayout放在CoordinatorLayout中，就可以实现滚动效果。
          本例中，TabLayout在界面滚动时，随着Toolbar的逐渐隐藏，将占据Toolbar的位置，
              达到节省屏幕空间，界面动画效果的目的。

Tabs选项卡，和ViewPager搭配使用可以增大界面的内容展示量，实现各种个性化分类内容展示而不互相干扰！
        Google在Design support library中提供官方的Tab组件，它就是TabLayout。
        相比Github上面开源的第三方库，这个更加简单易用。

        有以下常用属性：
            app:tabGravity="fill"  表示TabLayout中的Tabs要占满屏幕的width；
            app:tabSelectedTextColor：Tab被选中字体的颜色；
            app:tabTextColor：Tab未被选中字体的颜色；
            app:tabIndicatorColor：Tab指示器下标的颜色；


24,android-support-v4 是谷歌推出的兼容包，最低兼容Android1.6的系统，里面有类似ViewPager等控件。ViewPager在Android 1.6以下的版本是不自带的，所以要实现ViewPager需要使用v4包中的ViewPager。其余控件同理。

android-support-v7是谷歌推出的版本兼容包，最低兼容Android2.1的系统，这个包通常和appcompat-v7这个工程一起使用。
appcompat-v7这个工程可以让开发者统一开发，在任何系统版本下保证兼容性。涉及的内容有Theme，value，布局，新的控件，新的动画实现方式，包含了support-v4的全部内容，开发Android工程时，要兼容低版本都要导入v7工程。android studio在创建工程的时候默认导入了v7工程，并且将style使用了兼容style，给开发者提供了极大的方便。并且最新的v7包增加了很多material design的兼容类和素材，请及时更新。
android-support-v13是谷歌推出的版本兼容包，最低兼容Android3.2的系统。当初是为了开发平板做设计的。Android 3.x系统都是平板专用系统，但是3.x系统失败了。所以使用v13的包没有任何价值。

v7版本适用于任何版本的开发，保证了兼容性，所以在使用的时候一定要采用。
不要再用Eclipse做Android开发，ADT已经没有更新过了，Android Studio是Android开发的首选工具，支持5.0开发，更好的开发享受。

24，HTML5学习使用

25，.so库学习使用

26，Kotlin正式成为Android官方开发语言

27，常用框架技术：
MVP + RXJava + Retrofit + OKHttp + Material Design + Dagger2 + Base + Glide + GreenDao构建

28,热修复，组件化，插件化

29，AI 人工智能 Python TensorFlow 

30，区块链

======================================求职学习================================================

移动互联网行业在这个年头涌入的开发者太多了，导致快饱和了，所以没有经验者或经验少者难免找工作难。

stackoverflow号称如果它里面没有人能解决的问题，那你的问题一定是无法解决。

=====================================面试常见问题==================================================

1，Handle机制

2，Android事件分发机制

3，指针与引用的区别

4，网络请求头字段

5，Android生命周期

6，构造函数与虚函数区别，在温习接口继承，抽象函数等概念

7,AIDL

8,Android 消息机制

9,Android View 事件体系
=======================================全新MD风格工程=======================================================

所用技术:
butterknife注解
leakcanary检测内存泄漏
MVP+Dagger2+RxJava+Retrofit2 网络通信
FlycoTabLayout-master
FlycoDialog_Master-master
FlycoBanner_Master-master
recyclerview列表
ripple波纹效果
PullToRefreshAndLoad-master 下拉刷新上拉加载
SmartisanPull-master     下拉刷新
夜间模式
分享功能
第三方账号登录
QQ的左侧滑出
极光推送
友盟

好的网络框架：Rxjava&Retrofit + okhttp,volley，xUtils
好的图片加载库：glide,picaso，ImageLoader

EventBus： 是一个 Android 事件发布/订阅框架，通过解耦发布者和订阅者简化(register会把当前类中匹配的方法，存入一个map，而post会根据实参去map查找进行反射调用。
可以说，就是在一个单例内部维持着一个map对象存储了一堆的方法；post无非就是根据参数去查找方法，进行反射调用。) Android 事件传递，这里的事件可以理解为消息

xUtils： 一个 Android 公共库框架，主要包括四个部分：View，Db, Http, Bitmap 四个模块。
View 模块主要的功能是通过注解绑定 UI，资源，事件。
Db 模块是一个数据库 orm 框架， 简单的语句就能进行数据的操作。
Http 模块主要访问网络，支持同步，异步方式的请求，支持文件的下载。
Bitmap 模块是加载图片以及图片的处理， 支持加载本地，网络图片。而且支持图片的内存和本地缓存。

Dagger： 是一款 Java 平台的依赖注入库

Volley： 是 Google 推出的 Android 异步网络请求框架和图片加载框架

Android热修复：简单的说就是用户不用重新下载一个新的apk安装,而是直接下载一个补丁包,通过补丁来替换一些出现bug的类, 当然下载补丁的过程用户一般是感觉不到的,表面上看是直接修复了bug.利用android中的 DexClassLoader 类加载器,动态加载补丁dex,替换有bug的类
目前可能用的相对广泛的热修复框架有如下几个：
https://github.com/dodola/HotFix  基于AndFix
https://github.com/dodola/RocooFix  基于Nuwa
https://github.com/jasonross/Nuwa
https://github.com/bunnyblue/DroidFix  该方案基于的是android dex分包方案的
https://github.com/alibaba/AndFix

都是基于：动态修复技术、Android Dex分包方案

· 热修复：当线上应用出现紧急BUG，为了避免重新发版，并且保证修复的及时性而进行的一项在线推送补丁的修复方案。

· 插件化：一个程序划分为不同的部分，以插件的形式加载到应用中去，本质上它使用的技术还是热修复技术，只是加入了更多工程实践，让它支持大规模的代码更新以及资源和SO包的更新。

Gson：是Google提供的用来在Java对象和JSON数据之间进行映射的Java类库。可用于将Java对象转换成对应的JSON表示，也可以将JSON字符串转换成一个等效的Java对象。
Gson是谷歌的Json处理包，添加依赖。
compile 'com.google.code.gson:gson:2.7'
配合插件：GsonFormat可以快速通过json数据建立对应类。

Retrofit：将你的REST API变为Java接口

ActiveAndroid：算是一个轻量级的ORM（对象关系映射），让你无需编写一个单独的SQL语句，就可以保存和检索SQLite数据库记录。每个数据库记录都被包裹整齐地归为一类，如delete（）和save（）的方法。其他开源解决方案，如GreenDAO和ORMLite。

插件化框架：可以在主程序不重新安装的情况下，针对单个业务模块进行加载达到模块更新的目的，整个加载更新过程，对用户来说也是无感知的。
目前网上流行的主流的插件化技术核心主要分两类：

????一类是360公司开源的DroidPlugin，特点在宿主程序上打造一个纯粹的环境，可以让一个个普通apk（插件）不安装就可以正常使用，并且插件之前资源和代码都是相互独立互相不干扰也不能访问，为了达到这样的目的，框架hook了大量的系统api。

????另一类是从dynamic-load-apk 开始，通过反射少量api，达到插件代码和资源与宿主合并，达到相互调用的结果，目前大部分都是框架从底层代码合并和资源合并用的手法都差不多，只是各个框架在这基础上对插件化的理解不一样，为各自的项目做了不少的业务封装。

Crouton是Android上的一个可以让开发者对环境中的Toast进行替换的类，以一个应用程序窗口的方式显示，而其显示位置则由开发者自己决定。

Countly是国外比价有名的一款开源统计平台，是一款类似于友盟的移动&Web应用通用的实时统计分析系统，专注于易用性、扩展性和功能丰富程度。不同之处是 Countly 是开源的，任何人都可以将 Countly 客户端部署在自己的服务器并将开发工具包整合到他们的应用程序中。比友盟要简洁干净
