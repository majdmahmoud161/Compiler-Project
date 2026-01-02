package AST;

import java.util.ArrayList;

public class FunctionDeclrationPython extends State{
     String Def;
      String Id;
      String OpenPrac;
      ParaList paraList;
      String ClosePrac;
      String Colone;
      ArrayList<State>states = new ArrayList<>();
      Return returnp;

  public String getDef() {
    return Def;
  }

  public void setDef(String def) {
    Def = def;
  }

  public String getId() {
    return Id;
  }

  public void setId(String id) {
    Id = id;
  }

  public String getOpenPrac() {
    return OpenPrac;
  }

  public void setOpenPrac(String openPrac) {
    OpenPrac = openPrac;
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

  public Return getReturnp() {
    return returnp;
  }

  public void setReturnp(Return returnp) {
    this.returnp = returnp;
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder("FunctionDeclrationPython {");

    if (Def != null) {
      sb.append("Def =").append(Def).append(",");
    }
    if (Id != null) {
      sb.append("Id =").append(Id).append(",");
    }
    if (OpenPrac != null) {
      sb.append("OpenPrac =").append(OpenPrac).append(",");
    }
    if (paraList != null) {
      sb.append("paraList =").append(paraList).append(",");
    }
    if (ClosePrac != null) {
      sb.append("ClosePrac =").append(ClosePrac).append(",");
    }
    if (Colone != null) {
      sb.append("Colone =").append(Colone).append(",");
    }
    if (states != null && !(states.isEmpty())) {
      sb.append("states =").append(states).append(",");
    }
    if (returnp != null) {
      sb.append("returnp =").append(returnp).append(",");
    }
    sb.append("}");
    return sb.toString();
  }

}
