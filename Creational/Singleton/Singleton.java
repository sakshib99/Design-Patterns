
public class Singleton {

 private static Singleton instance;

 private Singleton(){
    if(instance != null){
        throw new IllegalStateException("Instance already created");
    }
 }

 public static synchronized Singleton getInstance(){
    if( instance == null){
        instance=  new Singleton();
    }
    return instance;
 }
 public void print(){
    System.out.println("Hello world");
 }

}