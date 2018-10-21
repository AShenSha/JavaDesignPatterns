package state.impl3;

/**
 * @author ShenSha on 2018/10/21
 */
public abstract class State {
    public abstract void on(Switch s);

    public abstract void off(Switch s);
}
