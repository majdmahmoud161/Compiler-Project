package AST;

import java.util.ArrayList;
import java.util.List;

public class FlaskFuncDecl {

    FunctionDeclrationPython functionDecl;
    List<RoutState> routStates = new ArrayList<>();
    FlaskReturn flaskReturn ;

    public FunctionDeclrationPython getFunctionDecl() {
        return functionDecl;
    }

    public void setFunctionDecl(FunctionDeclrationPython functionDecl) {
        this.functionDecl = functionDecl;
    }

    public List<RoutState> getRoutStates() {
        return routStates;
    }

    public void setRoutStates(List<RoutState> routStates) {
        this.routStates = routStates;
    }

    public FlaskReturn getFlaskReturn() {
        return flaskReturn;
    }

    public void setFlaskReturn(FlaskReturn flaskReturn) {
        this.flaskReturn = flaskReturn;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder("FlaskFucDecl { \n");
        sb.append("functionDecl = ").append(functionDecl).append(",").append("\n");
        if(routStates != null && !(routStates.isEmpty())){
            sb.append("routStates = ").append(routStates).append(",").append("\n");
        }
        if(flaskReturn != null){
            sb.append("flaskReturn = ").append(flaskReturn).append("\n");
        }

        return sb + " } \n";
    }
}
