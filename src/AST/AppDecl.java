package AST;

public class AppDecl {
    String Id ;
    String Equals;
    String Flask ;
    String Openprac;
    String Name;
    String Closeprac;

    public String getId() {
        return Id;
    }

    public void setId(String id) {
        Id = id;
    }

    public String getEquals() {
        return Equals;
    }

    public void setEquals(String equals) {
        Equals = equals;
    }

    public String getFlask() {
        return Flask;
    }

    public void setFlask(String flask) {
        Flask = flask;
    }

    public String getOpenprac() {
        return Openprac;
    }

    public void setOpenprac(String openprac) {
        Openprac = openprac;
    }

    public String getName() {
        return Name;
    }

    public void setName(String name) {
        Name = name;
    }

    public String getCloseprac() {
        return Closeprac;
    }

    public void setCloseprac(String closeprac) {
        Closeprac = closeprac;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder("AppDecl { \n");

        sb.append("Id = ").append(Id).append(",");

        sb.append("Equals = ").append(Equals).append(",");

        sb.append("Flask = ").append(Flask).append(",");

        sb.append("Openprac = ").append(Openprac).append(",");

        sb.append("Name = ").append(Name).append(",");

        sb.append("Closeprac = ").append(Closeprac);
        return sb + " \n}";
    }
}
