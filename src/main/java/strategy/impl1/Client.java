package strategy.impl1;

import command.impl2.XMLUtil;

/**
 * @author ShenSha on 2018/10/22
 */
public class Client {
    public static void main(String[] args) {
        MovieTicket movieTicket = new MovieTicket();
        double originalPrice = 300;
        double currentPrice;
        movieTicket.setPrice(originalPrice);
        System.out.println("原始价格为:"+originalPrice);
        System.out.println("------------------------------");
        Discount discount = (Discount) XMLUtils.getBean();
        movieTicket.setDiscount(discount);
        currentPrice = movieTicket.caltcalculate();
        System.out.println("折后价:"+currentPrice);
    }
}
