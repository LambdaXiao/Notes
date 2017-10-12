��ÿ��ʹ�� Git �����Ǻܶ�����ǲ�ס��
һ����˵���ճ�ʹ��ֻҪ��ס��ͼ6������Ϳ����ˡ���������ʹ�ã�����Ҫ��ס60��100�����

![image](https://github.com/x1971481259/Notes/screenshot/gitflows.png)

������������ĳ��� Git �����嵥������ר�����ʵ��������¡�

Workspace��������
Index / Stage���ݴ���
Repository���ֿ������򱾵زֿ⣩
Remote��Զ�ֿ̲�

һ���½������

# �ڵ�ǰĿ¼�½�һ��Git�����
$ git init

# �½�һ��Ŀ¼�������ʼ��ΪGit�����
$ git init [project-name]

# ����һ����Ŀ����������������ʷ
$ git clone [url]

��������

Git�������ļ�Ϊ.gitconfig�����������û���Ŀ¼�£�ȫ�����ã���Ҳ��������ĿĿ¼�£���Ŀ���ã���

# ��ʾ��ǰ��Git����
$ git config --list

# �༭Git�����ļ�
$ git config -e [--global]

# �����ύ����ʱ���û���Ϣ
$ git config [--global] user.name "[name]"
$ git config [--global] user.email "[email address]"

��������/ɾ���ļ�


# ���ָ���ļ����ݴ���
$ git add [file1] [file2] ...

# ���ָ��Ŀ¼���ݴ�����������Ŀ¼
$ git add [dir]

# ��ӵ�ǰĿ¼�������ļ����ݴ���
$ git add .

# ɾ���������ļ������ҽ����ɾ�������ݴ���
$ git rm [file1] [file2] ...

# ֹͣ׷��ָ���ļ��������ļ��ᱣ���ڹ�����
$ git rm --cached [file]

# �����ļ������ҽ�������������ݴ���
$ git mv [file-original] [file-renamed]

�ġ������ύ

# �ύ�ݴ������ֿ���
$ git commit -m [message]

# �ύ�ݴ�����ָ���ļ����ֿ���
$ git commit [file1] [file2] ... -m [message]

# �ύ���������ϴ�commit֮��ı仯��ֱ�ӵ��ֿ���
$ git commit -a

# �ύʱ��ʾ����diff��Ϣ
$ git commit -v

# ʹ��һ���µ�commit�������һ���ύ
# �������û���κ��±仯����������д��һ��commit���ύ��Ϣ
$ git commit --amend -m [message]

# ������һ��commit��������ָ���ļ����±仯
$ git commit --amend [file1] [file2] ...

�塢��֧

# �г����б��ط�֧
$ git branch

# �г�����Զ�̷�֧
$ git branch -r

# �г����б��ط�֧��Զ�̷�֧
$ git branch -a

# �½�һ����֧������Ȼͣ���ڵ�ǰ��֧
$ git branch [branch-name]

# �½�һ����֧�����л����÷�֧
$ git checkout -b [branch]

# �½�һ����֧��ָ��ָ��commit
$ git branch [branch] [commit]

# �½�һ����֧����ָ����Զ�̷�֧����׷�ٹ�ϵ
$ git branch --track [branch] [remote-branch]

# �л���ָ����֧�������¹�����
$ git checkout [branch-name]

# ����׷�ٹ�ϵ�������з�֧��ָ����Զ�̷�֧֮��
$ git branch --set-upstream [branch] [remote-branch]

# �ϲ�ָ����֧����ǰ��֧
$ git merge [branch]

# ѡ��һ��commit���ϲ�����ǰ��֧
$ git cherry-pick [commit]

# ɾ����֧
$ git branch -d [branch-name]

# ɾ��Զ�̷�֧
$ git push origin --delete [branch-name]
$ git branch -dr [remote/branch]

������ǩ

# �г�����tag
$ git tag

# �½�һ��tag�ڵ�ǰcommit
$ git tag [tag]

# �½�һ��tag��ָ��commit
$ git tag [tag] [commit]

# �鿴tag��Ϣ
$ git show [tag]

# �ύָ��tag
$ git push [remote] [tag]

# �ύ����tag
$ git push [remote] --tags

# �½�һ����֧��ָ��ĳ��tag
$ git checkout -b [branch] [tag]

�ߡ��鿴��Ϣ


# ��ʾ�б�����ļ�
$ git status

# ��ʾ��ǰ��֧�İ汾��ʷ
$ git log

# ��ʾcommit��ʷ���Լ�ÿ��commit����������ļ�
$ git log --stat

# ��ʾĳ���ļ��İ汾��ʷ�������ļ�����
$ git log --follow [file]
$ git whatchanged [file]

# ��ʾָ���ļ���ص�ÿһ��diff
$ git log -p [file]

# ��ʾָ���ļ���ʲô����ʲôʱ���޸Ĺ�
$ git blame [file]

# ��ʾ�ݴ����͹������Ĳ���
$ git diff

# ��ʾ�ݴ�������һ��commit�Ĳ���
$ git diff --cached [file]

# ��ʾ�������뵱ǰ��֧����commit֮��Ĳ���
$ git diff HEAD

# ��ʾ�����ύ֮��Ĳ���
$ git diff [first-branch]...[second-branch]

# ��ʾĳ���ύ��Ԫ���ݺ����ݱ仯
$ git show [commit]

# ��ʾĳ���ύ�����仯���ļ�
$ git show --name-only [commit]

# ��ʾĳ���ύʱ��ĳ���ļ�������
$ git show [commit]:[filename]

# ��ʾ��ǰ��֧����������ύ
$ git reflog

�ˡ�Զ��ͬ��

# ����Զ�ֿ̲�����б䶯
$ git fetch [remote]

# ��ʾ����Զ�ֿ̲�
$ git remote -v

# ��ʾĳ��Զ�ֿ̲����Ϣ
$ git remote show [remote]

# ����һ���µ�Զ�ֿ̲⣬������
$ git remote add [shortname] [url]

# ȡ��Զ�ֿ̲�ı仯�����뱾�ط�֧�ϲ�
$ git pull [remote] [branch]

# �ϴ�����ָ����֧��Զ�ֿ̲�
$ git push [remote] [branch]

# ǿ�����͵�ǰ��֧��Զ�ֿ̲⣬��ʹ�г�ͻ
$ git push [remote] --force

# �������з�֧��Զ�ֿ̲�
$ git push [remote] --all

�š�����


# �ָ��ݴ�����ָ���ļ���������
$ git checkout [file]

# �ָ�ĳ��commit��ָ���ļ���������
$ git checkout [commit] [file]

# �ָ���һ��commit�������ļ���������
$ git checkout .

# �����ݴ�����ָ���ļ�������һ��commit����һ�£�������������
$ git reset [file]

# �����ݴ����빤����������һ��commit����һ��
$ git reset --hard

# ���õ�ǰ��֧��ָ��Ϊָ��commit��ͬʱ�����ݴ�����������������
$ git reset [commit]

# ���õ�ǰ��֧��HEADΪָ��commit��ͬʱ�����ݴ����͹���������ָ��commitһ��
$ git reset --hard [commit]

# ���õ�ǰHEADΪָ��commit���������ݴ����͹���������
$ git reset --keep [commit]

# �½�һ��commit����������ָ��commit
# ���ߵ����б仯������ǰ�ߵ���������Ӧ�õ���ǰ��֧
$ git revert [commit]

ʮ������

# ����һ���ɹ�������ѹ����
$ git archive