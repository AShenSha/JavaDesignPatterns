package chainofresponsibility.impl;

/**
 * @author ShenSha
 */
public class Client {
    public static void main(String[] args) {
        Handler h1 = new ConcreteHandle1(null);
        Handler h2 = new ConcreteHandle2(h1);

        Request q1 = new Request(RequestType.TYPE1,"request1");
        h2.handleRequest(q1);

        Request q2 = new Request(RequestType.TYPE2,"request2");
        h2.handleRequest(q2);
    }
}
