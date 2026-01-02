package AST;

import java.util.ArrayList;
import java.util.List;

public class StartTag {

    String TAG_OPEN;
    String TAG_CLOSE;
    TagName tagName ;
    List<Attribute>attribute=new ArrayList<>();

    public String getTAG_OPEN() {
        return TAG_OPEN;
    }

    public void setTAG_OPEN(String TAG_OPEN) {
        this.TAG_OPEN = TAG_OPEN;
    }

    public String getTAG_CLOSE() {
        return TAG_CLOSE;
    }

    public void setTAG_CLOSE(String TAG_CLOSE) {
        this.TAG_CLOSE = TAG_CLOSE;
    }

    public TagName getTagName() {
        return tagName;
    }

    public void setTagName(TagName tagName) {
        this.tagName = tagName;
    }

    public List<Attribute> getAttribute() {
        return attribute;
    }

    public void setAttribute(List<Attribute> attribute) {
        this.attribute = attribute;
    }

    @Override
    public String toString() {
        StringBuilder sb=new StringBuilder("StartTag{\n");

        if(TAG_OPEN!=null ){
            sb.append("TAG_OPEN=").append(TAG_OPEN).append("\n");
        }
        if(TAG_CLOSE!=null ){
            sb.append("TAG_CLOSE=").append(TAG_CLOSE).append("\n");
        }
        if(tagName!=null ){
            sb.append("tagName=").append(tagName).append("\n");
        }
        if(attribute!=null && !attribute.isEmpty()){
            sb.append("attribute=").append(attribute).append("\n");
        }
        sb.append("}");
        return sb.toString();

    }
}
