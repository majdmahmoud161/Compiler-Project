package AST;

import java.util.ArrayList;
import java.util.List;

public class ArrDecl {
    String id;
    String equals;
    String opensquer;
    List<Value> values = new ArrayList<>();
    List<String>  comma = new ArrayList<>();
    String closesquer;

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getEquals() {
        return equals;
    }

    public void setEquals(String equals) {
        this.equals = equals;
    }

    public String getOpensquer() {
        return opensquer;
    }

    public void setOpensquer(String opensquer) {
        this.opensquer = opensquer;
    }

    public List<Value> getValues() {
        return values;
    }

    public void setValues(List<Value> values) {
        this.values = values;
    }

    public List<String> getComma() {
        return comma;
    }

    public void setComma(List<String> comma) {
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
        StringBuilder sb = new StringBuilder("ArrayDecl { \n");
        sb.append("id = ").append(id).append(",");
        sb.append("equals").append(equals).append(",");
        if(values != null && !(values.isEmpty())){
            sb.append("values = ").append(values).append(",");
        }
        if(comma != null && !(comma.isEmpty())){
            sb.append("comma = ").append(comma).append(",");
        }
        sb.append("opensquer = ").append(opensquer).append(",");
        sb.append("closesquer = ").append(closesquer);

        return sb + "\n}";
    }
}
