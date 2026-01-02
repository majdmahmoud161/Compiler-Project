package AST;

public class OsDecl {

    String Import ;
    String Os;
    FlaskLibrary flaskLibrary ;

    public String getImport() {
        return Import;
    }

    public void setImport(String anImport) {
        Import = anImport;
    }

    public String getOs() {
        return Os;
    }

    public void setOs(String os) {
        Os = os;
    }

    public FlaskLibrary getFlaskLibrary() {
        return flaskLibrary;
    }

    public void setFlaskLibrary(FlaskLibrary flaskLibrary) {
        this.flaskLibrary = flaskLibrary;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder("OsDecl { \n");

        sb.append("Import = ").append(Import).append(",");
        sb.append("Os = ").append(Os).append(",");
        if(flaskLibrary != null){
            sb.append("flaskLibrary = ").append(flaskLibrary);
        }

        return sb + "\n }";
    }
}
