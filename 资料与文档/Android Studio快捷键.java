在这里，自己整理了在使用AndroidStudio开发工具所使用到的一些快捷键，也出于在开发过程中节省时间提升效率，然而可能多数开发者之前使用的都是Eclipse开发工具，可能开始都不习惯，但是使用的时间长了就会习以为常了。

常用的快捷键如下:

用TAB代替ENTER，现有的方法或者变量将直接被替代。省去了很多麻烦

Ctrl+Alt+L :格式化代码对齐
Ctrl+Alt+O:清楚无效包引用

Ctrl+Alt+Space(空格):自动补全代码，类名和接口名提示
Ctrl+空格:代码感应提示
Ctrl+F12:可以显示当前文件的结构
Ctrl+O/i:调出重写方法  overide / implement
Shift+F6:类重命名
Alt+Enter:感应代码提示 例如方法转型

Ctrl+Alt+T：可以把代码包在一块内，例如try/catch
F2或Shift+F2:在高亮错误或警告快速定位

ALT-SHIFT-UP 和 ALT-SHIFT-DOWN则可以让你当前所在行上移或者下移，省去了通过复制粘贴调整顺序的麻烦。

Ctrl＋Shift＋Backspace 可以跳转到上次编辑的地方

Ctrl＋E，可以显示最近编辑的文件列表

Ctrl+R:替换文本


Ctrl+N:查找类

Ctrl+Shift+N:查找文件

Ctrl + 加号或减号 //收起或展示一个代码块

Ctrl+/:注释代码 格式：//代码块

Ctrl+Shift+/:注释多行代码 格式:/*代码块*/

Ctrl+Shift+Alt+N:查找类中的方法和变量

Ctrl+Shift+C:对比最近修改的代码

Ctrl+Alt+Left/Right:返回至上次浏览的位置

Ctrl+[或]：可以调到大括号的开头结尾

Ctrl+Shift+Backspace:可以跳转到上次编辑的地方

Ctrl+ALt+V:可以引入变量。例如把括号内的sql赋成一个变量

Ctrl+F7：可以查询当前元素在当前文件中的引用，然后按F3可以选择

Ctrl+J:自动代码

刚开始使用Android Studio时，在创建一个javabean时，很习惯的在JavaBean类中，右键去找生成get，set等选项。但是很遗憾，找不到。
那这边如何快速的set，get或者生成构造函数，生成toString方法。
有两种方式：
方式一：Code-->Generate
方式二：通过快捷键Alt+Insert

Ctrl+E:最近打开的文件

Ctrl+H:显示类结构图

Ctrl+F:查找文本

Ctrl+P:提示方法的参数信息

Ctrl+Q:光标选中方法显示该方法的详细参数信息

Ctrl+X:删除行

Ctrl+D:复制行

Shift+Alt+向上箭头：代码往上移

Shift+Alt+向下箭头：代码往下移

Alt+Insert:快速生成构造方法或是GET,SET方法

Alt+回车：导入包，自动修正

Alt+F1:查找代码所在的位置

Alt+l:快速打开或隐藏工程面板

Alt+Left/Right:切换代码视图

Alt+Up/Down:在方法间快速移动定位

Alt+Shift+K ：注释类说明<这里需自己设置：Settings-->点击Keymap-->在右边右上角搜索Other(fix doc comment)-->看到Fix doc comment 鼠标右键选择第一个，在输入框First Stroke输入ALT+SHIFT+K

创建类注释模板:setting-->Editor-->File and Code Templates -->Includes-->File Header

AndroidStudio Debug模式快捷键:

alt+f8 debug时选中查看值

f8相当于eclipse的f6跳到下一步

shift+f8相当于eclipse的f8跳到下一个断点，也相当于eclipse的f7跳出函数

f7相当于eclipse的f5就是进入到代码

alt+shift+f7这个是强制进入代码

ctrl+shift+f9 debug运行java类

ctrl+shift+f10正常运行java类

command+f2停止运行

Ctrl+k:提交svn

CTRL-J 来查看一个上下文拥有的所有后缀

ctrl+q   打开帮助文档

手动加入v7包:鼠标放在工程目录右键-OpenModuleSetting-Dependenices点击加号

Ctrl - Shift -F8 查看所有打断点的地方