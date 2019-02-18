# package
我是被它搞炸了，我这次要彻底弄懂

用户自定义的包通过这种方式查找
The default value, ".", meaning that user class files are all the class files in the current directory (or under it, if in a package).
The value of the CLASSPATH environment variable, which overrides the default value.
The value of the -cp or -classpath command line option, which overrides both the default value and the CLASSPATH value.
The JAR archive specified by the -jar option, which overrides all other values. If this option is used, all user classes must come from the specified archive.

https://docs.oracle.com/javase/8/docs/technotes/tools/findingclasses.html

我现在是明白了
- js python 的模块管理机制是通过文件系统来的
  而且import一个包的时候就是相当于生成一个模块对象，你可以把它赋值给一个变量，然后自己用

- 而java中的是基于包管理机制的，它的包是扁平化，所有的包都是平级的
  - java.lang.*
  - xyz.bitfish.*
  JVM通过相关的规则找到它们之后，它们就在同一个层级，就想到与都在一个目录下面，所以Java强调大家都用自己的域名来命名包。。。。。

souga 。。。。


## 其他
默认导入 java.lang这个包

java工程化太强了，很多概念不适合新手理解


