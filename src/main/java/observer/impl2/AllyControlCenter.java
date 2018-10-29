package observer.impl2;

import java.util.ArrayList;
import java.util.List;

/**
 * 战队控制中心:抽象目标类
 *
 * @author ShenSha
 */
public abstract class AllyControlCenter {
    /**
     * 战队名称
     */
    protected String allyName;
    protected List<Observer> players = new ArrayList<Observer>();

    /**
     * 注册方法
     *
     * @param obs
     */
    public void join(Observer obs) {
        System.out.println(obs.getName() + " join " + this.allyName);
        players.add(obs);
    }

    /**
     * 注销方法
     *
     * @param obs
     */
    public void quit(Observer obs) {
        System.out.println(obs.getName() + "exit" + this.allyName);
        players.remove(obs);
    }

    /**
     * 声明抽象通知方法
     *
     * @param name
     */
    abstract public void notifyObserver(String name);

    public String getAllyName() {
        return allyName;
    }

    public void setAllyName(String allyName) {
        this.allyName = allyName;
    }

    public List getPlayers() {
        return players;
    }

    public void setPlayers(List players) {
        this.players = players;
    }
}
