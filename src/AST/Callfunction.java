package AST;

public class Callfunction extends State{
    String Id;
     String Openprac;
     String Closeprac;
     Buildinfunc buildinfunc;
     ParaList paraList;
     AppendFunc appendfunc;

    public AppendFunc getAppendfunc() {
        return appendfunc;
    }

    public void setAppendfunc(AppendFunc appendfunc) {
        this.appendfunc = appendfunc;
    }

    public String getId() {
        return Id;
    }

    public void setId(String id) {
        Id = id;
    }

    public String getOpenprac() {
        return Openprac;
    }

    public void setOpenprac(String openprac) {
        Openprac = openprac;
    }

    public String getCloseprac() {
        return Closeprac;
    }

    public void setCloseprac(String closeprac) {
        Closeprac = closeprac;
    }

    public Buildinfunc getBuildinfunc() {
        return buildinfunc;
    }

    public void setBuildinfunc(Buildinfunc buildinfunc) {
        this.buildinfunc = buildinfunc;
    }

    public ParaList getParaList() {
        return paraList;
    }

    public void setParaList(ParaList paraList) {
        this.paraList = paraList;
    }

    @Override
    public String toString() {
       StringBuilder sb =  new StringBuilder("CallFunc {\n");
       if(Id != null){
           sb.append("Id :" ).append(Id).append(",");
       }
       if(Openprac != null){
           sb.append("Openprac :").append(Openprac).append(",");
       }
       if(paraList !=null){
           sb.append("paraList :").append(paraList).append(",");
       }
       if(Closeprac != null){
           sb.append("Closeprac :").append(Closeprac).append(",");
       }
       if(buildinfunc != null){
           sb.append("buildinfunc :").append(buildinfunc).append(",");
       }
       if(appendfunc != null){
           sb.append("appendfunc :").append(appendfunc).append(",");
       }

       return sb + "\n}";
    }
}
