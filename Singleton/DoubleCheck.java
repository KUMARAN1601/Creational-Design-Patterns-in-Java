class DoubleCheckedLockingSingleton{
  private static DoubleCheckedLockingSingleton instance;

  //Make the default constructor private, to prevent other objects from using the new operator with the Singleton class.
  private DoubleCheckedLockingSingleton(){}

  public static DoubleCheckedLockingSingleton getInstance(){
    if(instance == null){
      synchronized(DoubleCheckedLockingSingleton.class){
        if(instance == null){
          instance = new DoubleCheckedLockingSingleton();
        }
      }
    }
    return instance;
  }
}
public class DoubleCheck {
  public static void main(String[] args){
    DoubleCheckedLockingSingleton obj1 = DoubleCheckedLockingSingleton.getInstance();
    DoubleCheckedLockingSingleton obj2 = DoubleCheckedLockingSingleton.getInstance();
    System.out.println(obj1.hashCode());
    System.out.println(obj2.hashCode());
  }
}
