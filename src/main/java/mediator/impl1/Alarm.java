package mediator.impl1;

/**
 * @author ShenSha
 */
public class Alarm extends Colleague {
    @Override
    public void onEvent(Mediator mediator) {
        mediator.onEvent("alarm");
    }

    public void doAlarm(){
        System.out.println("doAlarm()");
    }
}
