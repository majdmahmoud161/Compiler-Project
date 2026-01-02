package AST;

public class Flask {

    FlaskFragment flaskFragment ;

    FlaskLibrary flaskLibrary ;

    public FlaskFragment getFlaskFragment() {
        return flaskFragment;
    }

    public void setFlaskFragment(FlaskFragment flaskFragment) {
        this.flaskFragment = flaskFragment;
    }

    public FlaskLibrary getFlaskLibrary() {
        return flaskLibrary;
    }

    public void setFlaskLibrary(FlaskLibrary flaskLibrary) {
        this.flaskLibrary = flaskLibrary;
    }

    @Override
    public String toString() {
        StringBuilder sb  = new StringBuilder("Flask {\n");
        if(flaskFragment != null){
            sb.append("flaskfragment=").append(flaskFragment).append('\n');
        }
        if(flaskLibrary != null){
            sb.append("flasklibrary=").append(flaskLibrary).append('\n');
        }
        return sb + "\n}";
    }
}
