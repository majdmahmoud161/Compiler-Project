package AST;

import java.util.ArrayList;
import java.util.List;

public class LibraryList {

    List<LibraryValue> libraryValue = new ArrayList<>();
    List<String> Comma = new ArrayList<>();

    public List<LibraryValue> getLibraryValue() {
        return libraryValue;
    }

    public void setLibraryValue(List<LibraryValue> libraryValue) {
        this.libraryValue = libraryValue;
    }

    public List<String> getComma() {
        return Comma;
    }

    public void setComma(List<String> comma) {
        Comma = comma;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder("LibraryList { \n");
        if(libraryValue != null && !(libraryValue.isEmpty())){
            sb.append("LibraryValue = ").append(libraryValue).append(",");
        }
        if(Comma != null && !(Comma.isEmpty())){
            sb.append("Comma = ").append(Comma);
        }
        return sb + "\n }";
    }
}
