package prototype.impl2.deepClone;

import java.io.IOException;

public class Client {
    public static void main(String[] args) {
        WeeklyLog w1,w2 = null;
        w1 = new WeeklyLog();
        Attachment attachment = new Attachment();
        w1.setAttachment(attachment);
        try {
            w2 = w1.deepClone();
        } catch (Exception e) {
            System.out.println("克隆失败");
        }
        System.out.println("周报是否相同"+(w1==w2));
        System.out.println("附件是否相同"+(w1.getAttachment()==w2.getAttachment()));
    }
}
