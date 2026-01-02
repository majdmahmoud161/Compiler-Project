package AST;

public class RouteCall {

    RequestCall requestCall;
    String dot ;
    Callfunction callFunc;

    public RequestCall getRequestCall() {
        return requestCall;
    }

    public void setRequestCall(RequestCall requestCall) {
        this.requestCall = requestCall;
    }

    public String getDot() {
        return dot;
    }

    public void setDot(String dot) {
        this.dot = dot;
    }

    public Callfunction getCallFunc() {
        return callFunc;
    }

    public void setCallFunc(Callfunction callFunc) {
        this.callFunc = callFunc;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder("RouteCall { \n");
        sb.append("requestCall = ").append(requestCall).append(",").append("\n");
        sb.append("dot = ").append(dot).append(",").append("\n");
        sb.append("callFunc = ").append(callFunc).append("\n");

        return sb + "} \n";
    }
}
