package command.impl2;

/**
 * @author ShenSha
 */
public class HelpCommand implements  Command {
    private HelpHandler helpHandler;

    public HelpCommand(){
        this.helpHandler = new HelpHandler();
    }
    @Override
    public void execute() {
       helpHandler.display();
    }
}
