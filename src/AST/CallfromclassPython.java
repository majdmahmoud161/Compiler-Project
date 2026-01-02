package AST;

import java.util.ArrayList;

public class CallfromclassPython extends State{
    String Dot;
    ArrayList<String>Id = new ArrayList<>();
    Callfunction callFunc;

    public Callfunction getCallFunc() {
        return callFunc;
    }

    public void setCallFunc(Callfunction callFunc) {
        this.callFunc = callFunc;
    }

    public String getDot() {
        return Dot;
    }

    public void setDot(String dot) {
        Dot = dot;
    }

    public ArrayList<String> getId() {
        return Id;
    }

    public void setId(ArrayList<String> id) {
        Id = id;
    }
    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder("CallfromclassPython {\n ");

        if (Dot != null) {
            sb.append("Dot='").append(Dot).append(",");
        }
        if (Id != null) {
            sb.append("Id=").append(Id).append(",");
        }
        if(callFunc != null){
            sb.append("callFunc : ").append(callFunc).append(",");
        }
        sb.append("\n}");
        return sb.toString();
    }

}
