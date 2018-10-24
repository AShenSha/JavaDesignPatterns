package memento.impl1;

/**
 * 原发器
 * @author ShenSha
 */
public class Originator {
    private String state;

    public String getState() {
        return state;
    }

    public void setState(String state) {
        this.state = state;
    }

    public Originator(String state) {
        this.state = state;
    }
    public Originator(){}

    /**
     * 根据备忘录对象恢复原发器状态
     * @param memento
     */
    public void restoreMemento(Memento memento){
        state = memento.getState();
    }

    /**
     * 创建一个备忘录
     * @return
     */
    public Memento createMemento(){
        return new Memento(this);
    }
}
