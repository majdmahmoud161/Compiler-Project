package AST;

public class AppRun {
    String If;
    String Isequals;
    String Main;
    String Colone;
    String Id;
    String Dot;
    Run run;

    public String getIf() {
        return If;
    }

    public void setIf(String anIf) {
        If = anIf;
    }

    public String getIsequals() {
        return Isequals;
    }

    public void setIsequals(String isequals) {
        Isequals = isequals;
    }

    public String getMain() {
        return Main;
    }

    public void setMain(String main) {
        Main = main;
    }

    public String getColone() {
        return Colone;
    }

    public void setColone(String colone) {
        Colone = colone;
    }

    public String getId() {
        return Id;
    }

    public void setId(String id) {
        Id = id;
    }

    public String getDot() {
        return Dot;
    }

    public void setDot(String dot) {
        Dot = dot;
    }

    public Run getRun() {
        return run;
    }

    public void setRun(Run run) {
        this.run = run;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder("AppRun {\n ");

        sb.append("If = ").append(If).append(",");

        sb.append("Isequals = ").append(Isequals).append(",");

        sb.append("Main = ").append(Main).append(",");

        sb.append("Colone = ").append(Colone).append(",");

        sb.append("Id = ").append(Id).append(",");
        sb.append("Doe = ").append(Dot).append(",");
        sb.append("run = ").append(run);

        return sb + "\n }";
    }
}
