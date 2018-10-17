package prototype.impl1;

public class Client {
    public static void main(String[] args) {
        WeeklyLog w1 = new WeeklyLog();
        w1.setName("zhangsan");
        w1.setDate("20180909");
        w1.setContent("看书");
        WeeklyLog w2 = w1.clone();
        System.out.println(w1.clone().equals(w1));
        System.out.println(w2.getClass()==w1.getClass());
        System.out.println(w2.getName());
        System.out.println(w2.getDate());
        System.out.println(w2.getContent());
        System.out.println(w1 == w2);
        System.out.println(w1.getDate() == w2.getDate());
        System.out.println(w1.getName() == w2.getName());
        System.out.println(w1.getContent() == w2.getContent());

    }
}
