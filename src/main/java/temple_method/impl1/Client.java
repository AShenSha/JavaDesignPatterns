package temple_method.impl1;

/**
 * @author ShenSha on 2018/10/22
 */
public class Client {
    public static void main(String[] args) {
        CaffeineBeverage c = new Tea();
        c.prepareRecipe();
        System.out.println("-----------");
        c = new Coffee();
        c.prepareRecipe();
    }
}
