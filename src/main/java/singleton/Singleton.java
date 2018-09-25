package singleton;

public class Singleton {

  private static volatile Singleton instance = null;

  private Singleton() {
    //non instantiable
  }

  public static Singleton instance() {
    if (instance == null) {
      synchronized (Singleton.class) {  // only first few threads will require synchronization
        if (instance == null) {
          instance = new Singleton();
        }
      }
    }
    return instance;
  }
}
