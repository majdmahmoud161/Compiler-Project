package AST;
public class TagType {

    StartTag startTag;
    Content content;
    EndTag endTag;
    SelfClosingTag selfClosingTag ;


    public StartTag getStartTag() {
        return startTag;
    }
    public void setStartTag(StartTag startTag) {
        this.startTag = startTag;
    }
    public Content getContent() {
        return content;
    }
    public void setContent(Content content) {
        this.content = content;
    }
    public EndTag getEndTag() {
        return endTag;
    }

    public void setEndTag(EndTag endTag) {
        this.endTag = endTag;
    }

    public SelfClosingTag getSelfClosingTag() {
        return selfClosingTag;
    }

    public void setSelfClosingTag(SelfClosingTag selfClosingTag) {
        this.selfClosingTag = selfClosingTag;
    }

    @Override
    public String toString() {
        StringBuilder sb=new StringBuilder("TagType{\n");

        if(startTag!=null ){
            sb.append("startTag=").append(startTag).append("\n");
        }
        if(endTag!=null ){
            sb.append("endTag=").append(endTag).append("\n");
        }
        if(selfClosingTag!=null ){
            sb.append("selfCLosingTag=").append(selfClosingTag).append("\n");
        }
        if(content!=null ){
            sb.append("content=").append(content).append("\n");
        }
        sb.append("}");
        return sb.toString();

    }
}
