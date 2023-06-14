package table;

import java.util.List;
import javax.swing.table.AbstractTableModel;
import model.Nasabah;

public class TableNasabah extends AbstractTableModel{
    private List<Nasabah> list;
    
    public TableNasabah(List<Nasabah> list){
        this.list = list;
    }
    
    public int getRowCount(){
        return list.size();
    }
    
    public int getColumnCount(){
        return 6;
    }
    
    public Object getValueAt(int rowIndex, int columnIndex){
        switch(columnIndex){
            case 0:
                return list.get(rowIndex).getCustomer_identification();
            case 1:
                return list.get(rowIndex).getNik();
            case 2:
                return list.get(rowIndex).getNama();
            case 3:
                return list.get(rowIndex).getTanggalLahir();
            case 4:
                return list.get(rowIndex).getAlamat();
            case 5:
                return list.get(rowIndex).getPekerjaan();
            default:
                return null;
        }
    }
    
    public String getColumnName(int column){
        switch(column){
            case 0:
                return "CIN";
            case 1:
                return "NIK";
            case 2:
                return "Nama";
            case 3:
                return "Tanggal Lahir";
            case 4:
                return "Alamat";
            case 5:
                return "Pekerjaan";
            default:
                return null;
        }
    }
}
