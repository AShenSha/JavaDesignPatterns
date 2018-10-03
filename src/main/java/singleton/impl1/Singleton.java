package singleton.impl1;

/**
 * 单例模式-懒汉式,线程不安全
 */
public class Singleton {
    private static Singleton singleton;

    private Singleton(){

    }
    public static Singleton getSingleton(){
        //如果多线程能今日以下代码,且此时的singleton为null,singleton会被多次实例化,导致线程不安全
        if(null==singleton){
            singleton = new Singleton();
        }
        return singleton;
    }
}
