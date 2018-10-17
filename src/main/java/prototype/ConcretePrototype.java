package prototype;

/**
 *具体原型类
 * @author ShenSha
 */
public class ConcretePrototype implements  Prototype {
    /**
     * 成员属性
     */
    private String attr;

    public String getAttr() {
        return attr;
    }

    public void setAttr(String attr) {
        this.attr = attr;
    }

    @Override
    public Prototype clone(){
        Prototype prototype = new ConcretePrototype();
        ((ConcretePrototype)prototype).setAttr(this.attr);
        return prototype;
    }
}
