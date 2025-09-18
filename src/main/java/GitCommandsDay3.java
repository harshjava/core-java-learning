
package main.java;

public class GitCommandsDay3 {

    /*
    1. How to create repository through Git hub and Intellije
    2. How to Create branch and add and commit and push

            GitCommandsDay3
    Try the new cross-platform PowerShell https://aka.ms/pscore6

    PS D:\Projects\prepration\core-java-learning> git remote add origin https://github.com/harshjava/core-java-learning.git
    PS D:\Projects\prepration\core-java-learning> git branch -M main
    error: src refspec main does not match any
    PS D:\Projects\prepration\core-java-learning> git branch
    error: src refspec master does not match any
    error: failed to push some refs to 'https://github.com/harshjava/core-java-learning.git'
    PS D:\Projects\prepration\core-java-learning> git branch -m master main
    fatal: no branch named 'master'
    PS D:\Projects\prepration\core-java-learning> git add .
    warning: in the working copy of 'src/Main.java', LF will be replaced by CRLF the next time Git touches it
    PS D:\Projects\prepration\core-java-learning> git commit -m "Initial commit"
            [main (root-commit) 74e7856] Initial commit
 24 files changed, 153 insertions(+)
    create mode 100644 .idea/.gitignore
    create mode 100644 .idea/misc.xml
    create mode 100644 .idea/modules.xml
    create mode 100644 .idea/vcs.xml
    create mode 100644 core-java-learning.iml
    create mode 100644 core-java.iml
    create mode 100644 out/production/core-java-learning/Main.class
    create mode 100644 out/production/core-java-learning/main/java/FirstDayExamples.class
    create mode 100644 out/production/core-java-learning/main/java/FirstDayLocalVar.class
    create mode 100644 out/production/core-java-learning/main/java/FirstInstanceVariableDemo.class
    create mode 100644 out/production/core-java-learning/main/java/FirstStaticVariable.class
    create mode 100644 out/production/core-java-learning/main/java/SecondDay.class
    create mode 100644 out/production/core-java/Main.class
    create mode 100644 out/production/core-java/main/java/FirstDayExamples.class
    create mode 100644 out/production/core-java/main/java/FirstDayLocalVar.class
    create mode 100644 out/production/core-java/main/java/FirstInstanceVariableDemo.class
    create mode 100644 out/production/core-java/main/java/FirstStaticVariable.class
    create mode 100644 src/Main.java
    create mode 100644 src/main/java/FirstDayExamples.java
    create mode 100644 src/main/java/FirstInstanceVariableDemo.java
    create mode 100644 src/main/java/FirstStaticVariable.java
    create mode 100644 src/main/java/SecondDay.java
    PS D:\Projects\prepration\core-java-learning> git push -u origin main
    remote: {"auth_status":"access_denied_to_user","body":"Permission to harshjava/core-java-learning.git denied to Khushboo2809."}
    fatal: unable to access 'https://github.com/harshjava/core-java-learning.git/': The requested URL returned error: 403
    PS D:\Projects\prepration\core-java-learning> git push -u origin main
    info: please complete authentication in your browser...
    Enumerating objects: 28, done.
    Counting objects: 100% (28/28), done.
    Delta compression using up to 4 threads
    Writing objects: 100% (28/28), 5.76 KiB | 310.00 KiB/s, done.
            Total 28 (delta 1), reused 0 (delta 0), pack-reused 0 (from 0)
    remote: Resolving deltas: 100% (1/1), done.
    To https://github.com/harshjava/core-java-learning.git
            * [new branch]      main -> main
    branch 'main' set up to track 'origin/main'.
    PS D:\Projects\prepration\core-java-learning> git status
    On branch main
    Your branch is up to date with 'origin/main'.

    Changes not staged for commit:
            (use "git add/rm <file>..." to update what will be committed)
            (use "git restore <file>..." to discard changes in working directory)
    deleted:    out/production/core-java-learning/Main.class
    deleted:    out/production/core-java-learning/main/java/FirstDayExamples.class
    deleted:    out/production/core-java-learning/main/java/FirstDayLocalVar.class
    deleted:    out/production/core-java-learning/main/java/FirstInstanceVariableDemo.class
    deleted:    out/production/core-java-learning/main/java/FirstStaticVariable.class
    deleted:    out/production/core-java-learning/main/java/SecondDay.class
    deleted:    out/production/core-java/Main.class
    deleted:    out/production/core-java/main/java/FirstDayLocalVar.class
    deleted:    out/production/core-java/main/java/FirstInstanceVariableDemo.class
    deleted:    out/production/core-java/main/java/FirstStaticVariable.class
    no changes added to commit (use "git add" and/or "git commit -a")
    PS D:\Projects\prepration\core-java-learning> git add
    Nothing specified, nothing added.
            hint: Maybe you wanted to say 'git add .'?
    hint: Disable this message with "git config advice.addEmptyPathspec false"
    PS D:\Projects\prepration\core-java-learning> git add out/
    PS D:\Projects\prepration\core-java-learning> git status
    On branch main
    Your branch is up to date with 'origin/main'.

    Changes to be committed:
            (use "git restore --staged <file>..." to unstage)
    deleted:    out/production/core-java-learning/Main.class
    deleted:    out/production/core-java-learning/main/java/FirstDayExamples.class
    deleted:    out/production/core-java-learning/main/java/FirstDayLocalVar.class
    deleted:    out/production/core-java-learning/main/java/FirstInstanceVariableDemo.class
    deleted:    out/production/core-java-learning/main/java/FirstStaticVariable.class
    deleted:    out/production/core-java-learning/main/java/SecondDay.class
    deleted:    out/production/core-java/main/java/FirstDayExamples.class
    deleted:    out/production/core-java/main/java/FirstInstanceVariableDemo.class
    deleted:    out/production/core-java/main/java/FirstStaticVariable.class
    deleted:    out/production/core-java/main/java/SecondDay.class

    PS D:\Projects\prepration\core-java-learning> git commit "Removed extra file"
    error: pathspec 'Removed extra file' did not match any file(s) known to git
    PS D:\Projects\prepration\core-java-learning> git commit -m "Removed extra file"
            [main 081452a] Removed extra file
 12 files changed, 0 insertions(+), 0 deletions(-)
    delete mode 100644 out/production/core-java-learning/Main.class
    delete mode 100644 out/production/core-java-learning/main/java/FirstDayExamples.class
    delete mode 100644 out/production/core-java-learning/main/java/FirstDayLocalVar.class
    delete mode 100644 out/production/core-java-learning/main/java/FirstInstanceVariableDemo.class
    delete mode 100644 out/production/core-java-learning/main/java/FirstStaticVariable.class
    delete mode 100644 out/production/core-java/Main.class
    delete mode 100644 out/production/core-java/main/java/FirstDayExamples.class
    delete mode 100644 out/production/core-java/main/java/FirstDayLocalVar.class
    delete mode 100644 out/production/core-java/main/java/FirstInstanceVariableDemo.class
    delete mode 100644 out/production/core-java/main/java/FirstStaticVariable.class
    delete mode 100644 out/production/core-java/main/java/SecondDay.class
    PS D:\Projects\prepration\core-java-learning> git push
    Enumerating objects: 3, done.
    Counting objects: 100% (3/3), done.
    Delta compression using up to 4 threads
    Compressing objects: 100% (2/2), done.
    Writing objects: 100% (2/2), 231 bytes | 231.00 KiB/s, done.
            Total 2 (delta 1), reused 0 (delta 0), pack-reused 0 (from 0)
    remote: Resolving deltas: 100% (1/1), completed with 1 local object.
    To https://github.com/harshjava/core-java-learning.git
            74e7856..081452a  main -> main
    PS D:\Projects\prepration\core-java-learning>

}
*/
}