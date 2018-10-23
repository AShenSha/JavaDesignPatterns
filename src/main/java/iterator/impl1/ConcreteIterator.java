package iterator.impl1;

import java.util.List;

/**
 * @author ShenSha
 */
public class ConcreteIterator implements Iterator {


    /**
     * 维持一个对具体聚合聚合对象的一个引用,以便于访问存储在聚合对象中的数据
     */
    private ConcreteAggregate objects;

    private List obj;

    /**
     * 定义一个游标,用于标记当前访问位置
     */
    private int cursor1;

    private int cursor2;

    public ConcreteIterator(ConcreteAggregate objects) {
        this.objects = objects;
        //获取结合对象
        this.obj = objects.getObject();
        //设置正向遍历游标的初始值
        cursor1 = 0;
        //设置逆向遍历游标的初始值
        cursor2 = obj.size()-1;
    }

    @Override
    public boolean isFirst() {
        return (cursor2 == -1);
    }

    @Override
    public void next() {
        if(cursor1<obj.size()){
            cursor1++;
        }
    }

    @Override
    public boolean isLast() {
        return (cursor1 == obj.size());
    }

    @Override
    public Object currentItem() {
        return null;
    }

    @Override
    public void previous() {
        if (cursor2 > -1) {
            cursor2--;
        }
    }

    @Override
    public Object getNextItem() {
        return obj.get(cursor1);
    }

    @Override
    public Object getPreviousItem() {
        return obj.get(cursor2);
    }
}
