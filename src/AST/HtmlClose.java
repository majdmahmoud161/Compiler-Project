package AST;

public class HtmlClose {


    String TAG_OPEN_SLASH;
    String HTML_TAG;
    String TAG_CLOSE;

    public String getTAG_OPEN_SLASH() {
        return TAG_OPEN_SLASH;
    }

    public void setTAG_OPEN_SLASH(String TAG_OPEN_SLASH) {
        this.TAG_OPEN_SLASH = TAG_OPEN_SLASH;
    }

    public String getHTML_TAG() {
        return HTML_TAG;
    }

    public void setHTML_TAG(String HTML_TAG) {
        this.HTML_TAG = HTML_TAG;
    }

    public String getTAG_CLOSE() {
        return TAG_CLOSE;
    }

    public void setTAG_CLOSE(String TAG_CLOSE) {
        this.TAG_CLOSE = TAG_CLOSE;
    }

    @Override
    public String toString() {
        StringBuilder sb=new StringBuilder("HtmlClose{\n");

        if(TAG_OPEN_SLASH!=null ){
            sb.append("TAG_OPEN_SLASH=").append(TAG_OPEN_SLASH).append("\n");
        }
        if(TAG_CLOSE!=null ){
            sb.append("TAG_CLOSE=").append(TAG_CLOSE).append("\n");
        }
        if(HTML_TAG!=null ){
            sb.append("HTML_TAG=").append(HTML_TAG).append("\n");
        }
        sb.append("}");
        return sb.toString();

    }
}
