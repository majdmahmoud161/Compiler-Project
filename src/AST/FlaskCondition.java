package AST;

import java.util.ArrayList;
import java.util.List;

public class FlaskCondition {

    Condition condition ;
    String If ;
    FlaskExp flaskExp;
    String colone;
    List<RoutState> routState = new ArrayList<>();

    public Condition getCondition() {
        return condition;
    }

    public void setCondition(Condition condition) {
        this.condition = condition;
    }

    public String getIf() {
        return If;
    }

    public void setIf(String anIf) {
        If = anIf;
    }

    public FlaskExp getFlaskExp() {
        return flaskExp;
    }

    public void setFlaskExp(FlaskExp flaskExp) {
        this.flaskExp = flaskExp;
    }

    public String getColone() {
        return colone;
    }

    public void setColone(String colone) {
        this.colone = colone;
    }

    public List<RoutState> getRoutState() {
        return routState;
    }

    public void setRoutState(List<RoutState> routState) {
        this.routState = routState;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder("FlaskCondition { \n");
        if(condition != null){
            sb.append("condition = ").append(condition).append("\n");
        }
        if(If != null){
            sb.append("If = ").append(If).append(",").append("\n");
        }
        if(flaskExp != null){
            sb.append("flskExp = ").append(flaskExp).append(",").append("\n");
        }
        if(colone != null){
            sb.append("colone = ").append(colone).append(",").append("\n");
        }
        if(routState != null && !(routState.isEmpty())){
            sb.append("routState = ").append(routState).append("\n");
        }

        return sb + "} \n";
    }
}
