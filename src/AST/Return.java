package AST;

public class Return {
    String Returnp;
       Value value;



    public Value getValue() {
        return value;
    }

    public String getReturnp() {
        return Returnp;
    }

    public void setReturnp(String returnp) {
        Returnp = returnp;
    }

    public void setValue(Value value) {
        this.value = value;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder("Return {");

        if (Returnp != null) {
            sb.append("Return =").append(Returnp).append(",");
        }
        if (value != null) {
            sb.append("value =").append(value).append(",");
        }

        sb.append("}");
        return sb.toString();
    }

}
