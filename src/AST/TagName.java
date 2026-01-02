package AST;
public class TagName {


    String DIV_TAG;
    String P_TAG;
    String H1_TAG;
    String H2_TAG;
    String H3_TAG;
    String H4_TAG;
    String TITLE;
    String BUTTON_TAG;
    String UL_TAG;
    String LI_TAG;
    String A_TAG;
    String FORM;
    String LABEL_TAG;
    String LINK;
    String SPAN;

    public String getDIV_TAG() {
        return DIV_TAG;
    }

    public void setDIV_TAG(String DIV_TAG) {
        this.DIV_TAG = DIV_TAG;
    }

    public String getP_TAG() {
        return P_TAG;
    }

    public void setP_TAG(String P_TAG) {
        this.P_TAG = P_TAG;
    }

    public String getH1_TAG() {
        return H1_TAG;
    }

    public void setH1_TAG(String H1_TAG) {
        this.H1_TAG = H1_TAG;
    }

    public String getH2_TAG() {
        return H2_TAG;
    }

    public void setH2_TAG(String H2_TAG) {
       this.H2_TAG = H2_TAG;
    }

    public String getH3_TAG() {
        return H3_TAG;
    }

    public void setH3_TAG(String H3_TAG) {
        this.H3_TAG = H3_TAG;
    }

    public String getH4_TAG() {
        return H4_TAG;
    }

    public void setH4_TAG(String H4_TAG) {
        this.H4_TAG = H4_TAG;
    }

    public String getTITLE() {
        return TITLE;
    }

    public void setTITLE(String TITLE) {
        this.TITLE = TITLE;
    }

    public String getBUTTON_TAG() {
        return BUTTON_TAG;
    }

    public void setBUTTON_TAG(String BUTTON_TAG) {
        this.BUTTON_TAG = BUTTON_TAG;
    }

    public String getUL_TAG() {
        return UL_TAG;
    }

    public void setUL_TAG(String UL_TAG) {
        this.UL_TAG = UL_TAG;
    }

    public String getLI_TAG() {
        return LI_TAG;
    }

    public void setLI_TAG(String LI_TAG) {
        this.LI_TAG = LI_TAG;
    }

    public String getA_TAG() {
        return A_TAG;
    }

    public void setA_TAG(String A_TAG) {
        this.A_TAG = A_TAG;
    }

    public String getFORM_TAG() {
        return FORM;
    }

    public void setFORM_TAG(String FORM_TAG) {
        this.FORM = FORM_TAG;
    }

    public String getLABEL_TAG() {
        return LABEL_TAG;
    }

    public void setLABEL_TAG(String LABEL_TAG) {
        this.LABEL_TAG = LABEL_TAG;
    }

    public String getLINK() {
        return LINK;
    }

    public void setLINK(String LINK) {
        this.LINK = LINK;
    }

    public String getSPAN() {
        return SPAN;
    }

    public void setSPAN(String SPAN) {
        this.SPAN = SPAN;
    }

    @Override
    public String toString() {
        StringBuilder sb=new StringBuilder("TagName{\n");


        if(DIV_TAG!=null ){
            sb.append("DIV_TAG=").append(DIV_TAG).append("\n");
        }
        if(P_TAG!=null ){
            sb.append("P_TAG=").append(P_TAG).append("\n");
        }
        if(H1_TAG!=null ){
            sb.append("H1_TAG=").append(H1_TAG).append("\n");
        }
        if(H2_TAG!=null ){
            sb.append("H2_TAG=").append(H2_TAG).append("\n");
        }
        if(H3_TAG!=null ){
            sb.append("H3_TAG=").append(H3_TAG).append("\n");
        }
        if(H4_TAG!=null ){
            sb.append("H4_TAG=").append(H4_TAG).append("\n");
        }
        if(TITLE!=null ){
            sb.append("TITLE=").append(TITLE).append("\n");
        }
        if(BUTTON_TAG!=null ){
            sb.append("BUTTON_TAG=").append(BUTTON_TAG).append("\n");
        }
        if(UL_TAG!=null ){
            sb.append("UL_TAG=").append(UL_TAG).append("\n");
        }
        if(LI_TAG!=null ){
            sb.append("LI_TAG=").append(LI_TAG).append("\n");
        }
        if(A_TAG!=null ){
            sb.append("A_TAG=").append(A_TAG).append("\n");
        }
        if(FORM!=null ){
            sb.append("FORM_TAG=").append(FORM).append("\n");
        }
        if(LABEL_TAG!=null ){
            sb.append("LABLE_TAG=").append(LABEL_TAG).append("\n");
        }
        if(LINK!=null ){
            sb.append("LINK=").append(LINK).append("\n");
        }
        if(SPAN!=null ) {
            sb.append("SPAN=").append(SPAN).append("\n");
        }

        sb.append("}");
        return sb.toString();

    }
}