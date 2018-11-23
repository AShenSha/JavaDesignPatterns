package adapter.impl1;

/**
 * 火鸡的适配方法
 * @author ShenSha on 2018/11/19
 */
public class TurkeyAdapter implements Duck {
    Turkey turkey;

    public TurkeyAdapter(Turkey turkey) {
        this.turkey = turkey;
    }

    @Override
    public void quack() {
        turkey.gobble();
    }
}
