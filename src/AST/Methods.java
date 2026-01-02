package AST;

import java.util.ArrayList;
import java.util.List;

public class Methods {
    String methods ;
    String equal;
    String opensquer;
    List<String> string = new ArrayList<>();
    String comma;
    String closesquer;

    public String getMethods() {
        return methods;
    }

    public void setMethods(String methods) {
        this.methods = methods;
    }

    public String getEqual() {
        return equal;
    }

    public void setEqual(String equal) {
        this.equal = equal;
    }

    public String getOpensquer() {
        return opensquer;
    }

    public void setOpensquer(String opensquer) {
        this.opensquer = opensquer;
    }

    public List<String> getString() {
        return string;
    }

    public void setString(List<String> string) {
        this.string = string;
    }

    public String getComma() {
        return comma;
    }

    public void setComma(String comma) {
        this.comma = comma;
    }

    public String getClosesquer() {
        return closesquer;
    }

    public void setClosesquer(String closesquer) {
        this.closesquer = closesquer;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder("Methods { \n");
        sb.append("methods = ").append(methods).append(",");

        sb.append("equal = ").append(equal).append(",");

        sb.append("opensquer = ").append(opensquer).append(",");

        sb.append("string = ").append(string).append(",");

        sb.append("comma = ").append(comma).append(",");

        sb.append("closesquer = ").append(closesquer);

        return sb + "\n }";
    }
}
