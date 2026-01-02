package AST;

import java.util.ArrayList;

public class ClassDeclrationPython extends State{

    String ClassP;
    String Id;
    String Colone;
    ArrayList<State>states = new ArrayList<>();
    ArrayList<EncapsulationPython>encapsulationPythons = new ArrayList<>();
    ArrayList<ConstructorDeclrationPython>constructorDeclrationPythons = new ArrayList<>();

    public String getClassP() {
        return ClassP;
    }

    public void setClassP(String classP) {
        ClassP = classP;
    }

    public String getId() {
        return Id;
    }

    public void setId(String id) {
        Id = id;
    }

    public String getColone() {
        return Colone;
    }

    public void setColone(String colone) {
        Colone = colone;
    }

    public ArrayList<State> getStates() {
        return states;
    }

    public void setStates(ArrayList<State> states) {
        this.states = states;
    }

    public ArrayList<EncapsulationPython> getEncapsulationPythons() {
        return encapsulationPythons;
    }

    public void setEncapsulationPythons(ArrayList<EncapsulationPython> encapsulationPythons) {
        this.encapsulationPythons = encapsulationPythons;
    }

    public ArrayList<ConstructorDeclrationPython> getConstructorDeclrationPythons() {
        return constructorDeclrationPythons;
    }

    public void setConstructorDeclrationPythons(ArrayList<ConstructorDeclrationPython> constructorDeclrationPythons) {
        this.constructorDeclrationPythons = constructorDeclrationPythons;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder("ClassDeclrationPython {\n");

        if (ClassP != null) {
            sb.append("ClassP='").append(ClassP).append(",");
        }
        if (Id != null) {
            sb.append("Id='").append(Id).append(",");
        }
        if (Colone != null) {
            sb.append("Colone='").append(Colone).append(",");
        }
        if (states != null) {
            sb.append("states=").append(states).append(",");
        }
        if (encapsulationPythons != null) {
            sb.append("encapsulationPythons=").append(encapsulationPythons).append(",");
        }
        if (constructorDeclrationPythons != null) {
            sb.append("constructorDeclrationPythons=").append(constructorDeclrationPythons).append(",");
        }

        sb.append("\n }");
        return sb.toString();
    }

}
