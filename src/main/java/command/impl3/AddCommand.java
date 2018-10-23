package command.impl3;

import java.util.ArrayList;
import java.util.List;

public class AddCommand extends AbstractCommand {
    private Adder adder;
    private List<Integer> integers = new ArrayList<Integer>();
    private int value;

    @Override
    public int execute(int value) {
        adder = new Adder();
        this.value = value;
        this.integers.add(value);
        return adder.add(this.integers);
    }

    @Override
    public int undo() {
        adder = new Adder();
        this.integers.remove(integers.size() - 1 <= 0 ? 0 : integers.size() - 1);
        return adder.add(this.integers);
    }
}
