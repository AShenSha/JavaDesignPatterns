package command.impl3;

public class Client {
    public static void main(String[] args) {
        CalculatorForm form = new CalculatorForm();
        AbstractCommand command = new AddCommand();
        form.setAbstractCommand(command,0);
        form.compute(1);
        form.compute(2);
        form.compute(3);
        form.undo();
        form.undo();
        form.undo();
    }
}
