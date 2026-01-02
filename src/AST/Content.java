package AST;

import java.util.ArrayList;
import java.util.List;

public class Content {

    List<TagType>tagTypes=new ArrayList<>();
    List<StateJinja2>statejinja2s=new ArrayList<>();
    List<String>ID = new ArrayList<>();

    public List<TagType> getTagTypes() {
        return tagTypes;
    }

    public void setTagTypes(List<TagType> tagTypes) {
        this.tagTypes = tagTypes;
    }

    public List<StateJinja2> getStatejinja2s() {
        return statejinja2s;
    }

    public void setStatejinja2s(List<StateJinja2> statejinja2s) {
        this.statejinja2s = statejinja2s;
    }

    public List<String> getID() {
        return ID;
    }

    public void setID(List<String> ID) {
        this.ID = ID;
    }

    public String toString() {
        StringBuilder sb=new StringBuilder("Content{\n");

        if(tagTypes!=null && !tagTypes.isEmpty()){
            sb.append("tagTypes=").append(tagTypes).append("\n");
        }
        if(statejinja2s!=null && !statejinja2s.isEmpty()){
            sb.append("statejinja2s=").append(statejinja2s).append("\n");
        }
        if(ID!=null && !ID.isEmpty()){
            sb.append("ID=").append(ID).append("\n");
        }
        sb.append("}");
        return sb.toString();
    }
}
