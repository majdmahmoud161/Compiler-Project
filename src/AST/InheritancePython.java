package AST;

import java.util.ArrayList;

public class InheritancePython extends State{
    String Classi;
    ArrayList<String> Id = new ArrayList<>();
    ArrayList<String> OpenPrac = new ArrayList<>();
    ArrayList< String> ClosePrac = new ArrayList<>();
    String Colone;
    String Super;
    String Dot;
    String Init;
    ArrayList<State>states = new ArrayList<>();

    public String getClassi() {
        return Classi;
    }

    public void setClassi(String classi) {
        Classi = classi;
    }

    public ArrayList<String> getId() {
        return Id;
    }

    public void setId(ArrayList<String> id) {
        Id = id;
    }

    public ArrayList<String> getOpenPrac() {
        return OpenPrac;
    }

    public void setOpenPrac(ArrayList<String> openPrac) {
        OpenPrac = openPrac;
    }

    public ArrayList<String> getClosePrac() {
        return ClosePrac;
    }

    public void setClosePrac(ArrayList<String> closePrac) {
        ClosePrac = closePrac;
    }

    public String getColone() {
        return Colone;
    }

    public void setColone(String colone) {
        Colone = colone;
    }

    public String getSuper() {
        return Super;
    }

    public void setSuper(String aSuper) {
        Super = aSuper;
    }

    public String getDot() {
        return Dot;
    }

    public void setDot(String dot) {
        Dot = dot;
    }

    public String getInit() {
        return Init;
    }

    public void setInit(String init) {
        Init = init;
    }

    public ArrayList<State> getStates() {
        return states;
    }

    public void setStates(ArrayList<State> states) {
        this.states = states;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder("InheritancePython {\n");

        if (Classi != null) {
            sb.append("Classi =").append(Classi).append(",");
        }
        if (Id != null) {
            sb.append("Id =").append(Id).append(",");
        }
        if (OpenPrac != null) {
            sb.append("OpenPrac =").append(OpenPrac).append(",");
        }
        if (ClosePrac != null) {
            sb.append("ClosePrac =").append(ClosePrac).append(",");
        }
        if (Colone != null) {
            sb.append("Colone =").append(Colone).append(",");
        }
        if (Super != null) {
            sb.append("Super =").append(Super).append(",");
        }
        if (Dot != null) {
            sb.append("Dot =").append(Dot).append(",");
        }
        if (Init != null) {
            sb.append("Init =").append(Init).append(",");
        }
        if (states != null) {
            sb.append("states =").append(states).append(",");
        }

        sb.append("\n}");
        return sb.toString();
    }

}
