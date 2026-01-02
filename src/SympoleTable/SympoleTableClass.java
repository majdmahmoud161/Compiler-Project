package SympoleTable;

import java.util.ArrayList;
import java.util.List;

public class SympoleTableClass {

    List<Row> rows = new ArrayList<>();

    public List<Row> getRows() {
        return rows;
    }

    public void setRows(List<Row> rows) {
        this.rows = rows;
    }

    public void print(){
        System.out.print("Line\t");
        System.out.print("name\t");
        System.out.print("value\t");
        System.out.println("type");
        for(int i=0 ; i<rows.size() ; i++){
            if(rows != null){
                System.out.print(rows.get(i).getRow() + "\t" );
                System.out.print(rows.get(i).getName()+ "\t");
                System.out.print(rows.get(i).getValue()+ "\t");
                System.out.println(rows.get(i).getType());
            }
            System.out.println("---------------------------------");
        }
    }
}
