package AST;

import java.util.ArrayList;

public class ElsePython  {
    String Else;
    String Colone;
    ArrayList<State> states = new ArrayList<>();

    public String getElse() {
        return Else;
    }

    public void setElse(String anElse) {
        Else = anElse;
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
        StringBuilder sb = new StringBuilder("ElsePython {\n");

        if (Else != null) {
            sb.append("Else='").append(Else).append(",");
        }
        if (Colone != null) {
            sb.append("Colone='").append(Colone).append(",");
        }
        if (states != null) {
            sb.append("states=").append(states).append(",");
        }

        sb.append("\n}");
        return sb.toString();
    }

}
