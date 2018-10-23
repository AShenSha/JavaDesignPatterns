package command.impl2;

/**
 * @author ShenSha
 */
public class MinimizeCommand implements Command {
    private WindowHandler windowHandler;

    public MinimizeCommand( ){
        windowHandler = new WindowHandler();
    }

    @Override
    public void execute() {
        windowHandler.minimize();
    }
}
