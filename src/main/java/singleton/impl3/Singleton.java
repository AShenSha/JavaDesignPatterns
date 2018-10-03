package singleton.impl3;

/**
 * 单例模式-懒汉式,线程安全
 */
public class Singleton {
    private static Singleton singleton;

    private Singleton(){

    }

    /**
     * 增加了synchronized以保证只有一个线程进入,
     * 但其他的线程必须等待,即使singleton已经被实例化了,这样会导致线程阻塞时间过长,性能较低
     * @return
     */
    public static synchronized Singleton getSingleton(){
        if(null==singleton){
            singleton = new Singleton();
        }
        return singleton;
    }
}
