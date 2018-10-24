package memento.impl1;

/**
 * 备忘录
 * @author ShenSha
 */
public class Memento {
    private String state;

    public Memento(Originator o) {
        this.state = o.getState();
    }

    public String getState() {
        return state;
    }

    public void setState(String state) {
        this.state = state;
    }
}
