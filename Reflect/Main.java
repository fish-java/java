import life.Person;

public class Main { 
  public static void main(String[] args) throws ClassNotFoundException { 
                   // 按照和javac一样的规则查找类
    Class person = Class.forName("life.Person");
    Constructor con = person.getConstructor(null);
    Person p = con.newInstance(null);
    p.sayHi();
  } 
}