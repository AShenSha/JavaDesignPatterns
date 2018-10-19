package chainofresponsibility.impl;



/**
 * 抽象处理类
 * @author ShenSha
 */
public abstract class Handler {
    protected Handler successor;
    public Handler(Handler successor){
        this.successor = successor;
    }
    public abstract void handleRequest(Request request);
}
