package mediator.impl1;

/**
 * @author ShenSha
 */
public class Calender extends  Colleague {
    @Override
    public void onEvent(Mediator mediator) {
        System.out.println("calender");
    }
    public void doCalender(){
        System.out.println("doCalender()");
    }
}
