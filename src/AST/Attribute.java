package AST;

public class Attribute {

    String CLASS;
    String IDHTML;
    String SRC;
    String STYLE;
    String ALT;
    String TYPE;
    String HREF;
    String VALUE;
    String PLACEHOLDER;
    String NAMEHTML;
    String REL;
    String EQUAL;
    String STRING;

    String RQUIRED;
    String ENCTYPE;

    public String getRQUIRED() {
        return RQUIRED;
    }

    public void setRQUIRED(String RQUIRED) {
        this.RQUIRED = RQUIRED;
    }

    public String getENCTYPE() {
        return ENCTYPE;
    }

    public void setENCTYPE(String ENCTYPE) {
        this.ENCTYPE = ENCTYPE;
    }

    public String getCLASS() {
        return CLASS;
    }

    public void setCLASS(String CLASS) {
        this.CLASS = CLASS;
    }

    public String getIDHTML() {
        return IDHTML;
    }

    public void setIDHTML(String IDHTML) {
        this.IDHTML = IDHTML;
    }

    public String getSRC() {
        return SRC;
    }

    public void setSRC(String SRC) {
        this.SRC = SRC;
    }

    public String getSTYLE() {
        return STYLE;
    }

    public void setSTYLE(String STYLE) {
        this.STYLE = STYLE;
    }

    public String getALT() {
        return ALT;
    }

    public void setALT(String ALT) {
        this.ALT = ALT;
    }

    public String getTYPE() {
        return TYPE;
    }

    public void setTYPE(String TYPE) {
        this.TYPE = TYPE;
    }

    public String getHREF() {
        return HREF;
    }

    public void setHREF(String HREF) {
        this.HREF = HREF;
    }

    public String getVALUE() {
        return VALUE;
    }

    public void setVALUE(String VALUE) {
        this.VALUE = VALUE;
    }

    public String getPLACEHOLDER() {
        return PLACEHOLDER;
    }

    public void setPLACEHOLDER(String PLACEHOLDER) {
        this.PLACEHOLDER = PLACEHOLDER;
    }

    public String getNAMEHTML() {
        return NAMEHTML;
    }

    public void setNAMEHTML(String NAMEHTML) {
        this.NAMEHTML = NAMEHTML;
    }

    public String getREL() {
        return REL;
    }

    public void setREL(String REL) {
        this.REL = REL;
    }

    public String getEQUAL() {
        return EQUAL;
    }

    public void setEQUAL(String EQUAL) {
        this.EQUAL = EQUAL;
    }

    public String getSTRING() {
        return STRING;
    }

    public void setSTRING(String STRING) {
        this.STRING = STRING;
    }


    @Override
    public String toString() {
        StringBuilder sb=new StringBuilder("Attribute{\n");

        if(CLASS!=null ){
            sb.append("CLASS=").append(CLASS).append("\n");
        }

        if(IDHTML!=null ){
            sb.append("IDHTML=").append(IDHTML).append("\n");
        }
        if(STYLE!=null ){
            sb.append("STYLE=").append(STYLE).append("\n");
        }
        if(SRC!=null ){
            sb.append("SRC=").append(SRC).append("\n");
        }
        if(ALT!=null ){
            sb.append("ALT=").append(ALT).append("\n");
        }
        if(TYPE!=null ){
            sb.append("TYPE=").append(TYPE).append("\n");
        }
        if(HREF!=null ){
            sb.append("HREF=").append(HREF).append("\n");
        }
        if(VALUE!=null ){
            sb.append("VALUE=").append(VALUE).append("\n");
        }
        if(PLACEHOLDER!=null ){
            sb.append("PLACEHOLDER=").append(PLACEHOLDER).append("\n");
        }
        if(NAMEHTML!=null ){
            sb.append("NAMEHTML=").append(NAMEHTML).append("\n");
        }
        if(REL!=null ){
            sb.append("REL=").append(REL).append("\n");
        }
        if(EQUAL!=null ){
            sb.append("EQUAL=").append(EQUAL).append("\n");
        }
        if(STRING!=null ){
            sb.append("STRING=").append(STRING).append("\n");
        }
        if(ENCTYPE != null){
            sb.append("ENCTYPE = ").append(ENCTYPE).append(",");
        }
        if (RQUIRED != null){
            sb.append("RQUIRED = ").append(RQUIRED).append(",");
        }
        sb.append("}");
        return sb.toString();

    }
}
