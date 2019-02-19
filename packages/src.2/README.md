```bash
# 如何创建自己的jar包？
# jar cf jar-file input-file(s)
jar cf ./dist/fish-bird.jar ./com/github/Bird.class

# 编译Main.java
javac -d ./dist Main.js
```

好了,./dist文件夹有我们的jar包和Main.class,那么如何执行呢？
``` bash
$ java -cp ./dist/* Main 
Error: Could not find or load main class ..dist.fish-bird.jar
Caused by: java.lang.ClassNotFoundException: //dist/fish-bird/jar
# faild

# 如何引用一个jar包
$ java -cp ./dist/fish-bird.jar:./dist Main
hi, I am a Bird
# success

# 如何引用一个文件夹下所有的jar包？
$ java -cp "./dist/*:./dist" Main
# success
# 哎，Java真的是low爆了，还必须加双引号

$ java -cp "./dist/*" Main
Error: Could not find or load main class Main
# 这也不行，真的很傻比，这垃圾编译器
# 真-面向Stack Overflow编程
```