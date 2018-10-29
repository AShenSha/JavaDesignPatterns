package observer.impl2;


/**
 * 抽象观察者
 * @author ShenSha
 */
public interface Observer {
     String getName();
    void setName(String name);
    void help();
    void beAttached(AllyControlCenter acc);
}
