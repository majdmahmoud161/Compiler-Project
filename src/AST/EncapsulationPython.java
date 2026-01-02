package AST;

public class EncapsulationPython {
//    PRIVATE var_decl| PROTECTED var_decl
        String Private;
        String Protected;
        VarDecl varDeclrationPython;

    public String getPrivate() {
        return Private;
    }

    public void setPrivate(String aPrivate) {
        Private = aPrivate;
    }

    public String getProtected() {
        return Protected;
    }

    public void setProtected(String aProtected) {
        Protected = aProtected;
    }

    public VarDecl getVarDeclrationPython() {
        return varDeclrationPython;
    }

    public void setVarDeclrationPython(VarDecl varDeclrationPython) {
        this.varDeclrationPython = varDeclrationPython;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder("EncapsulationPython {\n ");

        if (Private != null) {
            sb.append("Private='").append(Private).append(",");
        }
        if (Protected != null) {
            sb.append("Protected='").append(Protected).append(",");
        }
        if (varDeclrationPython != null) {
            sb.append("varDeclrationPython=").append(varDeclrationPython).append(",");
        }

        sb.append("\n}");
        return sb.toString();
    }

}
