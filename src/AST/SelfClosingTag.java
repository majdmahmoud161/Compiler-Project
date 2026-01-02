package AST;

import java.util.ArrayList;
import java.util.List;

public class SelfClosingTag {


String TAG_OPEN;
    String IMG_TAG;
    String INPUT_TAG;
    String SLASH_CLOSE;
    List<Attribute>attribute = new ArrayList<>();

    public String getTAG_OPEN() {
        return TAG_OPEN;
    }

    public void setTAG_OPEN(String TAG_OPEN) {
        this.TAG_OPEN = TAG_OPEN;
    }

    public String getIMG_TAG() {
        return IMG_TAG;
    }

    public void setIMG_TAG(String IMG_TAG) {
        this.IMG_TAG = IMG_TAG;
    }

    public String getINPUT_TAG() {
        return INPUT_TAG;
    }

    public void setINPUT_TAG(String INPUT_TAG) {
        this.INPUT_TAG = INPUT_TAG;
    }

    public String getSLASH_CLOSE() {
        return SLASH_CLOSE;
    }

    public void setSLASH_CLOSE(String SLASH_CLOSE) {
        this.SLASH_CLOSE = SLASH_CLOSE;
    }

    public List<Attribute> getAttribute() {
        return attribute;
    }

    public void setAttribute(List<Attribute> attribute) {
        this.attribute = attribute;
    }

    @Override
    public String toString() {
        StringBuilder sb=new StringBuilder("SelfClosingTag{\n");

        if(TAG_OPEN!=null ){
            sb.append("TAG_OPEN=").append(TAG_OPEN).append("\n");
        }

        if(IMG_TAG!=null ){
            sb.append("IMG_TAG=").append(IMG_TAG).append("\n");
        }
        if(INPUT_TAG!=null ){
            sb.append("INPUT_TAG=").append(INPUT_TAG).append("\n");
        }
        if(SLASH_CLOSE!=null ){
            sb.append("SLASH_CLOSE=").append(SLASH_CLOSE).append("\n");
        }
        if(attribute!=null && !attribute.isEmpty() ){
            sb.append("attribute=").append(attribute).append("\n");
        }
        sb.append("}");
        return sb.toString();

    }
}
