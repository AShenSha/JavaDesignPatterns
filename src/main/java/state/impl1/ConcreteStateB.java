package state.impl1;

/**
 * 具体状态类
 *
 * @author ShenSha
 */
public class ConcreteStateB extends State {
    @Override
    public void handle() {
        System.out.println("我是状态B的行为");
    }
}
