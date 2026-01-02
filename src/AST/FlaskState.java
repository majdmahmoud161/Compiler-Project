package AST;

import java.util.ArrayList;
import java.util.List;

public class FlaskState{

    List<State> states = new ArrayList<>();
    List<RoutDecl> routDecls = new ArrayList<>();
    List<AppConfig> appConfigs = new ArrayList<>();

    public List<State> getStates() {
        return states;
    }

    public void setStates(List<State> states) {
        this.states = states;
    }

    public List<RoutDecl> getRoutDecls() {
        return routDecls;
    }

    public void setRoutDecls(List<RoutDecl> routDecls) {
        this.routDecls = routDecls;
    }

    public List<AppConfig> getAppConfigs() {
        return appConfigs;
    }

    public void setAppConfigs(List<AppConfig> appConfigs) {
        this.appConfigs = appConfigs;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder("FlaskState { \n");
        if(states != null && !(states.isEmpty())){
            sb.append("states = ").append(states).append("\n");
        }
        if(routDecls != null && !(routDecls.isEmpty())){
            sb.append("routDecls = ").append(routDecls).append("\n");
        }
        if(appConfigs != null && !(appConfigs.isEmpty())){
            sb.append("appConfigs = ").append(appConfigs).append("\n");
        }

        return sb + "\n }";
    }
}
