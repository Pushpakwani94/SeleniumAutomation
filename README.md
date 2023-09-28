=================================unix==============================

ls
cd
cp
mv
more 
head
tail
ls -a
ls -al
chmod
date
cal
pwd
clear
cat
touch
mkdir
rmdir
Grep
ps 
top
rm file – delete file
rm -r dir – delete directory dir
rm -f file – force remove file
rm -rf dir – force remove directory dir *
cp file1 file2 – copy file1 to file2





========================================Git===================================


git config –global user.name “[name]” 
git config –global user.email “[email address]” 

git config --list

diff.astextplain.textconv=astextplain
filter.lfs.clean=git-lfs clean -- %f
filter.lfs.smudge=git-lfs smudge -- %f
filter.lfs.process=git-lfs filter-process
filter.lfs.required=true
http.sslbackend=openssl
http.sslcainfo=C:/Program Files/Git/mingw64/etc/ssl/certs/ca-bundle.crt
core.autocrlf=true
core.fscache=true
core.symlinks=false
pull.rebase=false
credential.helper=manager
credential.https://dev.azure.com.usehttppath=true
init.defaultbranch=master
user.name=pushpak
user.email=wanipushpak76@gmail.com
core.repositoryformatversion=0
core.filemode=false
core.bare=false
core.logallrefupdates=true
core.symlinks=false
core.ignorecase=true
gui.wmstate=normal
gui.geometry=1322x693+422+84 254 315
remote.origin.url=https://github.com/Pushpakwani94/SeleniumAutomation.git
remote.origin.fetch=+refs/heads/*:refs/remotes/origin/*
branch.pushpak.remote=origin
branch.pushpak.merge=refs/heads/pushpak
 


git remote -v
origin  https://github.com/Pushpakwani94/SeleniumAutomation.git (fetch)
origin  https://github.com/Pushpakwani94/SeleniumAutomation.git (push)


Setting up a repository
Git init
git add .
git Status
git restore --staged .
git add filename
git commit -m ""
git commit --amend -m "an updated commit message"
git remote add origin RepoUrl
git pull

Undoing changes
git clean
git revert
git reset
git rm

Using branches

git branch

creating New Branch
    git checkout -b branchName
Switching branches
   git checkout <branchname>
   
 git branch -m <branch>	     Moves or renames the current branch to <branch>.
 git branch -a	Lists all the remote branches.
 
 
 ======================================Maven=============================
 cls
 mvn clean          Compiles source code of the project
 mvn compile        Compiles the test source code.
 mvn test           Runs tests for the project.
 mvn package
 mvn install
 mvn site
 mvn validate
 mvn idea:idea
 mvn release
 mvn deploy
 mvn archetype:generate:
 mvn dependency:tree
 =================================================================
 
