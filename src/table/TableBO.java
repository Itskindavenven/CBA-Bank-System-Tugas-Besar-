package table;
import java.util.List;
import javax.swing.table.AbstractTableModel;
import model.Back_Office;

public class TableBO {
    private List<Back_Office> list;
    
    public TableBO(List<Back_Office> list){
        this.list = list;
    }
    
    public int getRowCount(){
        return list.size();
    }
    
    public int getColumnCount(){
        return 5;
    }
    
    public Object getValueAt(int rowIndex, int columnIndex){
        switch(columnIndex){
            case 0:
                return list.get(rowIndex).getBo_id();
            case 1:
                return list.get(rowIndex).getNama();
            case 2:
                return list.get(rowIndex).getUsername();
            case 3:
                return list.get(rowIndex).getTanggalLahir();
            case 4:
                return list.get(rowIndex).getGaji();
            case 10:
                return list.get(rowIndex).getPassword();
            default:
                return null;
        }
    }
}
