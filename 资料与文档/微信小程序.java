http://192.25.103.82:8888/svn/networkdevsvn/999_TEMP/ENO/iIndustrial_v2.5/
http://192.25.103.82:8888/svn/networkdevsvn/999_TEMP/ENO/client_android_as/



微信小程序：

依赖微信平台，无需安装即可使用，随时可用，用完即走，这也是和native app的最大区别，也不是webapp,weapp主要是通过html5实现的

四种公众号：订阅号，服务号，企业号，小程序
个人无法注册微信小程序只能注册订阅号
主要优势
1、用户可便捷地获取服务，无需安装或下载即可使用
2、具有更丰富的功能和出色的使用体验
3、封装一系列接口能力，帮助快速开发和迭代

1、订阅号：主要偏于为用户传达资讯（类似报纸杂志），认证前后都是每天只可以群发一条消息；
2、服务号：主要偏于服务交互（类似银行，114，提供服务查询），认证前后都是每个月可群发4条消息；
3、企业号：主要用于公司内部通讯使用，需要先有成员的通讯信息验证才可以关注成功企业号；

1、如果想简单的发送消息，达到宣传效果，建议可选择订阅号；
2、如果想进行商品销售，进行商品售卖，建议可申请服务号；
3、如果想用来管理内部企业员工、团队，对内使用，可申请企业号。
4、订阅号可通过微信认证资质审核通过后有一次升级为服务号的入口，升级成功后类型不可再变。
5、服务号不可变更成订阅号。

JS,html,css，微信自己的标记语言

微信不允许使用zepto和jq,不允许脚本中使用window,也无法在脚本中操作组件；
事件触发是用bindchange,bindtap等写在行间实现；
同时抛弃div,img等标签，用view,image,block等标签取代；
数据加载用js
wxml不等于html
wxss不等于css3
封闭的发布渠道：程序需通过官方IDE提交审核
腾讯完全控制客户端底层的内部实现

1，获取微信小程序的AppID
	需要注册微信公众平台账号（个人不行）
2，创建小程序
		app.js脚本文件，可以在此监听并处理小程序的生命周期函数、声明全局变量，处理数据，响应页面交互事件，调用框架提供的丰富的API
		app.json配置文件，可以在此配置小程序是由哪些页面组成，配置小程序的窗口背景色，配置导航条样式，配置默认标题，不能添加注释
		app.wxss样式表文件，可以再页面组成的class属性上直接使用app.wxss中声明的样式规则
3，编写代码
		微信小程序中的每一个页面的【路径+页面名】都需要写在 app.json 的 pages 中，且 pages 中的第一个页面是小程序的首页
		每一个小程序页面是由同路径下同名的四个不同后缀文件的组成，如：index.js、index.wxml、index.wxss、index.json。.js后缀的文件是脚本文件，.json后缀的文件是配置文件，.wxss后缀的是样式表文件，.wxml后缀的文件是页面结构文件

		
		

微信小程序是一种全新的连接用户与服务的方式，它可以在微信内被便捷地获取和传播，同时具有出色的使用体验。

微信导航栏，直接继承于客户端，除导航栏颜色之外，开发者无需亦不可对其中的内容进行自定义。但开发者需要规定小程序各个页面的跳转关系，让导航系统能够以合理的方式工作。
微信导航栏分为导航区域、标题区域以及操作区域。其中导航区控制程序页面进程。目前导航栏分深浅两种基本配色。
小程序导航栏支持基本的背景颜色自定义功能

开发者可选择小程序页面添加标签分页（Tab）导航。标签分页栏可固定在页面顶部或者底部，便于用户在不同的分页间做切换。标签数量不得少于2个，最多不得超过5个，为确保点击区域，建议标签数量不超过4项。一个页面也不应出现一组以上的标签分页栏。

其中小程序首页可选择微信提供的原生底部标签分页样式，该样式仅供小程序首页使用。开发时可自定义图标样式、标签文案以及文案颜色等，具体设置项可参考开发文档。

启动页加载
小程序启动页是小程序在微信内容一定程度上展现品牌特征的页面之一。本页面将突出展示小程序品牌特征和加载状态。启动页除品牌标志（Logo）展示外，页面上的其他所有元素如加载进度指示，均由微信统一提供且不能更改，无需开发者开发。

页面下拉刷新加载
在微信小程序内，微信提供标准的页面下拉刷新加载能力和样式，开发者无需自行开发。标准的刷新样式和动画，能向用户明确的小程序归属者，防止造假与作弊。
在样式上，下拉时出现的图标与文字标示颜色已捆绑，分为深浅两套方案，开发者可在其中选择。背景色可自定义

开发者可在小程序里自定义页面内容的加载样式。建议不管是使用在局部还是全局加载，自定义加载样式都应该尽可能简洁，并使用简单动画告知用户加载过程。 开发者也可以使用微信提供的，统一的页面加载样式

模态的加载样式将覆盖整个页面的，由于无法明确告知具体加载的位置或内容将可能引起用户的焦虑感，因此应谨慎使用。除了在某些全局性操作下不要使用模态的加载
局部加载反馈即只在触发加载的页面局部进行反馈，这样的反馈机制更加有针对性，页面跳动小，是微信推荐的反馈方式

对于常用控件，微信设计中心将提供控件库，其中的控件都已提供完整操作反馈。


常用快捷键
格式调整
Ctrl+S：保存文件
Ctrl+[， Ctrl+]：代码行缩进
Ctrl+Shift+[， Ctrl+Shift+]：折叠打开代码块
Ctrl+C Ctrl+V：复制粘贴，如果没有选中任何文字则复制粘贴一行
Shift+Alt+F：代码格式化
Alt+Up，Alt+Down：上下移动一行
Shift+Alt+Up，Shift+Alt+Down：向上向下复制一行
Ctrl+Shift+Enter：在当前行上方插入一行
Ctrl+Shift+F：全局搜索

光标相关
Ctrl+End：移动到文件结尾
Ctrl+Home：移动到文件开头
Ctrl+i：选中当前行
Shift+End：选择从光标到行尾
Shift+Home：选择从行首到光标处
Ctrl+Shift+L：选中所有匹配
Ctrl+D：选中匹配
Ctrl+U：光标回退

界面相关
Ctrl + \：隐藏侧边栏
Ctrl + m: 打开或者隐藏模拟器


注意：

App() 必须在 app.js 中注册，且不能注册多个。

不要在定义于 App() 内的函数中调用 getApp() ，使用 this 就可以拿到 app 实例。

不要在 onLaunch 的时候调用 getCurrentPage()，此时 page 还没有生成。

通过 getApp() 获取实例之后，不要私自调用生命周期函数。

在 JavaScript 文件中声明的变量和函数只在该文件中有效；不同的文件中可以声明相同名字的变量和函数，不会互相影响。

<block/> 并不是一个组件，它仅仅是一个包装元素，不会在页面中做任何渲染，只接受控制属性。

所有组件与属性都是小写，以连字符-连接

wx.on 开头的 API 是监听某个事件发生的API接口，接受一个 CALLBACK 函数作为参数。当该事件触发时，会调用 CALLBACK 函数。
如未特殊约定，其他 API 接口都接受一个OBJECT作为参数。
OBJECT中可以指定success, fail, complete来接收接口调用结果

wx.request发起的是 HTTPS 请求。一个微信小程序，同时只能有5个网络请求连接。
创建一个 WebSocket 连接；一个微信小程序同时只能有一个 WebSocket 连接，如果当前已存在一个 WebSocket 连接，会自动关闭该连接，并重新创建一个 WebSocket 连接。

为了不让用户在使用小程序时造成困扰，我们规定页面路径只能是五层，请尽量避免多层级的交互方式。
