package AST;

import java.util.ArrayList;
import java.util.List;

public class StateJinja2 {
    List<ConditionJinja2> conditionJinja2 = new ArrayList<>();
    List <PrintJinja2> printJinja2 = new ArrayList<>();

    List<TagsDocument> tagTypes = new ArrayList<>();

    public List<ConditionJinja2> getConditionJinja2() {
        return conditionJinja2;
    }

    public void setConditionJinja2(List<ConditionJinja2> conditionJinja2) {
        this.conditionJinja2 = conditionJinja2;
    }

    public List<PrintJinja2> getPrintJinja2() {
        return printJinja2;
    }

    public void setPrintJinja2(List<PrintJinja2> printJinja2) {
        this.printJinja2 = printJinja2;
    }

    public List<TagsDocument> getTagTypes() {
        return tagTypes;
    }

    public void setTagTypes(List<TagsDocument> tagTypes) {
        this.tagTypes = tagTypes;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder("StateJinja2{\n");

        if (conditionJinja2 != null) {
            sb.append("conditionJinja2=").append(conditionJinja2).append("\n");
        }
        if (printJinja2 != null) {
            sb.append("printJinja2=").append(printJinja2).append("\n");
        }

        sb.append("}");
        return sb.toString();
    }

}
