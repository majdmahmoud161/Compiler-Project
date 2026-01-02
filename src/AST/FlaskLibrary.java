package AST;

public class FlaskLibrary  extends  Flask{

    FlaskLibraryDecl flaskLibraryDecl ;
    OsDecl osDecl;
    UtilesDecl utilesDecl ;

    public FlaskLibraryDecl getFlaskLibraryDecl() {
        return flaskLibraryDecl;
    }

    public void setFlaskLibraryDecl(FlaskLibraryDecl flaskLibraryDecl) {
        this.flaskLibraryDecl = flaskLibraryDecl;
    }

    public OsDecl getOsDecl() {
        return osDecl;
    }

    public void setOsDecl(OsDecl osDecl) {
        this.osDecl = osDecl;
    }

    public UtilesDecl getUtilesDecl() {
        return utilesDecl;
    }

    public void setUtilesDecl(UtilesDecl utilesDecl) {
        this.utilesDecl = utilesDecl;
    }

    @Override
    public String toString() {
        StringBuilder sb  = new StringBuilder("FlaskLibrary { \n");
        if(flaskLibraryDecl != null){
            sb.append("flasklibdecl = ").append(flaskLibraryDecl);
        }
        if(osDecl != null){
            sb.append("osdecl = ").append(osDecl);
        }
        if(utilesDecl != null){
            sb.append("utilesDecl = ").append(utilesDecl);
        }
        return sb + "\n }";
    }
}
