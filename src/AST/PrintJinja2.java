package AST;

import java.util.ArrayList;

public class PrintJinja2 {
   String DoubleOpenkpra;
   ArrayList<String> Id = new ArrayList<>() ;
   String Dot;
   String DoubleClosekpra;

    public String getDoubleOpenkpra() {
        return DoubleOpenkpra;
    }

    public void setDoubleOpenkpra(String doubleOpenkpra) {
        DoubleOpenkpra = doubleOpenkpra;
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

    public String getDoubleClosekpra() {
        return DoubleClosekpra;
    }

    public void setDoubleClosekpra(String doubleClosekpra) {
        DoubleClosekpra = doubleClosekpra;
    }
    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder("PrintJinja2{\n");
        if (DoubleOpenkpra != null){
            sb.append("DoubleOpenkpra='").append(DoubleOpenkpra).append("'\n");
        }
        if (Dot != null){
            sb.append("Dot='").append(Dot).append("'\n");
        }
        if (Id !=null){
            sb.append("Id='").append(Id).append("'\n");
        }
        if (DoubleClosekpra!=null){
            sb.append("DoubleClosekpra='").append(DoubleClosekpra).append("'\n");
        }
        return sb.toString();
    }
}
