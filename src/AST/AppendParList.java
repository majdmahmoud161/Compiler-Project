package AST;

import java.util.ArrayList;
import java.util.List;

public class AppendParList {
    List<String> id = new ArrayList<>();
    String colone;
    String len;
    String openprac;
    String closeprac;


    public List<String> getId() {
        return id;
    }

    public void setId(List<String> id) {
        this.id = id;
    }

    public String getColone() {
        return colone;
    }

    public void setColone(String colone) {
        this.colone = colone;
    }

    public String getLen() {
        return len;
    }

    public void setLen(String len) {
        this.len = len;
    }

    public String getOpenprac() {
        return openprac;
    }

    public void setOpenprac(String openprac) {
        this.openprac = openprac;
    }

    public String getCloseprac() {
        return closeprac;
    }

    public void setCloseprac(String closeprac) {
        this.closeprac = closeprac;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder("AppendParList {\n ");
        sb.append("colone = ").append(colone).append(",");
        if(id != null && !(id.isEmpty())){
            sb.append("id = ").append(id).append(",");
        }
        if(len != null){
            sb.append("len").append(len).append(",");
        }
        if(closeprac != null){
            sb.append("closeprac = ").append(closeprac).append(",");
        }
        if(openprac != null){
            sb.append("openprac = ").append(openprac).append(",");
        }
        return sb + "\n} ";
    }
}
