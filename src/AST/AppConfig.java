package AST;

import java.util.ArrayList;
import java.util.List;

public class AppConfig {
    List<String> id = new ArrayList<>();
    String dot ;
    String config;
    String opensquer;
    String UPLOADFOLDER;
    String closesquer;
    String equals;

    public List<String> getId() {
        return id;
    }

    public void setId(List<String> id) {
        this.id = id;
    }

    public String getDot() {
        return dot;
    }

    public void setDot(String dot) {
        this.dot = dot;
    }

    public String getConfig() {
        return config;
    }

    public void setConfig(String config) {
        this.config = config;
    }

    public String getOpensquer() {
        return opensquer;
    }

    public void setOpensquer(String opensquer) {
        this.opensquer = opensquer;
    }

    public String getUPLOADFOLDER() {
        return UPLOADFOLDER;
    }

    public void setUPLOADFOLDER(String UPLOADFOLDER) {
        this.UPLOADFOLDER = UPLOADFOLDER;
    }

    public String getClosesquer() {
        return closesquer;
    }

    public void setClosesquer(String closesquer) {
        this.closesquer = closesquer;
    }

    public String getEquals() {
        return equals;
    }

    public void setEquals(String equals) {
        this.equals = equals;
    }
    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder("AppConfig {\n");

        sb.append("id = ").append(id).append(",");

        sb.append("dot = ").append(dot).append(",");

        sb.append("config = ").append(config).append(",");

        sb.append("opensquer = ").append(opensquer).append(",");

        sb.append("UPLOADFOLDER = ").append(UPLOADFOLDER).append(",");

        sb.append("closesquer = ").append(closesquer).append(",");

        sb.append("equals = ").append(equals);

        return sb + "\n }";
    }
}
