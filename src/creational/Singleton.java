package creational;

public class Singleton {

    private static volatile Singleton instance;   // volatile prevents thread B to access the instance when thread A is half created
    private Singleton(){}

    public static Singleton getInstance(){

        if(instance == null){                // helps when multiple threads access it at a time, synchronize if instance is null
            synchronized(Singleton.class){   // helps when multiple threads access it at a time
                //return new Singleton();
                if(instance == null){
                    instance = new Singleton();
                }
            }
        }
        return instance;
    }
}
