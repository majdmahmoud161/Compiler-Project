package AST;

import java.util.ArrayList;
import java.util.List;

public class Program extends ASTNode{

    List<State> states = new ArrayList<>();
    List<Flask> flasks = new ArrayList<>();

    List<StateJinja2> stateJinja2s = new ArrayList<>();

    List<Document> documents = new ArrayList<>();

    public List<Document> getDocuments() {
        return documents;
    }

    public void setDocuments(List<Document> documents) {
        this.documents = documents;
    }

    public List<StateJinja2> getStateJinja2s() {
        return stateJinja2s;
    }

    public void setStateJinja2s(List<StateJinja2> stateJinja2s) {
        this.stateJinja2s = stateJinja2s;
    }

    public List<Flask> getFlasks() {
        return flasks;
    }

    public void setFlasks(List<Flask> flasks) {
        this.flasks = flasks;
    }

    public List<State> getStates() {
        return states;
    }

    public void setStates(List<State> states) {
        this.states = states;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder("Program { \n");
            if(states != null){
                sb.append("state = ").append(states).append(",");
            }
            if(flasks != null){
                sb.append("flasks = ").append(flasks).append(",");
            }
            if(stateJinja2s != null){
                sb.append("stateJinja2s = ").append(stateJinja2s).append(",");
            }
            if(documents != null){
                sb.append("documents = ").append(documents).append(",");
            }
        return sb + "} \n";
    }
}
