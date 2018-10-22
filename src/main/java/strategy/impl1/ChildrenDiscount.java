package strategy.impl1;

/**
 * @author ShenSha on 2018/10/22
 */
public class ChildrenDiscount implements Discount {
    @Override
    public double calculate(double price) {
        System.out.println("儿童票");
        double childrenPrice = price-10;
        return childrenPrice;
    }
}
