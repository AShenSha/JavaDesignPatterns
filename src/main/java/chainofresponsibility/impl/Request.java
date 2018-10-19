package chainofresponsibility.impl;

public class Request {
    private RequestType type;
    private String name;

    public Request(RequestType type,String name){
        this.name = name;
        this.type = type;
    }

    public RequestType getType() {
        return type;
    }

    public void setType(RequestType type) {
        this.type = type;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
}
