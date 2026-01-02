package AST;

public class Value {
    String Int;
    String string;
    String Double ;
    String id;
    Arr arr ;
    String truebool;
    String falsebool;
    String none;

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

    public Arr getArr() {
        return arr;
    }

    public void setArr(Arr arr) {
        this.arr = arr;
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

    public String getNone() {
        return none;
    }

    public void setNone(String none) {
        this.none = none;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder("Value {");
        if(Int != null){
            sb.append("Int = ").append(Int);
        }
        if(string != null){
            sb.append("string = ").append(string);
        }
        if(Double != null){
            sb.append("Double = ").append(Double);
        }
        if(id != null){
            sb.append("id = ").append(id);
        }
        if(arr != null){
            sb.append("arr = ").append(arr);
        }
        if(none != null){
            sb.append("none = ").append(none);
        }
        if(truebool != null){
            sb.append("truebool = ").append(truebool);
        }
        if(falsebool != null){
            sb.append("falsebool = ").append(falsebool);
        }

        return sb + "}";
    }
}
