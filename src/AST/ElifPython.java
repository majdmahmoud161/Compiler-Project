package AST;

import java.util.ArrayList;

public class ElifPython {
        String ElIf;
        Exp exp;
        String Colone;
        ArrayList<State> states = new ArrayList<>();

    public String getElIf() {
        return ElIf;
    }

    public void setElIf(String elIf) {
        ElIf = elIf;
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
        StringBuilder sb = new StringBuilder("ElifPython {\n");

        if (ElIf != null) {
            sb.append("ElIf='").append(ElIf).append(",");
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

        sb.append("\n}");
        return sb.toString();
    }

}


