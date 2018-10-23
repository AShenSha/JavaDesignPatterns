package command.impl3;

import java.util.List;

/**
 * @author ShenSha
 */
public class Adder {
    private int num = 0;
    public int add(List<Integer> adder){
        for (int i = 0;i<adder.size();i++){
            num+=adder.get(i);
        }
        return num;
    }
}
