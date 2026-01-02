package AST;

public class Doctypehtml {

    String TAG_OPEN;
    String TAG_CLOSE;
    String DOCTYPEHTML_TAG;

//    Setter and Getter


    public String getTAG_OPEN() {
        return TAG_OPEN;
    }

    public void setTAG_OPEN(String TAG_OPEN) {
        this.TAG_OPEN = TAG_OPEN;
    }

    public String getDOCTYPEHTML_TAG() {
        return DOCTYPEHTML_TAG;
    }

    public void setDOCTYPEHTML_TAG(String DOCTYPEHTML_TAG) {
        this.DOCTYPEHTML_TAG = DOCTYPEHTML_TAG;
    }

    public String getTAG_CLOSE() {
        return TAG_CLOSE;
    }

    public void setTAG_CLOSE(String TAG_CLOSE) {
        this.TAG_CLOSE = TAG_CLOSE;
    }

//    ToString

    @Override
    public String toString() {
        StringBuilder sb=new StringBuilder("Doctypehtml{\n");

        if(TAG_OPEN!=null ){
            sb.append("TAG_OPEN=").append(TAG_OPEN).append("\n");
        }
        if(TAG_CLOSE!=null ){
            sb.append("TAG_CLOSE=").append(TAG_CLOSE).append("\n");
        }
        if(DOCTYPEHTML_TAG!=null ){
            sb.append("DOCTYPEHTML_TAG=").append(DOCTYPEHTML_TAG).append("\n");
        }
        sb.append("}");
        return sb.toString();

    }
}
