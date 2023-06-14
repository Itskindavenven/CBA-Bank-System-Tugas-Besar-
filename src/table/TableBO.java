package table;
import java.util.List;
import javax.swing.table.AbstractTableModel;
import model.Back_Office;

public class TableBO extends AbstractTableModel{
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
    
    public String getColumnName(int column){
        switch(column){
            case 0:
                return "ID";
            case 1:
                return "Nama";
            case 2:
                return "Username";
            case 3:
                return "Tanggal Lahir";
            case 4:
                return "Gaji";
            default:
                return null;
        }
    }
}
