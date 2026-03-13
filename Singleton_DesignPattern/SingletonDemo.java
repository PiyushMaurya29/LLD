package Singleton_DesignPattern;


class Singleton{
  static Singleton instance = new Singleton();
  private Singleton(){

  }
  public static Singleton getSingleton(){
    return instance;
  }
}
public class SingletonDemo {
  public static void main(String[] args) {
    Singleton instance1 = Singleton.getSingleton();
    Singleton instance2 = Singleton.getSingleton();


    System.out.println(instance1.equals(instance2));
    System.out.println(instance1.hashCode());
    System.out.println(instance2.hashCode());

  }
}
