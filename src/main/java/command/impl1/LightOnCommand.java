package command.impl1;

/**
 * 具体命令类:开灯
 * @author ShenSha
 */
public class LightOnCommand extends Command {

    private Light light;


    public LightOnCommand(Light light){
        this.light = light;
    }
    @Override
    public void execute() {
        light.on();
    }
}
