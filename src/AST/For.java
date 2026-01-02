package AST;

import java.util.ArrayList;
import java.util.List;

public class For{
    String aFor;
    List<String> id = new ArrayList<>();
    String in;
    String range;
    String openprac;
    String Int;
    String closeprac;
    String colone;
    List<State> states = new ArrayList<>();
    String aBreak;
    String aCountinue;

    public String getaFor() {
        return aFor;
    }

    public void setaFor(String aFor) {
        this.aFor = aFor;
    }

    public List<String> getId() {
        return id;
    }

    public void setId(List<String> id) {
        this.id = id;
    }

    public String getIn() {
        return in;
    }

    public void setIn(String in) {
        this.in = in;
    }

    public String getRange() {
        return range;
    }

    public void setRange(String range) {
        this.range = range;
    }

    public String getOpenprac() {
        return openprac;
    }

    public void setOpenprac(String openprac) {
        this.openprac = openprac;
    }

    public String getInt() {
        return Int;
    }

    public void setInt(String anInt) {
        Int = anInt;
    }

    public String getCloseprac() {
        return closeprac;
    }

    public void setCloseprac(String closeprac) {
        this.closeprac = closeprac;
    }

    public String getColone() {
        return colone;
    }

    public void setColone(String colone) {
        this.colone = colone;
    }

    public List<State> getStates() {
        return states;
    }

    public void setStates(List<State> states) {
        this.states = states;
    }

    public String getaBreak() {
        return aBreak;
    }

    public void setaBreak(String aBreak) {
        this.aBreak = aBreak;
    }

    public String getaCountinue() {
        return aCountinue;
    }

    public void setaCountinue(String aCountinue) {
        this.aCountinue = aCountinue;
    }

    @Override
    public String toString() {
       StringBuilder sb = new StringBuilder("For {\n");
       sb.append("aFor = ").append(aFor).append(",");
       if(id != null && !(id.isEmpty())){
           sb.append("id = ").append(id).append(",");
       }
       sb.append("in = ").append(in).append(",");
       if(range != null){
           sb.append("range = ").append(range).append(",");
       }
       if(Int != null){
           sb.append("Int = ").append(Int).append(",");
       }
       if(openprac != null){
           sb.append("openprac = ").append(openprac).append(",");
       }
       if(closeprac != null){
           sb.append("closeprac = ").append(closeprac).append(",");
       }
       sb.append("colone").append(colone).append(",");
       if(states != null && !(states.isEmpty())){
           sb.append("states = ").append(states).append(",");
       }
       if(aBreak != null){
           sb.append("aBreak = ").append(aBreak).append(",");
       }
       if(aCountinue != null){
            sb.append("aCountinue = ").append(aCountinue).append(",");
       }

       return sb + "\n } ";
    }
}
