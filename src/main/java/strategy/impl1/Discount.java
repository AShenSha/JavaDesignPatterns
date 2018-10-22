package strategy.impl1;

/**
 * 打折类
 * @author ShenSha on 2018/10/22
 */
public  interface Discount {
    /**
     * 计算价格方法
     * @param price
     * @return
     */
    double calculate(double price);
}
