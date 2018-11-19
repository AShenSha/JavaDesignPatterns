package temple_method.impl1;

import temple_method.impl1.CaffeineBeverage;

/**
 * @author ShenSha on 2018/10/22
 */
public class Tea extends CaffeineBeverage {
    @Override
    void brew() {
        System.out.println("tea.brew");
    }

    @Override
    void addCondiments() {
        System.out.println("tea.addCondiments");
    }
}
