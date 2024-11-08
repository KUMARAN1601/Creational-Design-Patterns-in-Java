class SingletonClass{
  private static SingletonClass instance;

  //Private Constructor
  //Make the default constructor private, to prevent other objects from using the new operator with the Singleton class.
  private SingletonClass() {}

  public static SingletonClass getInstance(){
    if(instance == null){
      instance = new SingletonClass();
    }
    return instance;
  }
}
public class MainSingleton{
    public static void main(String[] args){
    SingletonClass obj1 = SingletonClass.getInstance();
    SingletonClass obj2 = SingletonClass.getInstance();
    System.out.println(obj1.hashCode());
    System.out.println(obj2.hashCode());
  }
}

