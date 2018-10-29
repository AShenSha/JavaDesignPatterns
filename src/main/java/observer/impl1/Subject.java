package observer.impl1;

import java.util.ArrayList;
import java.util.List;

/**
 * 目标
 *
 * @author ShenSha
 */
public abstract class Subject {
    //定义一个观察者集合用于存储多个观察者对象
    protected List<Observer> observerList = new ArrayList<>();

    //注册方法,用于向观察者集合中增加一个观察者
    public void attach(Observer obs) {
        observerList.add(obs);
    }

    //注销方法,用于删除一个观察者
    public void detach(Observer obs) {
        observerList.remove(obs);
    }
    abstract public void tongzhi();
}
