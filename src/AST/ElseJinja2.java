package AST;

public class ElseJinja2  extends ConditionJinja2{
    String OpenCondition;
   String  Else;
    String CloseCondition;

    public String getOpenCondition() {
        return OpenCondition;
    }

    public void setOpenCondition(String openCondition) {
        OpenCondition = openCondition;
    }

    public String getElse() {
        return Else;
    }

    public void setElse(String anElse) {
        Else = anElse;
    }

    public String getCloseCondition() {
        return CloseCondition;
    }

    public void setCloseCondition(String closeCondition) {
        CloseCondition = closeCondition;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder("ElseJinja2{\n");

        if (OpenCondition != null) {
            sb.append("OpenCondition='").append(OpenCondition).append("'\n");
        }
        if (Else != null) {
            sb.append("Else='").append(Else).append("'\n");
        }
        if (CloseCondition != null) {
            sb.append("CloseCondition='").append(CloseCondition).append("'\n");
        }

        sb.append("\n}");
        return sb.toString();
    }

}
