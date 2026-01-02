package AST;

public class FullHtmlDocument extends Document{

    Doctypehtml doctypehtml;
    HtmlOpen htmlOpen;
    HtmlClose htmlClose;
    HeadSection headSection ;
    BodySection bodySection ;

//    Setter and Getter

    public Doctypehtml getDoctypehtml() {
        return doctypehtml;
    }

    public void setDoctypehtml(Doctypehtml doctypehtml) {
        this.doctypehtml = doctypehtml;
    }

    public HtmlOpen getHtmlOpen() {
        return htmlOpen;
    }

    public void setHtmlOpen(HtmlOpen htmlOpen) {
        this.htmlOpen = htmlOpen;
    }

    public HtmlClose getHtmlClose() {
        return htmlClose;
    }

    public void setHtmlClose(HtmlClose htmlClose) {
        this.htmlClose = htmlClose;
    }

    public HeadSection getHeadSection() {
        return headSection;
    }

    public void setHeadSection(HeadSection headSection) {
        this.headSection = headSection;
    }

    public BodySection getBodySection() {
        return bodySection;
    }

    public void setBodySection(BodySection bodySection) {
        this.bodySection = bodySection;
    }


    //    toString function
    @Override
    public String toString() {
        StringBuilder sb=new StringBuilder("FullHtmlNode{\n");

        if(doctypehtml!=null ){
            sb.append("doctypehtml=").append(doctypehtml).append("\n");
        }
        if(htmlOpen!=null ){
            sb.append("htmlOpen=").append(htmlOpen).append("\n");
        }
        if(htmlClose!=null ){
            sb.append("htmlClose=").append(htmlClose).append("\n");
        }
        if(headSection!=null ){
            sb.append("headSection=").append(headSection).append("\n");
        }
        if(bodySection!=null ){
            sb.append("bodySection=").append(bodySection).append("\n");
        }
        sb.append("}");
        return sb.toString();

    }
}
