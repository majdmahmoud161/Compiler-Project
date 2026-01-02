package AST;

public class EndTag {

    String TAG_OPEN_SLASH;
    String TAG_CLOSE;
    TagName tagName;

    public String getTAG_OPEN_SLASH() {
        return TAG_OPEN_SLASH;
    }

    public void setTAG_OPEN_SLASH(String TAG_OPEN_SLASH) {
        this.TAG_OPEN_SLASH = TAG_OPEN_SLASH;
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


    @Override
    public String toString() {
        StringBuilder sb=new StringBuilder("EndTag{\n");

        if(TAG_OPEN_SLASH!=null ){
            sb.append("TAG_OPEN_SLASH=").append(TAG_OPEN_SLASH).append("\n");
        }

        if(TAG_CLOSE!=null ){
            sb.append("TAG_CLOSE=").append(TAG_CLOSE).append("\n");
        }
        if(tagName!=null ){
            sb.append("tagName=").append(tagName).append("\n");
        }
        sb.append("}");
        return sb.toString();

    }
}
