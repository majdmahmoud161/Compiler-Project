package AST;

import java.util.ArrayList;
import java.util.List;

public class RoutDecl {
    String at;
    String id;
    String dot;
    String route;
    String openprac;
    String routepath;
    String comma;
    Methods methods;
    String closeprac;
    List<RoutState> routStates = new ArrayList<>();

    public String getAt() {
        return at;
    }

    public void setAt(String at) {
        this.at = at;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getDot() {
        return dot;
    }

    public void setDot(String dot) {
        this.dot = dot;
    }

    public String getRoute() {
        return route;
    }

    public void setRoute(String route) {
        this.route = route;
    }

    public String getOpenprac() {
        return openprac;
    }

    public void setOpenprac(String openprac) {
        this.openprac = openprac;
    }

    public String getRoutepath() {
        return routepath;
    }

    public void setRoutepath(String routepath) {
        this.routepath = routepath;
    }

    public String getComma() {
        return comma;
    }

    public void setComma(String comma) {
        this.comma = comma;
    }

    public Methods getMethods() {
        return methods;
    }

    public void setMethods(Methods methods) {
        this.methods = methods;
    }

    public String getCloseprac() {
        return closeprac;
    }

    public void setCloseprac(String closeprac) {
        this.closeprac = closeprac;
    }

    public List<RoutState> getRoutStates() {
        return routStates;
    }

    public void setRoutStates(List<RoutState> routStates) {
        this.routStates = routStates;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder("RouteDecl { \n");

        sb.append("at = ").append(at).append(",").append("\n");


        sb.append("id = ").append(id).append(",").append("\n");
        sb.append("dot = ").append(dot).append(",").append("\n");
        sb.append("route = ").append(route).append(",").append("\n");

        sb.append("openprac = ").append(openprac).append(",").append("\n");
        sb.append("routepath = ").append(routepath).append(",").append("\n");

        if(comma != null){
            sb.append("comma = ").append(comma).append(",").append("\n");
        }
        if(methods != null){
            sb.append("methods = ").append(methods).append(",").append("\n");
        }

        sb.append("closeprac = ").append(closeprac).append(",").append("\n");

        if(routStates != null && !(routStates.isEmpty())){
            sb.append("routStates = ").append(routStates).append("\n");
        }
        return sb + " \n }";
    }
}
