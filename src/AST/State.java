package AST;

public class State extends ASTNode{

    FunctionDeclrationPython functionDeclrationPython;

    public FunctionDeclrationPython getFunctionDeclrationPython() {
        return functionDeclrationPython;
    }

    public void setFunctionDeclrationPython(FunctionDeclrationPython functionDeclrationPython) {
        this.functionDeclrationPython = functionDeclrationPython;
    }

    @Override
    public String toString() {
        return "State{" +
                "functionDeclrationPython=" + functionDeclrationPython +
                '}';
    }
}
