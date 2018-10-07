package abstractfactory;

/**
 * 抽象工厂模式创建的是对象家族,且这些对象是相关的,也就是说必须一起创建出来
 * @author ShenSha
 */
public abstract class AbstractFactory {
     /**
      * 创建a
      * @return
      */
     abstract AbstractProductA createProductA();

     /**
      * 创建b
      * @return
      */
     abstract AbstractProductB createProductB();
}
