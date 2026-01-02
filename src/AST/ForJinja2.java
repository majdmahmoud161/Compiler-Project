package AST;

import java.util.ArrayList;

public class ForJinja2 extends ConditionJinja2{
   ArrayList< String> OpenCondition = new ArrayList<>();
    String For;
    ArrayList<String> Id = new ArrayList<>();
    String  In;
    String Int;
    ArrayList<String> CloseCondition = new ArrayList<>();
    String EndFor;
    ArrayList<StateJinja2> stateJinja2 = new ArrayList<>();


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

    public String getFor() {
        return For;
    }

    public void setFor(String aFor) {
        For = aFor;
    }



    public String getIn() {
        return In;
    }

    public void setIn(String in) {
        In = in;
    }

    public String getInt() {
        return Int;
    }

    public void setInt(String anInt) {
        Int = anInt;
    }



    public String getEndFor() {
        return EndFor;
    }

    public void setEndFor(String endFor) {
        EndFor = endFor;
    }


    public ArrayList<StateJinja2> getStateJinja2() {
        return stateJinja2;
    }

    public void setStateJinja2(ArrayList<StateJinja2> stateJinja2) {
        this.stateJinja2 = stateJinja2;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder("ForJinja2{\n");

        if (OpenCondition != null) {
            sb.append("OpenCondition='").append(OpenCondition).append("'\n");
        }
        if (For != null) {
            sb.append("For='").append(For).append("'\n");
        }
        if (Id != null) {
            sb.append("Id='").append(Id).append("'\n");
        }
        if (In != null) {
            sb.append("In='").append(In).append("'\n");
        }
        if (Int != null) {
            sb.append("Int='").append(Int).append("'\n");
        }
        if (CloseCondition != null) {
            sb.append("CloseCondition='").append(CloseCondition).append("'\n");
        }
        if (EndFor != null) {
            sb.append("EndFor='").append(EndFor).append("'\n");
        }
        if (stateJinja2 != null) {
            sb.append("stateJinja2=").append(stateJinja2).append("\n");
        }

        sb.append("}");
        return sb.toString();
    }



}
