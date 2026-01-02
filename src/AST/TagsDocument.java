package AST;

import java.sql.Array;
import java.util.ArrayList;
import java.util.List;

public class TagsDocument extends Document {
    List<TagType>tagTypes=new ArrayList<>();
    List<String> ID = new ArrayList<>();


    public List<TagType> getTagTypes() {
        return tagTypes;
    }

    public void setTagTypes(List<TagType> tagTypes) {
        this.tagTypes = tagTypes;
    }

    public List<String> getID() {
        return ID;
    }

    public void setID(List<String> ID) {
        this.ID = ID;
    }

    public String toString() {
        StringBuilder sb=new StringBuilder("TagsDocument{\n");

        if(tagTypes!=null && !tagTypes.isEmpty()){
            sb.append("tagTypes=").append(tagTypes).append("\n");
        }
        if(ID!=null && !ID.isEmpty() ){
            sb.append("ID=").append(ID).append("\n");
        }
        sb.append("}");
        return sb.toString();
    }
}
