package chainofresponsibility.impl;


/**
 * 具体处理类
 *
 * @author ShenSha
 */
public class ConcreteHandle2 extends Handler {
    public ConcreteHandle2(Handler successor) {
        super(successor);
    }

    @Override
    public void handleRequest(Request request) {
        if (request.getType() == RequestType.TYPE2) {
            System.out.println(request.getName() + " is handle by ConcreteHandle2");
            return;

        }
        if (successor != null) {
            successor.handleRequest(request);
        }
    }
}
