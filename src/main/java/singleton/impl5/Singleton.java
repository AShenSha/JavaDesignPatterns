package singleton.impl5;

/**
 * 静态内部类的实现
 * 当Singleton类被加载时,内部类SingletonHolder还没有被加载进内存
 * 只有当getSingleton方法被执行时,才会被加载.此时初始化singleton实例,并且jvm能确保singleton只被实例化一次
 * 此方式不仅具有延迟初始化的好处,还能保证线程的安全
 */
public class Singleton {
    private Singleton(){

    }
    private static class SingletonHolder{
        private static final Singleton singleton = new Singleton();
    }
    public static Singleton getSingleton(){
        return SingletonHolder.singleton;
    }
}
