package AST;

public class FlaskReturn {

    String Return;
    Redirect redirect;
    RenderTemplate renderTemplate;

    public String getReturn() {
        return Return;
    }

    public void setReturn(String aReturn) {
        Return = aReturn;
    }

    public Redirect getRedirect() {
        return redirect;
    }

    public void setRedirect(Redirect redirect) {
        this.redirect = redirect;
    }

    public RenderTemplate getRenderTemplate() {
        return renderTemplate;
    }

    public void setRenderTemplate(RenderTemplate renderTemplate) {
        this.renderTemplate = renderTemplate;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder("FlaskReturn { \n");
        sb.append("return = ").append(Return).append(",").append("\n");
        if(redirect != null) {
            sb.append("redirect = ").append(redirect).append("\n");
        }
        if(renderTemplate != null){
            sb.append("renderTemplate = ").append(renderTemplate).append("\n");
        }

        return sb + "} \n";
    }
}
