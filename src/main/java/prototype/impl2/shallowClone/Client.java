package prototype.impl2.shallowClone;

/**
 * 浅克隆实现原型模式
 * 在浅克隆中，当对象被复制时只复制它本身和其中包含的值类型的成员变量，而引用类型的成员对象并没有复制
 * @author ShenSha
 */
public class Client {
    public static void main(String[] args) {
        WeeklyLog w1 = new WeeklyLog();
        w1.setName("张三");
        w1.setDate("2018-09-09");
        w1.setContent("敲敲敲");
        Attachment attachment = new Attachment();
        attachment.setName("张三的附件");
        w1.setAttachment(attachment);
        WeeklyLog w2 = w1.clone();
        //false
        System.out.println("周报是否相同"+(w1==w2));
        //true 附件为引用类型,无法被复制,只是复制了内存地址,由于指向同一个内存地址,所以为true
        System.out.println("附件是否相同"+(w1.getAttachment()==w2.getAttachment()));
    }
}
