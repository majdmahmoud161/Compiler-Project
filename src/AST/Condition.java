package AST;

public class Condition extends State{

    IfPython ifPython;
    ElifPython elifPython;
    ElsePython elsePython;

    public IfPython getIfPython() {
        return ifPython;
    }

    public void setIfPython(IfPython ifPython) {
        this.ifPython = ifPython;
    }

    public ElifPython getElifPython() {
        return elifPython;
    }

    public void setElifPython(ElifPython elifPython) {
        this.elifPython = elifPython;
    }

    public ElsePython getElsePython() {
        return elsePython;
    }

    public void setElsePython(ElsePython elsePython) {
        this.elsePython = elsePython;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder("Condition {\n ");
        if(ifPython != null){
            sb.append("ifPython = ").append(ifPython).append(",");
        }
        if(elifPython != null){
            sb.append("elifPython = ").append(elifPython).append(",");
        }
        if(elsePython != null){
            sb.append("elsePython = ").append(elsePython).append(",");
        }

        return sb + "\n}";
    }
}
