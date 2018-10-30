package state.impl1;

/**
 *
 * @author ShenSha
 */
public class Context {
    /**
     * 抽象状态的引用
     */
    private State state;
    private int value;

    public void setState(State state) {
        this.state = state;
    }

    public void request(){
        state.handle();
    }
}
