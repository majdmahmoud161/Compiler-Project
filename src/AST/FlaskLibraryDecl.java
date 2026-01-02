package AST;

public class FlaskLibraryDecl {

    String From ;
    String Import;
    String FlaskLib;
    LibraryList libraryList;
    FlaskLibrary flaskLibrary;

    public String getFrom() {
        return From;
    }

    public void setFrom(String from) {
        From = from;
    }

    public String getImport() {
        return Import;
    }

    public void setImport(String anImport) {
        Import = anImport;
    }

    public String getFlaskLib() {
        return FlaskLib;
    }

    public void setFlaskLib(String flaskLib) {
        FlaskLib = flaskLib;
    }

    public LibraryList getLibraryList() {
        return libraryList;
    }

    public void setLibraryList(LibraryList libraryList) {
        this.libraryList = libraryList;
    }

    public FlaskLibrary getFlaskLibrary() {
        return flaskLibrary;
    }

    public void setFlaskLibrary(FlaskLibrary flaskLibrary) {
        this.flaskLibrary = flaskLibrary;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder("FlaskLibraryDecl { \n");

        sb.append("From = ").append(From).append(",");
        sb.append("FlaskLib = ").append(FlaskLib).append(",");

        sb.append("Import = ").append(Import).append(",");
        sb.append("libraryList = ").append(libraryList).append(",");
        if(flaskLibrary != null) {
            sb.append("flaskLibrary = ").append(flaskLibrary);
        }
        return sb + "\n }";
    }
}
