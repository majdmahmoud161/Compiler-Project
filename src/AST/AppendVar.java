package AST;

import java.util.ArrayList;
import java.util.List;

public class AppendVar {

    String openprac;
    List<AppendParList> appendParLists = new ArrayList<>();
    List<String>Comma = new ArrayList<>();
    String  closeprac;

    public String getOpenprac() {
        return openprac;
    }

    public void setOpenprac(String openprac) {
        this.openprac = openprac;
    }

    public List<AppendParList> getAppendParLists() {
        return appendParLists;
    }

    public void setAppendParLists(List<AppendParList> appendParLists) {
        this.appendParLists = appendParLists;
    }

    public List<String> getComma() {
        return Comma;
    }

    public void setComma(List<String> comma) {
        Comma = comma;
    }

    public String getCloseprac() {
        return closeprac;
    }

    public void setCloseprac(String closeprac) {
        this.closeprac = closeprac;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder("AppendVar { \n");
        sb.append("openprac = ").append(openprac).append(",");
        if(appendParLists != null && !(appendParLists.isEmpty())){
            sb.append("appendParLists = ").append(appendParLists).append(",");
        }
        if(Comma != null && !(Comma.isEmpty())){
            sb.append("Comma = ").append(Comma).append(",");
        }
        sb.append("closeprac = ").append(closeprac);

        return sb + "\n}";
    }
}
