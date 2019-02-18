在src目录
```
$ tree
.
├── Main.java
└── xyz
    └── bitfish
        └── Fish.java

$ javac Main.java
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

当我们执行java Main的时候，除了系统自带的，它会从当前目录(java执行目录)搜索用户的包

但是，如果我们尝试从上一级目录来执行的话，会发生什么？
```
$ cd ..
packages $ java src/Main
Error: Could not find or load main class src.Main
Caused by: java.lang.NoClassDefFoundError: Main (wrong name: src/Main)

packages $ java Main -d ./src
Error: Could not find or load main class Main
Caused by: java.lang.ClassNotFoundException: Main
```
it throw an error!
java 的行为很奇怪，我是不懂的。

```
package $ java -cp src Main
hello world
```
你不能跟他说去src目录寻找Main，而是要和他说src目录里面有我的包，你去找吧

而且他的命令机制很奇怪，这样写不行。。。
```
$ java Main -cp src 
Error: Could not find or load main class Main
Caused by: java.lang.ClassNotFoundException: Main
```

