# package
我是被它搞炸了，我这次要彻底弄懂

在src目录
```
$ tree
.
├── Main.java
└── xyz
    └── bitfish
        └── Fish.java

$ javac Main.java -d .
$ tree
.
├── Main.class
├── Main.java
└── xyz
    └── bitfish
        ├── Fish.class
        └── Fish.java

$ java Main
hello world
```
包的查找规则
- 首先寻找classpath里面的
- 然后寻找用户自定义的，这一步要记得使用-d 这个编译选项指明寻找包的基本路径！！！！
- 真的坑，难道不是应该默认使用当前路径？
- 更加可怕的是，java执行.class文件的时候又不需要指明路径了。。。。两者机制不一样？

在src.1 目录
```
$ javac Main.java -d .
$ java Main           
hello world
hi, I am a Bird
```

## 其他
默认导入 java.lang这个包

java工程化太强了，很多概念不适合新手理解
