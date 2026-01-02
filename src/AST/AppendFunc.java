package AST;

public class AppendFunc {
//    APPEND OPENPRAC appendvar? CLOSEPRAC

    String append;
    String openprac;
    AppendVar appendvar;
    String closeprac;

    public String getAppend() {
        return append;
    }

    public void setAppend(String append) {
        this.append = append;
    }

    public String getOpenprac() {
        return openprac;
    }

    public void setOpenprac(String openprac) {
        this.openprac = openprac;
    }

    public AppendVar getAppendvar() {
        return appendvar;
    }

    public void setAppendvar(AppendVar appendvar) {
        this.appendvar = appendvar;
    }

    public String getCloseprac() {
        return closeprac;
    }

    public void setCloseprac(String closeprac) {
        this.closeprac = closeprac;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder("AppendFunc {\n ");
        sb.append("append = ").append(append).append(",");
        sb.append("openprac = ").append(openprac).append(",");
        if(appendvar != null){
            sb.append("appendvar = ").append(appendvar).append(",");
        }
        sb.append("closeprac = ").append(closeprac);
        return sb + "\n} ";
    }
}
