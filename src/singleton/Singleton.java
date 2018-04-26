package singleton;

/**
 * 饿汉式
 */
public class Singleton {
    private static   Singleton singleton=new Singleton();

    private Singleton(){}

    public static Singleton getInstanse(){
        return singleton;
    }
}
