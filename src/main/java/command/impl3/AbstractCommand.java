package command.impl3;

/**
 * @author ShenSha
 */
public abstract class AbstractCommand {
    abstract public int execute(int value);
    abstract public int undo();
}
