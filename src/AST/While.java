package AST;

import java.util.ArrayList;
import java.util.List;

public class While {
//    : WHILE while_value COLONE (state)* (BREAK|CONTINUE)? ;

    String aWhile ;
    WhileValue whileValue ;
    String colone;
    List<State> states = new ArrayList<>();
    String aBreak;
    String aCountinue;

    public String getaWhile() {
        return aWhile;
    }

    public void setaWhile(String aWhile) {
        this.aWhile = aWhile;
    }

    public WhileValue getWhileValue() {
        return whileValue;
    }

    public void setWhileValue(WhileValue whileValue) {
        this.whileValue = whileValue;
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
        StringBuilder sb = new StringBuilder("While {");
        sb.append("aWhile = ").append(aWhile).append(",");
        sb.append("whileValue = ").append(whileValue).append(",");
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

        return sb + "}";
    }
}
