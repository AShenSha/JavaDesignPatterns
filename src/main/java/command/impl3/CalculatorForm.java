package command.impl3;

import java.util.ArrayList;
import java.util.List;

public class CalculatorForm {
    private AbstractCommand abstractCommand;
    private int num = 1;

    public void setAbstractCommand(AbstractCommand abstractCommand, int value) {
        this.abstractCommand = abstractCommand;
    }

    public void compute(int value) {
        int i = abstractCommand.execute(value);
        System.out.println(i);
    }

    public void undo() {
        int a = abstractCommand.undo();
        System.out.println("撤销后结果为:" + a);
    }
}
