package AST;

public class Buildinfunc {
    String Print;
    String Type;
    String Input;
    String Len;
    String Pop;
    String Get;

    public String getPrint() {
        return Print;
    }

    public void setPrint(String print) {
        Print = print;
    }

    public String getType() {
        return Type;
    }

    public void setType(String type) {
        Type = type;
    }

    public String getInput() {
        return Input;
    }

    public void setInput(String input) {
        Input = input;
    }

    public String getLen() {
        return Len;
    }

    public void setLen(String len) {
        Len = len;
    }

    public String getPop() {
        return Pop;
    }

    public void setPop(String pop) {
        Pop = pop;
    }

    public String getGet() {
        return Get;
    }

    public void setGet(String get) {
        Get = get;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder("BuildFunc {\n ");
        if(Input != null){
            sb.append("Input : ").append(Input);
        }
        if(Pop != null){
            sb.append("Pop : ").append(Pop);
        }
        if(Get != null){
            sb.append("Get : ").append(Get);
        }
        if(Len != null){
            sb.append("Len : ").append(Len);
        }
        if(Print != null){
            sb.append("Print : ").append(Print);
        }
        if(Type != null){
            sb.append("Type : ").append(Type);
        }
        return sb + "\n}";
    }
}
