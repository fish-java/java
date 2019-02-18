public class Cat implements Runable{
    public static void main(){
        Cat cat = new Cat("Bob");
        cat.run();
    } 

    public String name;
    Cat(String name){
        this.name = name;
    }
    // 继承接口的时候，不要忘记啊访问修饰符, 这个也要相同
    public void run(){
        System.out.println(this.name + " is running");
    }
}

interface Runable{
    public void run();
}