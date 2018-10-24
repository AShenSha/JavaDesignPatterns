package mediator.impl1;

public class Sprinkler extends Colleague {
    @Override
    public void onEvent(Mediator mediator) {
        mediator.onEvent("Sprinkler");
    }
    public void doSprinkler(){
        System.out.println("doSprinkler()");
    }
}
