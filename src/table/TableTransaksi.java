/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package table;
import java.util.List;
import javax.swing.table.AbstractTableModel;
import model.Transaksi;

public class TableTransaksi extends AbstractTableModel{
    private List<Transaksi> list;
    
    public TableTransaksi(List<Transaksi> list){
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
                return list.get(rowIndex).getTransaksi_id();
            case 1:
                return list.get(rowIndex).getJenisTransaksi();
            case 2:
                return list.get(rowIndex).getTanggal();
            case 3:
                return list.get(rowIndex).getJumlah();
            case 4:
                return list.get(rowIndex).getNo_rekening();
            default:
                return null;
        }
    }
    
    public String getColumnName(int column){
        switch(column){
            case 0:
                return "ID Transaksi";
            case 1:
                return "Jenis Transaksi";
            case 2:
                return "Tanggal Transaksi";
            case 3:
                return "Jumlah";
            case 4:
                return "No Rekening";
            default:
                return null;
        }
    }
}
