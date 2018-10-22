package strategy.impl1;

/**
 * 电影票类
 *
 * @author ShenSha on 2018/10/22
 */
public class MovieTicket {
    private Discount discount;
    private double price;

    public Discount getDiscount() {
        return discount;
    }

    public void setDiscount(Discount discount) {
        this.discount = discount;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    public double caltcalculate() {
        return discount.calculate(price);
    }
}