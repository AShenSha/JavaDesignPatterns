package adapter.impl1;

/**
 * 火鸡冒充鸭子叫
 * @author ShenSha on 2018/11/19
 */
public class Client {
    public static void main(String[] args) {
        Turkey turkey = new WildTurkey();
        Duck duck = new TurkeyAdapter(turkey);
        duck.quack();
    }
}
