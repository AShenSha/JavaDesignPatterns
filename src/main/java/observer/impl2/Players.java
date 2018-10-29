package observer.impl2;

/**
 * @author ShenSha
 */
public class Players implements Observer {

    private String name;

    public Players(String name) {
        this.name = name;
    }

    @Override
    public String getName() {
        return name;
    }

    @Override
    public void setName(String name) {
        this.name = name;
    }

    /**
     * 支持盟友的方法
     */
    @Override
    public void help() {
        System.out.println("hold on," + this.name + " is coming to save you !");
    }

    /**
     * 遭受攻击时,调用通知方法告诉其他队友
     *
     * @param acc
     */
    @Override
    public void beAttached(AllyControlCenter acc) {
        System.out.println(this.name + " is being attacked");
        acc.notifyObserver(this.name);
    }
}
