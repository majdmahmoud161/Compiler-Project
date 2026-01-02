package AST;

public class Run {
    String run;
    String openprac;
    String debug;
    String equals;
    String trueBool;
    String closeprac;

    public String getRun() {
        return run;
    }

    public void setRun(String run) {
        this.run = run;
    }

    public String getOpenprac() {
        return openprac;
    }

    public void setOpenprac(String openprac) {
        this.openprac = openprac;
    }

    public String getDebug() {
        return debug;
    }

    public void setDebug(String debug) {
        this.debug = debug;
    }

    public String getEquals() {
        return equals;
    }

    public void setEquals(String equals) {
        this.equals = equals;
    }

    public String getTrueBool() {
        return trueBool;
    }

    public void setTrueBool(String trueBool) {
        this.trueBool = trueBool;
    }

    public String getCloseprac() {
        return closeprac;
    }

    public void setCloseprac(String closeprac) {
        this.closeprac = closeprac;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder("Run { \n");
        sb.append("run = ").append(run).append(",").append("\n");
        sb.append("openprac  = ").append(openprac).append(",").append("\n");
        sb.append("debug = ").append(debug).append(",").append("\n");
        sb.append("equals = ").append(equals).append(",").append("\n");
        sb.append("trueBool = ").append(trueBool).append(",").append("\n");
        sb.append("closeprac = ").append(closeprac).append(",").append("\n");
        return sb + " } \n";
    }
}
