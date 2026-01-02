package AST;

public class WhileValue {
    String Int;
    String string;
    String Double ;
    String id;
    String truebool;
    String falsebool;
    Exp exp;


    public String getInt() {
        return Int;
    }

    public void setInt(String anInt) {
        Int = anInt;
    }

    public String getString() {
        return string;
    }

    public void setString(String string) {
        this.string = string;
    }

    public String getDouble() {
        return Double;
    }

    public void setDouble(String aDouble) {
        Double = aDouble;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getTruebool() {
        return truebool;
    }

    public void setTruebool(String truebool) {
        this.truebool = truebool;
    }

    public String getFalsebool() {
        return falsebool;
    }

    public void setFalsebool(String falsebool) {
        this.falsebool = falsebool;
    }

    public Exp getExp() {
        return exp;
    }

    public void setExp(Exp exp) {
        this.exp = exp;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder("WhileValue {");
        if(Int != null){
            sb.append("Int = ").append(Int).append(",");
        }
        if(string != null){
            sb.append("string = ").append(string).append(",");
        }
        if(Double != null){
            sb.append("Double = ").append(Double).append(",");
        }
        if(id != null){
            sb.append("id = ").append(id).append(",");
        }
        if(truebool != null){
            sb.append("truebool = ").append(truebool).append(",");
        }
        if(falsebool != null){
            sb.append("falsebool = ").append(falsebool).append(",");
        }
        if(exp != null){
            sb.append("exp = ").append(exp).append(",");
        }
        return sb + "}";
    }
}
