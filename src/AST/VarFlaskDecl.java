package AST;

import java.util.ArrayList;
import java.util.List;

public class VarFlaskDecl {
    VarDecl varDecl;
    List<String> id = new ArrayList<>();
    String equals;
    RouteCall routeCall;
    String squerfilename;
    String openprac;
    String dot;
    String filename;
    String string ;
    String closeprac;

    public VarDecl getVarDecl() {
        return varDecl;
    }

    public void setVarDecl(VarDecl varDecl) {
        this.varDecl = varDecl;
    }

    public List<String> getId() {
        return id;
    }

    public void setId(List<String> id) {
        this.id = id;
    }

    public String getEquals() {
        return equals;
    }

    public void setEquals(String equals) {
        this.equals = equals;
    }

    public RouteCall getRouteCall() {
        return routeCall;
    }

    public void setRouteCall(RouteCall routeCall) {
        this.routeCall = routeCall;
    }

    public String getSquerfilename() {
        return squerfilename;
    }

    public void setSquerfilename(String squerfilename) {
        this.squerfilename = squerfilename;
    }

    public String getOpenprac() {
        return openprac;
    }

    public void setOpenprac(String openprac) {
        this.openprac = openprac;
    }

    public String getDot() {
        return dot;
    }

    public void setDot(String dot) {
        this.dot = dot;
    }

    public String getFilename() {
        return filename;
    }

    public void setFilename(String filename) {
        this.filename = filename;
    }

    public String getString() {
        return string;
    }

    public void setString(String string) {
        this.string = string;
    }

    public String getCloseprac() {
        return closeprac;
    }

    public void setCloseprac(String closeprac) {
        this.closeprac = closeprac;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder("VarFlaskDecl");
        if(varDecl != null){
            sb.append("varDecl = ").append(varDecl).append("\n");
        }
        if(id != null && !(id.isEmpty())){
            sb.append("id").append(id).append(",").append("\n");
        }
        if(equals != null){
            sb.append("equals = ").append(equals).append(",").append("\n");
        }
        if(routeCall != null){
            sb.append("routeCall = ").append(routeCall).append(",").append("\n");
        }
        if(squerfilename != null){
            sb.append("squerfilename = ").append(squerfilename).append(",").append("\n");
        }
        if(openprac != null){
            sb.append("openprac = ").append(openprac).append(",").append("\n");
        }
        if(dot != null){
            sb.append("dot = ").append(dot).append(",").append("\n");
        }
        if(filename != null){
            sb.append("filename = ").append(filename).append(",").append("\n");
        }
        if(string != null){
            sb.append("string = ").append(string).append(",").append("\n");
        }
        if(closeprac != null){
            sb.append("closeprac = ").append(closeprac).append("\n");
        }
        return sb + "} \n";
    }
}
