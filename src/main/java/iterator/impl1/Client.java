package iterator.impl1;

import java.util.ArrayList;
import java.util.List;

/**
 * @author ShenSha
 */
public class Client {
    public static void main(String[] args) {
        List list = new ArrayList();
        list.add("张三");
        list.add("李四");
        list.add("王五");
        list.add("赵柳");
        list.add("田七");

        Aggregate aggregate;
        Iterator iterator;
        aggregate = new ConcreteAggregate(list);
        iterator = aggregate.createIterator();
        System.out.println("正向遍历");
        while (!iterator.isLast()){
            System.out.print(iterator.getNextItem()+",");
            iterator.next();
        }
        System.out.println();
        System.out.println("--------------------");
        System.out.println("逆向遍历");
        while (!iterator.isFirst()){
            System.out.print(iterator.getPreviousItem()+",");
            iterator.previous();
        }
    }
}
