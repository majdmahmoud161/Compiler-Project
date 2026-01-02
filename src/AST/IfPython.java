package AST;

import java.util.ArrayList;

public class IfPython {
  String If;
  Exp exp;
  String Colone;
  ArrayList<State>states = new ArrayList<>();

    public String getIf() {
        return If;
    }

    public void setIf(String anIf) {
        If = anIf;
    }

    public Exp getExp() {
        return exp;
    }

    public void setExp(Exp exp) {
        this.exp = exp;
    }

    public String getColone() {
        return Colone;
    }

    public void setColone(String colone) {
        Colone = colone;
    }

    public ArrayList<State> getStates() {
        return states;
    }

    public void setStates(ArrayList<State> states) {
        this.states = states;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder("IfPython{");

        if (If != null) {
            sb.append("If='").append(If).append(",");
        }
        if (exp != null) {
            sb.append("exp=").append(exp).append(",");
        }
        if (Colone != null) {
            sb.append("Colone='").append(Colone).append(",");
        }
        if (states != null) {
            sb.append("states=").append(states).append(",");
        }

        sb.append("}");
        return sb.toString();
    }

}
