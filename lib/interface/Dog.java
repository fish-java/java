public class Dog extends Canine{
    public static void main(String[] args){
        Dog dog = new Dog("Bob");
        dog.mark();
    } 

    public String name;
    Dog(String name){
        this.name = name;
    }

    // 为什么这里访问修饰符不需要相同？
    public void mark(){
        System.out.println(this.name + " is marking");
    }
}

abstract class Canine{
    abstract void mark();
}