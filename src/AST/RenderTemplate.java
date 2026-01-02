package AST;

import java.util.ArrayList;
import java.util.List;

public class RenderTemplate {
    String rendertemplate;
    List<String> openprac = new ArrayList<>();
    List<String> string = new ArrayList<>() ;
    String urlfor;
    String comma;
    List<String> id = new ArrayList<>();
    String equals;
    List<String> closeprac = new ArrayList<>();


    public String getRendertemplate() {
        return rendertemplate;
    }

    public void setRendertemplate(String rendertemplate) {
        this.rendertemplate = rendertemplate;
    }

    public List<String> getOpenprac() {
        return openprac;
    }

    public void setOpenprac(List<String> openprac) {
        this.openprac = openprac;
    }

    public List<String> getString() {
        return string;
    }

    public void setString(List<String> string) {
        this.string = string;
    }

    public String getUrlfor() {
        return urlfor;
    }

    public void setUrlfor(String urlfor) {
        this.urlfor = urlfor;
    }

    public String getComma() {
        return comma;
    }

    public void setComma(String comma) {
        this.comma = comma;
    }

    public List<String> getId() {
        return id;
    }

    public void setId(List<String> id) {
        this.id = id;
    }

    public String getEquals() {
        return equals;
    }

    public void setEquals(String equals) {
        this.equals = equals;
    }

    public List<String> getCloseprac() {
        return closeprac;
    }

    public void setCloseprac(List<String> closeprac) {
        this.closeprac = closeprac;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder("RenderTemplate { \n");
        sb.append("rendertemplate = ").append(rendertemplate).append(",").append("\n");

        if(openprac != null && !(openprac.isEmpty())){
            sb.append("openprac = ").append(openprac).append(",").append("\n");
        }
        if(string != null && !(string.isEmpty())){
            sb.append("string = ").append(string).append(",").append("\n");
        }
        if(urlfor != null){
            sb.append("urlfor = ").append(urlfor).append(",").append("\n");
        }
        if(id != null && !(id.isEmpty())){
            sb.append("id = ").append(id).append(",").append("\n");
        }
        if(equals != null){
            sb.append("equals = ").append(equals).append(",").append("\n");
        }
        if(closeprac != null && !(closeprac.isEmpty())){
            sb.append("closeprac = ").append(closeprac).append(",").append("\n");
        }
        return sb + "} \n";
    }
}
