package command.impl1;

/**
 * 具体命令类:关灯
 * @author ShenSha
 */
public class LightOffCommand extends Command {

    private Light light;


    public LightOffCommand(Light light){
        this.light = light;
    }
    @Override
    public void execute() {
        light.off();
    }
}
