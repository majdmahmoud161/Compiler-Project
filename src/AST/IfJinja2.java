package AST;

import java.util.ArrayList;

public class IfJinja2 extends ConditionJinja2 {
  ArrayList<String> OpenCondition = new ArrayList<>();
 String If ;
 ArrayList<String> Id;
 String Dot;
 ArrayList<String> CloseCondition = new ArrayList<>();
 String EndIf;
    ArrayList<StateJinja2> stateJinja2 = new ArrayList<>();
    Exp exp;

    public ArrayList<String> getOpenCondition() {
        return OpenCondition;
    }

    public void setOpenCondition(ArrayList<String> openCondition) {
        OpenCondition = openCondition;
    }

    public ArrayList<String> getId() {
        return Id;
    }

    public void setId(ArrayList<String> id) {
        Id = id;
    }

    public ArrayList<String> getCloseCondition() {
        return CloseCondition;
    }

    public void setCloseCondition(ArrayList<String> closeCondition) {
        CloseCondition = closeCondition;
    }

    public String getIf() {
        return If;
    }

    public void setIf(String anIf) {
        If = anIf;
    }


    public String getDot() {
        return Dot;
    }

    public void setDot(String dot) {
        Dot = dot;
    }


    public String getEndIf() {
        return EndIf;
    }

    public void setEndIf(String endIf) {
        EndIf = endIf;
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
        StringBuilder sb = new StringBuilder("IfJinja2{\n");

        if (OpenCondition != null) {
            sb.append("OpenCondition='").append(OpenCondition).append("'\n");
        }
        if (If != null) {
            sb.append("If='").append(If).append("'\n");
        }
        if (Id != null) {
            sb.append("Id='").append(Id).append("'\n");
        }
        if (Dot != null) {
            sb.append("Dot='").append(Dot).append("'\n");
        }
        if (CloseCondition != null) {
            sb.append("CloseCondition='").append(CloseCondition).append("'\n");
        }
        if (EndIf != null) {
            sb.append("EndIf='").append(EndIf).append("'\n");
        }
        if (stateJinja2 != null) {
            sb.append("stateJinja2=").append(stateJinja2).append("\n");
        }
        if (exp != null) {
            sb.append("exp=").append(exp).append("\n");
        }

        sb.append("}");
        return sb.toString();
    }

}
