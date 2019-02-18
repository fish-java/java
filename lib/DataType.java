// 所有java文件有且只有一个public类。
public class DataType{
    public static void main(String args[]){
        char c = '#';
        boolean isMarried = true;
        byte age = 22;
        int weight = 4444444;
        long height = 34444444;

        // 不在结尾加上f，就会爆出 possible lossy conversion from double to float
        float life = 32.23f;
        double sight = 23.34234;

        // 我们创建了一个String对象的引用，而不必立刻给他初始化。
        String s;
        // 这是 s = new String("abc") 的缩写，对于基本数据类型， java js等提供了自动装箱的功能
        s = "abc";

        // 自动拆箱
        Integer a2 = new Integer(33);
        int a4 = a2;
        // js c c++中，子作用域可以声明同名（let），覆盖之前的；java中不允许
        {
            // int a4; error
            int a5;
        }
        // a5 = 6; error

        Person p1 = new Person((byte)22, "lishuai", "342422199610149999");
        System.out.println(p1.getIDCardNum());
        Person.sayHello();
        p1.sayHello();
    }
}

class Person{
    public byte age;
    public String name;
    private String IDCardNum;
    // 字段默认访问权限 https://bbs.csdn.net/topics/340056950
    
    Person(byte age, String name, String IDCardNum){
        this.age = age;
        this.name = name;
        this.IDCardNum = IDCardNum;
    }

    // static 成员为所有对象共享，很容易理解
    static void sayHello(){
        System.out.println("hello world");
    }

    public String getIDCardNum(){
        return this.IDCardNum;
    }
}