package AST;

public class RoutState {
    VarFlaskDecl varFlaskDecl;
    ArrDecl arrDecl ;
    Loops loops;
    FlaskCondition flaskCondition;
    FlaskExp flaskExp;
    FlaskFuncDecl flaskFuncDecl;
    Callfunction callFunc;
    Object fObject ;
    CallfromclassPython callFromClass;
    FlaskReturn flaskReturn;

    public VarFlaskDecl getVarFlaskDecl() {
        return varFlaskDecl;
    }

    public void setVarFlaskDecl(VarFlaskDecl varFlaskDecl) {
        this.varFlaskDecl = varFlaskDecl;
    }

    public ArrDecl getArrDecl() {
        return arrDecl;
    }

    public void setArrDecl(ArrDecl arrDecl) {
        this.arrDecl = arrDecl;
    }

    public Loops getLoops() {
        return loops;
    }

    public void setLoops(Loops loops) {
        this.loops = loops;
    }

    public FlaskCondition getFlaskCondition() {
        return flaskCondition;
    }

    public void setFlaskCondition(FlaskCondition flaskCondition) {
        this.flaskCondition = flaskCondition;
    }

    public FlaskExp getFlaskExp() {
        return flaskExp;
    }

    public void setFlaskExp(FlaskExp flaskExp) {
        this.flaskExp = flaskExp;
    }

    public FlaskFuncDecl getFlaskFuncDecl() {
        return flaskFuncDecl;
    }

    public void setFlaskFuncDecl(FlaskFuncDecl flaskFuncDecl) {
        this.flaskFuncDecl = flaskFuncDecl;
    }

    public Callfunction getCallFunc() {
        return callFunc;
    }

    public void setCallFunc(Callfunction callFunc) {
        this.callFunc = callFunc;
    }

    public Object getfObject() {
        return fObject;
    }

    public void setfObject(Object fObject) {
        this.fObject = fObject;
    }

    public CallfromclassPython getCallFromClass() {
        return callFromClass;
    }

    public void setCallFromClass(CallfromclassPython callFromClass) {
        this.callFromClass = callFromClass;
    }

    public FlaskReturn getFlaskReturn() {
        return flaskReturn;
    }

    public void setFlaskReturn(FlaskReturn flaskReturn) {
        this.flaskReturn = flaskReturn;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder("RouteState { \n");
        if(varFlaskDecl != null){
            sb.append("varFlaskDecl = ").append(varFlaskDecl).append("\n");
        }
        if(arrDecl != null){
            sb.append("arrDecl = ").append(arrDecl).append("\n");
        }
        if(loops != null){
            sb.append("loops = ").append(loops).append("\n");
        }
        if(flaskCondition != null){
            sb.append("flaskCondition = ").append(flaskCondition).append("\n");
        }
        if(flaskExp != null){
            sb.append("flaskExp = ").append(flaskExp).append("\n");
        }
        if(flaskFuncDecl != null){
            sb.append("flaskFuncDecl = ").append(flaskFuncDecl).append("\n");
        }
        if(callFunc != null){
            sb.append("callFunc = ").append(callFunc).append("\n");
        }
        if(fObject != null){
            sb.append("fObject = ").append(fObject).append("\n");
        }
        if(callFromClass != null){
            sb.append("callFromClass = ").append(callFromClass).append("\n");
        }
        if(flaskReturn != null){
            sb.append("flaskReturn = ").append(flaskReturn).append("\n");
        }
        return sb + "} \n";
    }
}
