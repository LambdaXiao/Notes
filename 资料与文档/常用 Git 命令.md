我每天使用 Git ，但是很多命令记不住。
一般来说，日常使用只要记住下图6个命令，就可以了。但是熟练使用，恐怕要记住60～100个命令。

![Image text](https://github.com/x1971481259/Notes/raw/master/screenshot/gitflows.png)

下面是我整理的常用 Git 命令清单。几个专用名词的译名如下。

Workspace：工作区
Index / Stage：暂存区
Repository：仓库区（或本地仓库）
Remote：远程仓库

# 一、新建代码库

在当前目录新建一个Git代码库

> $ git init

#新建一个目录，将其初始化为Git代码库

$ git init [project-name]

#下载一个项目和它的整个代码历史

$ git clone [url]

# 二、配置

Git的设置文件为.gitconfig，它可以在用户主目录下（全局配置），也可以在项目目录下（项目配置）。

#显示当前的Git配置

$ git config --list

#编辑Git配置文件

$ git config -e [--global]

#设置提交代码时的用户信息

$ git config [--global] user.name "[name]"
$ git config [--global] user.email "[email address]"

# 三、增加/删除文件


#添加指定文件到暂存区

$ git add [file1] [file2] ...

#添加指定目录到暂存区，包括子目录

$ git add [dir]

#添加当前目录的所有文件到暂存区

$ git add .

$ git add -u //提交被修改和被删除文件，不包括新文件

#删除工作区文件，并且将这次删除放入暂存区

$ git rm [file1] [file2] ...

#停止追踪指定文件，但该文件会保留在工作区

$ git rm --cached [file]

#改名文件，并且将这个改名放入暂存区

$ git mv [file-original] [file-renamed]

# 四、代码提交

#提交暂存区到仓库区

$ git commit -m [message]

#提交暂存区的指定文件到仓库区

$ git commit [file1] [file2] ... -m [message]

#提交工作区自上次commit之后的变化，直接到仓库区

$ git commit -a

#提交时显示所有diff信息

$ git commit -v

#使用一次新的commit，替代上一次提交

#如果代码没有任何新变化，则用来改写上一次commit的提交信息

$ git commit --amend -m [message]

#重做上一次commit，并包括指定文件的新变化

$ git commit --amend [file1] [file2] ...

# 五、分支

#列出所有本地分支

$ git branch

#列出所有远程分支

$ git branch -r

#列出所有本地分支和远程分支

$ git branch -a

#新建一个分支，但依然停留在当前分支

$ git branch [branch-name]

#新建一个分支，并切换到该分支

$ git checkout -b [branch]

#新建一个分支，指向指定commit

$ git branch [branch] [commit]

#新建一个分支，与指定的远程分支建立追踪关系

$ git branch --track [branch] [remote-branch]

#切换到指定分支，并更新工作区

$ git checkout [branch-name]

#建立追踪关系，在现有分支与指定的远程分支之间

$ git branch --set-upstream [branch] [remote-branch]

#合并指定分支到当前分支

$ git merge [branch]

#选择一个commit，合并进当前分支

$ git cherry-pick [commit]

#删除分支

$ git branch -d [branch-name]

#强制删除分支，尤其适用于内容有了新修改单没合并的情况

$ git branch -D [branch-name]

#变基操作

$ git rebase 目标分支

#删除远程分支

$ git push origin --delete [branch-name]
$ git branch -dr [remote/branch]

# 六、标签

#列出所有tag

$ git tag

#新建一个tag在当前commit

$ git tag [tag]

#新建一个tag在指定commit

$ git tag [tag] [commit]

#查看tag信息

$ git show [tag]

#提交指定tag

$ git push [remote] [tag]

#提交所有tag

$ git push [remote] --tags

#新建一个分支，指向某个tag

$ git checkout -b [branch] [tag]

# 七、查看信息


#显示有变更的文件

$ git status

#显示当前分支的版本历史

$ git log

#显示commit历史，以及每次commit发生变更的文件

$ git log --stat

#显示某个文件的版本历史，包括文件改名

$ git log --follow [file]
$ git whatchanged [file]

#显示指定文件相关的每一次diff

$ git log -p [file]

$ git log --pretty=oneline //单行显示提交信息：hash、commit信息

$ git reflog //提交信息：hash、commit信息

#显示指定文件是什么人在什么时间修改过

$ git blame [file]

#显示暂存区和工作区的差异

$ git diff

#显示暂存区和上一个commit的差异

$ git diff --cached [file]

#显示工作区与当前分支最新commit之间的差异

$ git diff HEAD

#显示两次提交之间的差异

$ git diff [first-branch]...[second-branch]

#显示某次提交的元数据和内容变化

$ git show [commit]

#显示某次提交发生变化的文件

$ git show --name-only [commit]

#显示某次提交时，某个文件的内容

$ git show [commit]:[filename]

#显示当前分支的最近几次提交

$ git reflog

#显示分支合并图

$ git  log --graph

# 八、远程同步

#下载远程仓库的所有变动

$ git fetch [remote]

#显示所有远程仓库

$ git remote -v

#显示某个远程仓库的信息

$ git remote show [remote]

#增加一个新的远程仓库，并命名

$ git remote add [shortname] [url]

$ git remote add origin git@github.com:Wbiokr/chatApp.git

#取回远程仓库的变化，并与本地分支合并

$ git pull [remote] [branch]

#上传本地指定分支到远程仓库

$ git push [remote] [branch]

#强行推送当前分支到远程仓库，即使有冲突

$ git push [remote] --force

#推送所有分支到远程仓库

$ git push [remote] --all

# 九、撤销


#恢复暂存区的指定文件到工作区

$ git checkout [file]

#恢复某个commit的指定文件到工作区和暂存区

$ git checkout [commit] [file]

#恢复暂存区的所有文件到工作区

$ git checkout .

#重置暂存区的指定文件，与上一次commit保持一致，但工作区不变

$ git reset [file]

#重置暂存区与工作区，与上一次commit保持一致

$ git reset --hard

#重置当前分支的指针为指定commit，同时重置暂存区，但工作区不变

$ git reset [commit]

#重置当前分支的HEAD为指定commit，同时重置暂存区和工作区，与指定commit一致

$ git reset --hard [commit]

#重置当前HEAD为指定commit，但保持暂存区和工作区不变

$ git reset --keep [commit]

#新建一个commit，用来撤销指定commit

#后者的所有变化都将被前者抵消，并且应用到当前分支

$ git revert [commit]

# 十、修改存储

#把当前分支的工作现场存储起来，等以后恢复现场后继续工作，适用于还没有添加到暂存区的分支代码

$ git stash

#查看存储的工作现场记录列表

$ git stash list

#恢复最近stash的工作现场，但是恢复后，stash内容并不删除。后面可以加stash_id 或stash@{num}

$ git stash apply

#删除最近stash的工作现场，后面可以加stash_id 或stash@{num}

$ git stash drop

#相当于上面两条命令，后面可以加stash_id 或stash@{num}

$ git stash pop

#清空所有暂存区的stash记录

$ git stash clear

# 使用gitlab,安装git后获取公钥key
$ ssh-keygen

$ cat ~/.ssh/

$ cat ~/.ssh/id_rsa.pub

另外在C:\Windows\System32\drivers\etc\hosts 添加代码远程服务器地址

# Git 使用vi或vim命令打开、关闭、保存文件

1、vi & vim 有两种工作模式：

（1） 命令模式：接受、执行 vi & vim 操作命令的模式，打开文件后的默认模式；

（2） 编辑模式：对打开的文件内容进行 增、删、改 操作的模式；

  #在编辑模式下按下 ESC 键，回退到命令模式。

2、创建、打开文件：$ vi [filename]

（1）使用 vi 加 文件路径（或文件名）的模式打开文件，如果文件存在则打开现有文件，如果文件不存在则新建文件，并在终端最下面一行显示打开的是一个新文件。

（2）键盘输入字母 “i”或“Insert”键进入最常用的插入编辑模式。

3、保存文件：

（1）在插入编辑模式下编辑文件。

（2）按下 “ESC” 键，退出编辑模式，切换到命令模式。

（3）在命令模式下键入"ZZ"或者":wq"保存修改并且退出 vi 。

（4）如果只想保存文件，则键入":w"，回车后底行会提示写入操作结果，并保持停留在命令模式。

4、放弃所有文件修改：

（1）放弃所有文件修改：按下 "ESC" 键进入命令模式，键入 ":q!" 回车后放弃修改并退出vi。

（2）放弃所有文件修改，但不退出 vi ，即回退到文件打开后最后一次保存操作的状态，继续进行文件操作：按下 "ESC" 键进入命令模式，键入 ":e!" ，回车后回到命令模式。

●  底行模式 

  :w  保存    : w filenme   另存为
  ：q  退出
  ：wq 保存并退出
  ：e！ 撤销更改返回到上一次保存状态
  ：q！不保存强制退出
  ：set nu 设置行号
  
  ●  命令模式
  
   ZZ（大写）保存并退出
   u 辙销操作，可多次使用
   dd 删除当前行
   yy 复制当前行
   p 粘贴内容
   ctrl+f 向前翻页
   ctrl+b 向后翻页
   
   敲 i 进入编辑模式，当前光标处插入
   
   敲 a 进入编辑模式，当前光标后插入
   敲 A 进入编辑模式，光标移动到行尾
   
   敲 o 进入编辑模式，当前行下面插入新行
   敲 O 进入编辑模式，当前行上面插入新行

  ●  编辑模式 

  当我们处在编辑模式的情况下，和我们在Windows编辑器的使用相似。
  
 # git bash中的快捷键
 
 tab 自动补全，连按两次会将所有匹配内容显示出来

 history 查看操作历史

 pwd (Print Working Directory) 查看当前目录
 
 cd (Change Directory) 切换目录，如 cd /etc

ls (List) 查看当前目录下内容，如 ls -al

mkdir (Make Directory) 创建目录，如 mkdir blog

touch 创建文件，如 touch index.html

cat 查看文件全部内容，如 cat index.html

Ctrl + l：清屏
