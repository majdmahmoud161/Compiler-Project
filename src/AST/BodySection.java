package AST;

import java.util.ArrayList;
import java.util.List;

public class BodySection {


    String TAG_OPEN;
    List<String> BODY_TAG = new ArrayList<>();
    List<String> TAG_CLOSE = new ArrayList<>();
    String TAG_OPEN_SLASH;
    Content content ;

    public String getTAG_OPEN() {
        return TAG_OPEN;
    }

    public void setTAG_OPEN(String TAG_OPEN) {
        this.TAG_OPEN = TAG_OPEN;
    }

    public List<String> getBODY_TAG() {
        return BODY_TAG;
    }

    public void setBODY_TAG(List<String> BODY_TAG) {
        this.BODY_TAG = BODY_TAG;
    }

    public List<String> getTAG_CLOSE() {
        return TAG_CLOSE;
    }

    public void setTAG_CLOSE(List<String> TAG_CLOSE) {
        this.TAG_CLOSE = TAG_CLOSE;
    }

    public String getTAG_OPEN_SLASH() {
        return TAG_OPEN_SLASH;
    }

    public void setTAG_OPEN_SLASH(String TAG_OPEN_SLASH) {
        this.TAG_OPEN_SLASH = TAG_OPEN_SLASH;
    }

    public Content getContent() {
        return content;
    }

    public void setContent(Content content) {
        this.content = content;
    }


    @Override
    public String toString() {
        StringBuilder sb=new StringBuilder("BodySection{\n");

        if(TAG_OPEN!=null ){
            sb.append("TAG_OPEN=").append(TAG_OPEN).append("\n");
        }
        if(TAG_CLOSE!=null ){
            sb.append("TAG_CLOSE=").append(TAG_CLOSE).append("\n");
        }
        if(BODY_TAG!=null ){
            sb.append("HEAD_TAG=").append(BODY_TAG).append("\n");
        }
        if(TAG_OPEN_SLASH!=null ){
            sb.append("TAG_OPEN_SLASH=").append(TAG_OPEN_SLASH).append("\n");
        }
        if(content!=null ){
            sb.append("content=").append(content).append("\n");
        }
        sb.append("}");
        return sb.toString();

    }
}
