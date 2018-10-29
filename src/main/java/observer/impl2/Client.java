package observer.impl2;

/**
 * @author ShenSha
 */
public class Client {
    public static void main(String[] args) {
        AllyControlCenter acc = new ConcreteAllyControlCenter("The Avengers");
        Observer p1, p2, p3, p4;
        p1 = new Players("iron Man");
        acc.join(p1);
        p2 = new Players("Hulk");
        acc.join(p2);
        p3 = new Players("captain");
        acc.join(p3);
        p4 = new Players("Raytheon");
        acc.join(p4);
        p1.beAttached(acc);
    }
}
