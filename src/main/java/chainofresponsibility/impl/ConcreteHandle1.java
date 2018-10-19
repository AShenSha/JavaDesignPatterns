package chainofresponsibility.impl;


/**
 * 具体处理类
 *
 * @author ShenSha
 */
public class ConcreteHandle1 extends Handler {
    public ConcreteHandle1(Handler successor) {
        super(successor);
    }

    @Override
    public void handleRequest(Request request) {
        if (request.getType() == RequestType.TYPE1) {
            System.out.println(request.getName() + " is handle by ConcreteHandle1");
            return;

        }
        if (successor != null) {
            successor.handleRequest(request);
        }
    }
}
