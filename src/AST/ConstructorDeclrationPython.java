package AST;

import java.util.ArrayList;

public class ConstructorDeclrationPython {
//: DEF INIT OPENPRAC (SELF (COMMA)? paralist)? CLOSEPRAC COLONE (SELF DOT ID EQUALS value)* state*
     String Def;
     String Init;
     String Openprac;
     String Closeprac;
     String Colone;
     String Comma;
     ArrayList<String> Dot = new ArrayList<>();
     ArrayList<String>Id = new ArrayList<>();
     ArrayList<String> Self = new ArrayList<>();
     ArrayList<String>Equals = new ArrayList<>();
     ArrayList<State>states = new ArrayList<>();
     ArrayList <Value>values = new ArrayList<>();
     ParaList paraLists;

    public String getDef() {
        return Def;
    }

    public void setDef(String def) {
        Def = def;
    }

    public String getInit() {
        return Init;
    }

    public void setInit(String init) {
        Init = init;
    }

    public String getOpenprac() {
        return Openprac;
    }

    public void setOpenprac(String openprac) {
        Openprac = openprac;
    }

    public String getCloseprac() {
        return Closeprac;
    }

    public void setCloseprac(String closeprac) {
        Closeprac = closeprac;
    }

    public String getColone() {
        return Colone;
    }

    public void setColone(String colone) {
        Colone = colone;
    }

    public String getComma() {
        return Comma;
    }

    public void setComma(String comma) {
        Comma = comma;
    }

    public ArrayList<String> getDot() {
        return Dot;
    }

    public void setDot(ArrayList<String> dot) {
        Dot = dot;
    }

    public ArrayList<String> getId() {
        return Id;
    }

    public void setId(ArrayList<String> id) {
        Id = id;
    }

    public ArrayList<String> getSelf() {
        return Self;
    }

    public void setSelf(ArrayList<String> self) {
        Self = self;
    }

    public ArrayList<String> getEquals() {
        return Equals;
    }

    public void setEquals(ArrayList<String> equals) {
        Equals = equals;
    }

    public ArrayList<State> getStates() {
        return states;
    }

    public void setStates(ArrayList<State> states) {
        this.states = states;
    }

    public ArrayList<Value> getValues() {
        return values;
    }

    public void setValues(ArrayList<Value> values) {
        this.values = values;
    }

    public ParaList getParaLists() {
        return paraLists;
    }

    public void setParaLists(ParaList paraLists) {
        this.paraLists = paraLists;
    }

    @Override
    public String toString() {
        return "ConstructorDeclrationPython{" +
                "Def='" + Def + '\'' +
                ", Init='" + Init + '\'' +
                ", Openprac='" + Openprac + '\'' +
                ", Closeprac='" + Closeprac + '\'' +
                ", Colone='" + Colone + '\'' +
                ", Comma='" + Comma + '\'' +
                ", Dot=" + Dot +
                ", Id=" + Id +
                ", Self=" + Self +
                ", Equals=" + Equals +
                ", states=" + states +
                ", values=" + values +
                ", paraLists=" + paraLists +
                '}';
    }
}
