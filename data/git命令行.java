初始化git仓库

git init 
///输出：Initialized empty Git repository in /home/jin/Documents/gitLearn/.git/
///则于指定位置初始化了一个空仓库，会自动创建.git文件。文件中.gitnore则用来排除指定文件夹/文件提交到变化中


添加变化
git add . //提交所有新增文件和变化文件，不包括被删除文件

git add * //功能同上

git add -u //提交被修改和被删除文件，不包括新文件

git add -A //提交所有变化

git add a.txt //提交a.txt

//git add命令可以提交多次，在git commit之前，告诉git，把文件添加到仓库暂存区


提交变化
git commit -m 'commit备注'
//git commit命令即为一次性把暂存区的修改往当前分支(master/branch)提交，备注一定要写，不然commit会被拒绝

git状态
git status //git add,git commit这些状态使用git status命令即可查看状态

查看日志
git log //显示每一次提交的信息：作者、日期、hash、commit信息

git log --pretty=oneline //单行显示提交信息：hash、commit信息

git reflog //提交信息：hash、commit信息

版本控制
git reset --hard HEAD^ //仓库文件回退到上一commit版本

git reset --hard 35f69c //版本回滚到hash值35f69c开头的commit版本

git reset HEAD a.txt //把暂存区中a.txt的修改撤销掉，放回工作区

查看代码修改的内容
git diff  <file>
如果该文件已暂存，那么应该使用
git diff –cached<file>

远程分支
git remote add origin git@github.com:Wbiokr/chatApp.git
//关联远程库chatApp.git

git push - u origin master 
//第一次推送本地仓库到远程仓库

git push origin master
//之后的推送

git pull --rebase origin master//(不加这句可能报错出现错误的主要原因是github中的README.md文件不在本地代码目录中
　　可以通过该命令进行代码合并
或
git pull origin master
//从远程分支获取最新版本并merge到本地

git fetch origin master
//从远程分支获取最新版本但不会merge


git 命令合并分支代码
对于复杂的系统，我们可能要开好几个分支来开发，那么怎样使用git合并分支呢？

合并步骤：

1、进入要合并的分支（如开发分支合并到master，则进入master目录）

git pull

2、查看所有分支是否都pull下来了

git branch -a

3、使用merge合并开发分支

git merge 分支名

4、查看合并之后的状态

git status 

5、有冲突的话，通过IDE解决冲突；

6、解决冲突之后，将冲突文件提交暂存区

git add 冲突文件

7、提交merge之后的结果

git commit 

如果不是使用git commit -m "备注" ，那么git会自动将合并的结果作为备注，提交本地仓库；

8、本地仓库代码提交远程仓库

git push


git将分支合并到分支，将master合并到分支的操作步骤是一样的；

切换分支：git checkout name
撤销修改：git checkout -- file
删除文件：git rm file
查看状态：git status
添加记录：git add file 或 git add .
添加描述：git commit -m "miao shu nei rong"
同步数据：git pull
提交数据：git push origin name
分支操作
查看分支：git branch
创建分支：git branch name
切换分支：git checkout name
创建+切换分支：git checkout -b name
        合并某分支到当前分支：git merge name
删除分支：git branch -d name
删除远程分支：git push origin :name