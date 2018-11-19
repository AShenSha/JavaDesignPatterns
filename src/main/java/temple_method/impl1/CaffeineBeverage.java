package temple_method.impl1;

/**
 * @author ShenSha on 2018/10/22
 */
public abstract class CaffeineBeverage {
    final void prepareRecipe(){
        boilWater();
        brew();
        addCondiments();
        pourInCup();
    }
    abstract void brew();

    abstract void addCondiments();
    void boilWater(){
        System.out.println("boilWater");
    }

    void pourInCup(){
        System.out.println("pourInCup");
    }
}
