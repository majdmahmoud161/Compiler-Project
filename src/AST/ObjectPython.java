package AST;

import java.util.ArrayList;

public class ObjectPython  extends State{
   ArrayList<String> Id = new ArrayList<>();
       String Equals;
       String OpenPrac;
       String Self;
       String Comma;
       ParaList paraList;
       String ClosePrac;

    public ArrayList<String> getId() {
        return Id;
    }

    public void setId(ArrayList<String> id) {
        Id = id;
    }

    public String getEquals() {
        return Equals;
    }

    public void setEquals(String equals) {
        Equals = equals;
    }

    public String getOpenPrac() {
        return OpenPrac;
    }

    public void setOpenPrac(String openPrac) {
        OpenPrac = openPrac;
    }

    public String getSelf() {
        return Self;
    }

    public void setSelf(String self) {
        Self = self;
    }

    public String getComma() {
        return Comma;
    }

    public void setComma(String comma) {
        Comma = comma;
    }

    public ParaList getParaList() {
        return paraList;
    }

    public void setParaList(ParaList paraList) {
        this.paraList = paraList;
    }

    public String getClosePrac() {
        return ClosePrac;
    }

    public void setClosePrac(String closePrac) {
        ClosePrac = closePrac;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder("ObjectPython{\n");

        if (Id != null) {
            sb.append("Id='").append(Id).append("'\n");
        }
        if (Equals != null) {
            sb.append("Equals='").append(Equals).append("'\n");
        }
        if (OpenPrac != null) {
            sb.append("OpenPrac='").append(OpenPrac).append("'\n");
        }
        if (Self != null) {
            sb.append("Self='").append(Self).append("'\n");
        }
        if (Comma != null) {
            sb.append("Comma='").append(Comma).append("'\n");
        }
        if (paraList != null) {
            sb.append("paraList=").append(paraList).append("\n");
        }
        if (ClosePrac != null) {
            sb.append("ClosePrac='").append(ClosePrac).append("'\n");
        }

        sb.append("}");
        return sb.toString();
    }

}
