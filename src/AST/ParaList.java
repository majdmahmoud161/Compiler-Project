package AST;

import java.util.ArrayList;
import java.util.List;

public class ParaList {

    List<Value> values = new ArrayList<>();
    List<String> Comma = new ArrayList<>();

    public List<Value> getValues() {
        return values;
    }

    public void setValues(List<Value> values) {
        this.values = values;
    }

    public List<String> getComma() {
        return Comma;
    }

    public void setComma(List<String> comma) {
        Comma = comma;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder("ParaList {");
        if(values != null && !(values.isEmpty())){
            sb.append("values = ").append(values).append(",");
        }
        if(Comma != null && !(Comma.isEmpty())){
            sb.append("Comma = ").append(Comma).append(",");
        }

        return sb +"}";
    }
}
