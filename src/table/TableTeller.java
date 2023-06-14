/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package table;
import java.util.List;
import javax.swing.table.AbstractTableModel;
import model.Teller;

public class TableTeller extends AbstractTableModel{
    private List<Teller> list;
    
    public TableTeller(List<Teller> list){
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
                return list.get(rowIndex).getTeller_id();
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
