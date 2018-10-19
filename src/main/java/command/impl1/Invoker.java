package command.impl1;

/**
 * 调用者:遥控器
 * @author ShenSha
 */
public class Invoker {
    private Command[] onCommand;
    private Command[] offCommand;
    private final int slotNum = 7;

    public Invoker(){
        this.onCommand = new Command[slotNum];
        this.offCommand = new Command[slotNum];
    }


    public void setOnCommand(Command command,int slot) {
        onCommand[slot] = command;
    }


    public void setOffCommand(Command command,int slot) {
        offCommand[slot] = command;
    }

}
