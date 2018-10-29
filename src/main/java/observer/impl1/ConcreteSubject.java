package observer.impl1;

/**
 *
 * @author ShenSha
 */
public class ConcreteSubject extends Subject {
    @Override
    public void tongzhi() {
        for (Observer obs : observerList) {
            obs.update();
        }
    }
}
