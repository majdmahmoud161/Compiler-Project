package AST;

import java.util.ArrayList;
import java.util.List;

public class Redirect {

    String redirect;
    List<String> openprac = new ArrayList<>();
    List<String> string = new ArrayList<>() ;
    String urlfor;
    List<String> closeprac = new ArrayList<>();

    public String getRedirect() {
        return redirect;
    }

    public void setRedirect(String redirect) {
        this.redirect = redirect;
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

    public List<String> getCloseprac() {
        return closeprac;
    }

    public void setCloseprac(List<String> closeprac) {
        this.closeprac = closeprac;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder("Redirect { \n");
        sb.append("redirect = ").append(redirect).append(",").append("\n");
        if(openprac != null){
            sb.append("openprac = ").append(openprac).append(",").append("\n");
        }
        if(string != null && !(string.isEmpty())){
            sb.append("string = ").append(string).append(",").append("\n");
        }
        if(urlfor != null){
            sb.append("urlfor = ").append(urlfor).append(",").append("\n");
        }
        if(closeprac != null && !(closeprac.isEmpty())){
            sb.append("closeprac = ").append(closeprac).append(",").append("\n");
        }
        return sb + "} \n";
    }
}
