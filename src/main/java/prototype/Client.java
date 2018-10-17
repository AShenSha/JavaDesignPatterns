package prototype;

public class Client {
    public static void main(String[] args) {
        Prototype obj1  = new ConcretePrototype();
        ((ConcretePrototype) obj1).setAttr("Sunny");
        Prototype obj2  = obj1.clone();
        ((ConcretePrototype) obj2).setAttr("Sunny2");
        System.out.println(((ConcretePrototype) obj2).getAttr());
    }

}
