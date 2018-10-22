package strategy.impl1;

/**
 * @author ShenSha on 2018/10/22
 */
public class StudentDiscount implements Discount {
    @Override
    public double calculate(double price) {
        System.out.println("学生票");
        double studentPrice = price * 0.8;
        return studentPrice;
    }
}
