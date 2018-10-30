package state.impl1;

/**
 * @author ShenSha
 */
public class Client {
    public static void main(String[] args) {
        State s1,s2;
        s1 = new ConcreteStateA();
        s2 = new ConcreteStateB();
        Context c = new Context();
        c.setState(s1);
        c.request();
    }
}
