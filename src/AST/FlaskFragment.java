package AST;

public class FlaskFragment extends  Flask {

    FlaskLibraryDecl flaskLibraryDecl;
    AppDecl appDecl;
    FlaskState flaskState ;
    AppRun appRun;

    public FlaskLibraryDecl getFlaskLibraryDecl() {
        return flaskLibraryDecl;
    }

    public void setFlaskLibraryDecl(FlaskLibraryDecl flaskLibraryDecl) {
        this.flaskLibraryDecl = flaskLibraryDecl;
    }

    public AppDecl getAppDecl() {
        return appDecl;
    }

    public void setAppDecl(AppDecl appDecl) {
        this.appDecl = appDecl;
    }

    public FlaskState getFlaskState() {
        return flaskState;
    }

    public void setFlaskState(FlaskState flaskState) {
        this.flaskState = flaskState;
    }

    public AppRun getAppRun() {
        return appRun;
    }

    public void setAppRun(AppRun appRun) {
        this.appRun = appRun;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder("FlaskFragment { \n");
        sb.append("flasklibrarydevl =").append(flaskLibraryDecl).append(",").append("\n");
        sb.append("appdecl =").append(appDecl).append(",").append("\n");
        if(flaskState != null){
            sb.append("flaskstate =").append(flaskState).append(",").append("\n");
        }
        sb.append("apprun =").append(appRun).append("\n");
        return sb + "\n }";
    }
}
