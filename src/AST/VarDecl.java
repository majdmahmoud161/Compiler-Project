package AST;

public class VarDecl  extends  State{

    String id;
    String equals;
    Value value;
    Exp exp;
    Arr arr;

    public Exp getExp() {
        return exp;
    }

    public void setExp(Exp exp) {
        this.exp = exp;
    }

    public Arr getArr() {
        return arr;
    }

    public void setArr(Arr arr) {
        this.arr = arr;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getEquals() {
        return equals;
    }

    public void setEquals(String equals) {
        this.equals = equals;
    }

    public Value getValue() {
        return value;
    }

    public void setValue(Value value) {
        this.value = value;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder("VarDecl {");
        if(id != null){
            sb.append("id : ").append(id).append(",");
        }
        if(arr != null){
            sb.append("arr : ").append(arr).append(",");
        }
        if(equals != null){
            sb.append("equals : ").append(equals).append(",");
        }
        if(value != null){
            sb.append("value : ").append(value);
        }
        if(exp != null){
            sb.append("exp : ").append(exp);
        }
        return sb + " }";
    }
}
