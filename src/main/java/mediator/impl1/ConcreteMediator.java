package mediator.impl1;

/**
 * @author ShenSha
 */
public class ConcreteMediator extends Mediator {

    private Alarm alarm;
    private CoffeePot coffeePot;
    private Sprinkler sprinkler;
    private Calender calender;

    public ConcreteMediator(Alarm alarm, CoffeePot coffeePot, Sprinkler sprinkler, Calender calender) {
        this.alarm = alarm;
        this.coffeePot = coffeePot;
        this.sprinkler = sprinkler;
        this.calender = calender;
    }

    @Override
    public void onEvent(String eventType) {
        switch (eventType) {
            case "alarm":
                doAlarmEvent();
                System.out.println("--------------------1");
                break;
            case "coffeePot":
                doCoffeePot();
                System.out.printf("---------------------2");
                break;
            case "sprinkler":
                doSprinkler();
                System.out.println("--------------------3");
                break;
            case "calender":
                doCalender();
                System.out.println("--------------------4");
                break;
        }
    }

    public void doCoffeePot() {
        alarm.doAlarm();
        coffeePot.doCoffeePot();
        calender.doCalender();
        sprinkler.doSprinkler();
    }

    public void doAlarmEvent() {
        alarm.doAlarm();
        coffeePot.doCoffeePot();
        calender.doCalender();
        sprinkler.doSprinkler();
    }

    public void doSprinkler() {
        alarm.doAlarm();
        coffeePot.doCoffeePot();
        calender.doCalender();
        sprinkler.doSprinkler();
    }

    public void doCalender() {
        alarm.doAlarm();
        coffeePot.doCoffeePot();
        calender.doCalender();
        sprinkler.doSprinkler();
    }


}
