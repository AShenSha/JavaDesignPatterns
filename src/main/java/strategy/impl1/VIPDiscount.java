package strategy.impl1;

/**
 * @author ShenSha on 2018/10/22
 */
public class VIPDiscount implements Discount {
    @Override
    public double calculate(double price) {
        System.out.println("vip票,增加积分");
        double vipPrice = price * 0.5;
        return vipPrice;
    }
}
