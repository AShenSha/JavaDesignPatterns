package observer.impl2;

/**
 * @author ShenSha
 */
public class ConcreteAllyControlCenter extends AllyControlCenter {

    public ConcreteAllyControlCenter(String name) {
        System.out.println(name + "战队组建成功");
        System.out.println("------------------");
        this.allyName = name;
    }

    @Override
    public void notifyObserver(String name) {
        System.out.println(this.allyName + "战队紧急通知!" + name + "正在被攻击");
        for(Object p: players){
            //调用除了自己的其他队友来帮忙
            if(!((Observer)p).getName().equalsIgnoreCase(name)){
                ((Observer)p).help();
            }
        }
    }
}
