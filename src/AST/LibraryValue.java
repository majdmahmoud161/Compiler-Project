package AST;

public class LibraryValue {
    String Flask;
    String Request;
    String RenderTemplate ;
    String UrlFor;

    public String getFlask() {
        return Flask;
    }

    public void setFlask(String flask) {
        Flask = flask;
    }

    public String getRequest() {
        return Request;
    }

    public void setRequest(String request) {
        Request = request;
    }

    public String getRenderTemplate() {
        return RenderTemplate;
    }

    public void setRenderTemplate(String renderTemplate) {
        RenderTemplate = renderTemplate;
    }

    public String getUrlFor() {
        return UrlFor;
    }

    public void setUrlFor(String urlFor) {
        UrlFor = urlFor;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder("LibraryValue { \n");
        if(Flask != null){
            sb.append("Flask = ").append(Flask).append(",");
        }
        if(Request != null){
            sb.append("Request = ").append(Request).append(",");
        }
        if(RenderTemplate != null){
            sb.append("RenderTemplate = ").append(RenderTemplate).append(",");
        }
        if(UrlFor != null){
            sb.append("UrlFor = ").append(UrlFor);
        }
        return sb + "\n }";
    }
}
