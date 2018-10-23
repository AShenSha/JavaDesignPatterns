package iterator.impl1;

import java.util.ArrayList;
import java.util.List;

/**
 * @author ShenSha
 */
public abstract class Aggregate {

    protected List<Object> objectList = new ArrayList<Object>();

    public Aggregate(List<Object> objectList) {
        this.objectList = objectList;
    }

    public void addObj(Object object){
        objectList.add(object);
    }

    public void removeObj(Object object){
        this.objectList.remove(object);
    }

    public List getObject(){
        return this.objectList;
    }

    /**
     * @return
     */
    abstract public Iterator createIterator();
}
