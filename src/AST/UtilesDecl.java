package AST;

public class UtilesDecl {

    String From ;
    String Utiles ;
    String Import ;
    String Squerfile;
    FlaskLibrary flaskLibrary ;

    public String getFrom() {
        return From;
    }

    public void setFrom(String from) {
        From = from;
    }

    public String getUtiles() {
        return Utiles;
    }

    public void setUtiles(String utiles) {
        Utiles = utiles;
    }

    public String getImport() {
        return Import;
    }

    public void setImport(String anImport) {
        Import = anImport;
    }

    public String getSquerfile() {
        return Squerfile;
    }

    public void setSquerfile(String squerfile) {
        Squerfile = squerfile;
    }

    public FlaskLibrary getFlaskLibrary() {
        return flaskLibrary;
    }

    public void setFlaskLibrary(FlaskLibrary flaskLibrary) {
        this.flaskLibrary = flaskLibrary;
    }

    @Override
    public String toString() {
        StringBuilder sb  = new StringBuilder("Utiles {\n");

        sb.append("From =").append(From).append(",");
        sb.append("Utiles =").append(Utiles).append(",");
        sb.append("Import =").append(Import).append(",");

        sb.append("Squerfile =").append(Squerfile).append(",");
        if(flaskLibrary != null){
            sb.append("flasklibrary=").append(flaskLibrary);
        }
        return sb + "\n}";
    }
}
