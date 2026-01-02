package AST;

import java.util.ArrayList;

public class CallFromClass {
    String Dot;
    ArrayList<String> Id;
//    CallFunc callFunc;

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
        StringBuilder sb = new StringBuilder("CallfromclassPython {\n");

        if (Dot != null) {
            sb.append("Dot='").append(Dot).append(",");
        }
        if (Id != null) {
            sb.append("Id=").append(Id).append(",");
        }

        sb.append("\n}");
        return sb.toString();
    }
}
