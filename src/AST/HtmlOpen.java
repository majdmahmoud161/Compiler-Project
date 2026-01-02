package AST;

public class HtmlOpen {

    String TAG_OPEN;
    String HTML_TAG;
    String TAG_CLOSE;


    public String getTAG_OPEN() {
        return TAG_OPEN;
    }

    public void setTAG_OPEN(String TAG_OPEN) {
        this.TAG_OPEN = TAG_OPEN;
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
        StringBuilder sb=new StringBuilder("HtmlOpen{\n");

        if(TAG_OPEN!=null ){
            sb.append("TAG_OPEN=").append(TAG_OPEN).append("\n");
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
