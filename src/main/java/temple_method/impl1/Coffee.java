package temple_method.impl1;

import temple_method.impl1.CaffeineBeverage;

/**
 * @author ShenSha on 2018/10/22
 */
public class Coffee extends CaffeineBeverage {
    @Override
    void brew() {
        System.out.println("coffee.brew");
    }

    @Override
    void addCondiments() {
        System.out.println("coffee.add");
    }
}
