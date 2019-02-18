```
src.1 $ javac Main.java
$ tree
.
├── Main.java
├── README.md
├── com
│   └── github
│       ├── Bird.class
│       └── Bird.java
├── dist
│   └── Main.class
└── xyz
    └── bitfish
        ├── Fish.class
        └── Fish.java
```

这是你要回事向执行的话，必须同时指定两个class path
```
src.1 $ java -cp ./dist:. Main
hello world
hi, I am a Bird
```
一个classpath用于寻找Main，一个用来寻找相关的包