package iterator.impl1;

import java.util.List;

/**
 *
 * @author ShenSha
 */
public class ConcreteAggregate extends Aggregate{
    public ConcreteAggregate(List<Object> objectList) {
        super(objectList);
    }

    @Override
    public Iterator createIterator() {
        return new ConcreteIterator(this);
    }
}
