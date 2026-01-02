package AST;

import java.util.ArrayList;

public class Exp {
     ArrayList<Exp> exp = new ArrayList<>();
     String Pow;
     String Mult;
     String Division;
     String Mod;
     String Sum;
     String Sub;
     String Isequals;
     String Isgrater;
     String Issmaller;
     String Or;
     String And;
     String Is;
     String Ifgreaterorequals;
     String Ifsmallerorequals;
     String Int;
    String Dot;
    String String;
    String Truebool;
    String Falsebool;
    String None;
    Arr arrayPython;
     ArrayList<String>Id = new ArrayList<>();

    public ArrayList<Exp> getExp() {
        return exp;
    }

    public void setExp(ArrayList<Exp> exp) {
        this.exp = exp;
    }

    public java.lang.String getPow() {
        return Pow;
    }

    public void setPow(java.lang.String pow) {
        Pow = pow;
    }

    public java.lang.String getMult() {
        return Mult;
    }

    public void setMult(java.lang.String mult) {
        Mult = mult;
    }

    public java.lang.String getDivision() {
        return Division;
    }

    public void setDivision(java.lang.String division) {
        Division = division;
    }

    public java.lang.String getMod() {
        return Mod;
    }

    public void setMod(java.lang.String mod) {
        Mod = mod;
    }

    public java.lang.String getSum() {
        return Sum;
    }

    public void setSum(java.lang.String sum) {
        Sum = sum;
    }

    public java.lang.String getSub() {
        return Sub;
    }

    public void setSub(java.lang.String sub) {
        Sub = sub;
    }

    public java.lang.String getIsequals() {
        return Isequals;
    }

    public void setIsequals(java.lang.String isequals) {
        Isequals = isequals;
    }

    public java.lang.String getIsgrater() {
        return Isgrater;
    }

    public void setIsgrater(java.lang.String isgrater) {
        Isgrater = isgrater;
    }

    public java.lang.String getIssmaller() {
        return Issmaller;
    }

    public void setIssmaller(java.lang.String issmaller) {
        Issmaller = issmaller;
    }

    public java.lang.String getOr() {
        return Or;
    }

    public void setOr(java.lang.String or) {
        Or = or;
    }

    public java.lang.String getAnd() {
        return And;
    }

    public void setAnd(java.lang.String and) {
        And = and;
    }

    public java.lang.String getIs() {
        return Is;
    }

    public void setIs(java.lang.String is) {
        Is = is;
    }

    public java.lang.String getIfgreaterorequals() {
        return Ifgreaterorequals;
    }

    public void setIfgreaterorequals(java.lang.String ifgreaterorequals) {
        Ifgreaterorequals = ifgreaterorequals;
    }

    public java.lang.String getIfsmallerorequals() {
        return Ifsmallerorequals;
    }

    public void setIfsmallerorequals(java.lang.String ifsmallerorequals) {
        Ifsmallerorequals = ifsmallerorequals;
    }

    public java.lang.String getInt() {
        return Int;
    }

    public void setInt(java.lang.String anInt) {
        Int = anInt;
    }

    public java.lang.String getDot() {
        return Dot;
    }

    public void setDot(java.lang.String dot) {
        Dot = dot;
    }

    public java.lang.String getString() {
        return String;
    }

    public void setString(java.lang.String string) {
        String = string;
    }

    public java.lang.String getTruebool() {
        return Truebool;
    }

    public void setTruebool(java.lang.String truebool) {
        Truebool = truebool;
    }

    public java.lang.String getFalsebool() {
        return Falsebool;
    }

    public void setFalsebool(java.lang.String falsebool) {
        Falsebool = falsebool;
    }

    public java.lang.String getNone() {
        return None;
    }

    public void setNone(java.lang.String none) {
        None = none;
    }

    public Arr getArrayPython() {
        return arrayPython;
    }

    public void setArrayPython(Arr arrayPython) {
        this.arrayPython = arrayPython;
    }

    public ArrayList<java.lang.String> getId() {
        return Id;
    }

    public void setId(ArrayList<java.lang.String> id) {
        Id = id;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder("Exp {\n");

        if (exp != null) {
            sb.append("exp=").append(exp).append(",");
        }
        if (Pow != null) {
            sb.append("Pow='").append(Pow).append(",");
        }
        if (Mult != null) {
            sb.append("Mult='").append(Mult).append(",");
        }
        if (Division != null) {
            sb.append("Division='").append(Division).append(",");
        }
        if (Mod != null) {
            sb.append("Mod='").append(Mod).append(",");
        }
        if (Sum != null) {
            sb.append("Sum='").append(Sum).append(",");
        }
        if (Sub != null) {
            sb.append("Sub='").append(Sub).append(",");
        }
        if (Isequals != null) {
            sb.append("Isequals='").append(Isequals).append(",");
        }
        if (Isgrater != null) {
            sb.append("Isgrater='").append(Isgrater).append(",");
        }
        if (Issmaller != null) {
            sb.append("Issmaller='").append(Issmaller).append(",");
        }
        if (Or != null) {
            sb.append("Or='").append(Or).append(",");
        }
        if (And != null) {
            sb.append("And='").append(And).append(",");
        }
        if (Is != null) {
            sb.append("Is='").append(Is).append(",");
        }
        if (Ifgreaterorequals != null) {
            sb.append("Ifgreaterorequals='").append(Ifgreaterorequals).append(",");
        }
        if (Ifsmallerorequals != null) {
            sb.append("Ifsmallerorequals='").append(Ifsmallerorequals).append(",");
        }
        if (Int != null) {
            sb.append("Int='").append(Int).append(",");
        }
        if (Dot != null) {
            sb.append("Dot='").append(Dot).append(",");
        }
        if (String != null) {
            sb.append("String='").append(String).append(",");
        }
        if (Truebool != null) {
            sb.append("Truebool='").append(Truebool).append(",");
        }
        if (Falsebool != null) {
            sb.append("Falsebool='").append(Falsebool).append(",");
        }
        if (None != null) {
            sb.append("None='").append(None).append(",");
        }
        if (arrayPython != null) {
            sb.append("arrayPython=").append(arrayPython).append(",");
        }
        if (Id != null) {
            sb.append("Id=").append(Id).append(",");
        }

        sb.append("\n}");
        return sb.toString();
    }

}
