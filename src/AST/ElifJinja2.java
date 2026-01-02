package AST;

import java.util.ArrayList;

public class ElifJinja2  extends ConditionJinja2{
    String OpenCondition;
    String Elif ;
    ArrayList<String> Id = new ArrayList<>();
    String Dot;
    String CloseCondition;
   ArrayList <StateJinja2> stateJinja2 = new ArrayList<>();
    Exp exp;

    public String getOpenCondition() {
        return OpenCondition;
    }

    public void setOpenCondition(String openCondition) {
        OpenCondition = openCondition;
    }

    public String getElif() {
        return Elif;
    }

    public void setElif(String elif) {
        Elif = elif;
    }

    public ArrayList<String> getId() {
        return Id;
    }

    public void setId(ArrayList<String> id) {
        Id = id;
    }

    public String getDot() {
        return Dot;
    }

    public void setDot(String dot) {
        Dot = dot;
    }

    public String getCloseCondition() {
        return CloseCondition;
    }

    public void setCloseCondition(String closeCondition) {
        CloseCondition = closeCondition;
    }

    public ArrayList<StateJinja2> getStateJinja2() {
        return stateJinja2;
    }

    public void setStateJinja2(ArrayList<StateJinja2> stateJinja2) {
        this.stateJinja2 = stateJinja2;
    }

    public Exp getExp() {
        return exp;
    }

    public void setExp(Exp exp) {
        this.exp = exp;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder("ElifJinja2 {\n ");

        if (OpenCondition != null) {
            sb.append("OpenCondition = ").append(OpenCondition).append(",");
        }
        if (Elif != null) {
            sb.append("Ilif =").append(Elif).append(",");
        }
        if (Id != null) {
            sb.append("Id =").append(Id).append(",");
        }
        if (Dot != null) {
            sb.append("Dot =").append(Dot).append(",");
        }
        if (CloseCondition != null) {
            sb.append("CloseCondition =").append(CloseCondition).append(",");
        }
        if (stateJinja2 != null) {
            sb.append("stateJinja2=").append(stateJinja2).append(",");
        }
        if (exp != null) {
            sb.append("exp=").append(exp).append(",");
        }

        sb.append("\n}");
        return sb.toString();
    }

}
