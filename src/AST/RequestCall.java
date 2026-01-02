package AST;

public class RequestCall {
    String request;
    String dot;
    String method;
    String form;
    String files;

    public String getRequest() {
        return request;
    }

    public void setRequest(String request) {
        this.request = request;
    }

    public String getDot() {
        return dot;
    }

    public void setDot(String dot) {
        this.dot = dot;
    }

    public String getMethod() {
        return method;
    }

    public void setMethod(String method) {
        this.method = method;
    }

    public String getForm() {
        return form;
    }

    public void setForm(String form) {
        this.form = form;
    }

    public String getFiles() {
        return files;
    }

    public void setFiles(String files) {
        this.files = files;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder("RouteCall { \n");
        sb.append("request = ").append(request).append(",").append("\n");
        sb.append("dot = ").append(dot).append(",").append("\n");
        if(method != null){
            sb.append("method = ").append(method).append("\n");
        }
        if(form != null){
            sb.append("form = ").append(form).append("\n");
        }
        if(files != null){
            sb.append("files = ").append(files).append("\n");
        }

        return sb + "} \n";
    }
}
