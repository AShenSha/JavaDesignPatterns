package mediator.impl1;

/**
 * @author ShenSha
 */
public class CoffeePot extends Colleague {
    @Override
    public void onEvent(Mediator mediator) {
        mediator.onEvent("coffeePot");
    }

    public void doCoffeePot(){
        System.out.println("doCoffeePot()");
    }
}
