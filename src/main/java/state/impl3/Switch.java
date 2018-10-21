package state.impl3;

/**
 * @author ShenSha on 2018/10/21
 */
public class Switch {
    private static State state,onState,offState;
    private String name;

    public Switch(String name) {
        this.name = name;
        onState = new OnState();
        offState = new OffState();
        Switch.state = onState;
    }

    public State getState() {
        return state;
    }

    public void setState(State state) {
        Switch.state = state;
    }

    public State getOnState() {
        return onState;
    }

    public void setOnState(State onState) {
        Switch.onState = onState;
    }

    public State getOffState() {
        return offState;
    }

    public void setOffState(State offState) {
        Switch.offState = offState;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }



    public static  State getState(String type){
        if (type.equalsIgnoreCase("on")) {
            return onState;
        }
        else {
            return offState;
        }
    }
    public void on(){
        System.out.println(name);
        state.on(this);
    }
    public void off(){
        System.out.println(name);
        state.off(this);
    }
}
