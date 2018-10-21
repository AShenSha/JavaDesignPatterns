package state.impl2;

/**
 * @author ShenSha on 2018/10/21
 */
public class Client {
    public static void main(String[] args) {
        Account acc = new Account("张三",5000);
        acc.deposit(1000);
        acc.withdraw(7000);
        acc.deposit(1000);
        acc.withdraw(2000);
        acc.computeInterest();
    }
}
