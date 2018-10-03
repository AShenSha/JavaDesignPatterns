package singleton.impl4;

/**
 * 单例模式-双重校验锁,线程安全
 */
public class Singleton {

    //volatile可禁止jvm指令重排
    private volatile static Singleton singleton;

    private Singleton(){

    }

    public static  Singleton getSingleton(){
        if(null==singleton){
            synchronized (Singleton.class){
                if(null==singleton){
                    singleton = new Singleton();
                }
            }
        }
        return singleton;
    }
}
