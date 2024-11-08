class ThreadSafeSingleton{
  private static ThreadSafeSingleton instance;

  private ThreadSafeSingleton(){}

  //Synchronized method to control access
  //Make the default constructor private, to prevent other objects from using the new operator with the Singleton class.
  public static synchronized ThreadSafeSingleton getInstance(){
    if(instance == null){
      instance = new ThreadSafeSingleton();
    }
    return instance;
  }
}
public class SingletonThreadSafe {
  public static void main(String[] args){
    ThreadSafeSingleton obj1 = ThreadSafeSingleton.getInstance();
    ThreadSafeSingleton obj2 = ThreadSafeSingleton.getInstance();
    System.out.println(obj1.hashCode());
    System.out.println(obj2.hashCode());
  }
}
