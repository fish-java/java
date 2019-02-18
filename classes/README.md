# 多个类
如果有多个类，如何相互引用？
就是这一步，坑了我好久
``` bash
$ ls
Dog.java Main.java  README.md
$ javac Main.java
$ ls
Dog.class  Dog.java   Main.class Main.java  README.md

$ java Main
Bob is marking
```
可以看到，如果类在同一个目录的话：
- javac的时候可以识别，不需要手动import
- java执行的时候，也可以自动寻找

这和JS Python基于文件的模块化很不一样

为什么不一样？ 那个好一点？ 以后再说。。。
