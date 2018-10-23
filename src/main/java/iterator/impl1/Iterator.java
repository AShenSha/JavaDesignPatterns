package iterator.impl1;

import com.sun.org.apache.xpath.internal.operations.Bool;

/**
 * @author ShenSha
 */
public interface Iterator {
    /**
     * @return
     */
    boolean isFirst();

    /**
     *
     */
    void next();

    /**
     * @return
     */
    boolean isLast();

    /**
     * 当前元素
     * @return
     */
    Object currentItem();

    /**
     *  移至上一个元素
     */
    public void previous();

    /**
     * 获取下一个元素
     * @return
     */
    public Object getNextItem();

    /**
     * 获取上一个元素
     * @return
     */
    public Object getPreviousItem();
}
