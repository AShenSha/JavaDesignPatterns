package singleton.impl2;

/**
 * 单例模式-饿汉式,线程安全
 */
public class Singleton {
    private static Singleton singleton = new Singleton();

    private Singleton(){

    }
    public static Singleton getSingleton(){
        return singleton;
    }
}
