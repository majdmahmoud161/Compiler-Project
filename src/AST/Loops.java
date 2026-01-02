package AST;

public class Loops extends State{

    For aFor;
    While aWhile;

    public For getaFor() {
        return aFor;
    }

    public void setaFor(For aFor) {
        this.aFor = aFor;
    }

    public While getaWhile() {
        return aWhile;
    }

    public void setaWhile(While aWhile) {
        this.aWhile = aWhile;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder("Loops {\n");
        if(aFor != null){
            sb.append("aFor = ").append(aFor);
        }
        if(aWhile != null){
            sb.append("aWhile").append(aWhile);
        }

        return sb + "\n} ";
    }
}
