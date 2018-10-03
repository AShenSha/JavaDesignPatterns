package factorymethod;

/**
 *
 * @author ShenSha
 */
public abstract class Factory {
    /**
     * 创建产品对象
     * @return
     */
    public abstract Product factoryMethod();

    public void doSomething(){
        Product product = factoryMethod();
    }
}
