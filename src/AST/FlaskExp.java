package AST;

public class FlaskExp {
    Exp exp ;
    String request;
    String dot;
    String method ;
    String string;
    String IsEqual;

    public Exp getExp() {
        return exp;
    }

    public void setExp(Exp exp) {
        this.exp = exp;
    }

    public String getRequest() {
        return request;
    }

    public void setRequest(String request) {
        this.request = request;
    }

    public String getDot() {
        return dot;
    }

    public void setDot(String dot) {
        this.dot = dot;
    }

    public String getMethod() {
        return method;
    }

    public void setMethod(String method) {
        this.method = method;
    }

    public String getString() {
        return string;
    }

    public void setString(String string) {
        this.string = string;
    }

    public String getIsEqual() {
        return IsEqual;
    }

    public void setIsEqual(String isEqual) {
        IsEqual = isEqual;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder("FlaskExp { \n");
        if(exp != null){
            sb.append("exp = ").append(exp).append("\n");
        }
        if(request != null){
            sb.append("request = ").append(request).append(",").append("\n");
        }
        if(dot != null){
            sb.append("dot = ").append(dot).append(",").append("\n");
        }
        if(method != null){
            sb.append("method = ").append(method).append(",").append("\n");
        }
        if(IsEqual != null){
            sb.append("IsEqual = ").append(IsEqual).append(",").append("\n");
        }
        if(string != null){
            sb.append("string = ").append(string).append("\n");
        }
        return sb + "} \n";
    }
}
