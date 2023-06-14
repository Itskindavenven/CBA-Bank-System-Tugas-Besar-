package control;

import java.util.List;

import dao.TransaksiDAO;
import java.sql.SQLException;
import model.Transaksi;
import table.TableTransaksi;

public class TransaksiControl {
    private TransaksiDAO tDAO = new TransaksiDAO();
    
    public String autoID(){
        return tDAO.autoID();
    }
    
    public void insertTransaksi(Transaksi transaksi) throws SQLException{
        tDAO.insertTransaksi(transaksi);
    }
    
    public TableTransaksi showTransaksi(String query){
        List<Transaksi> dataTransaksi = tDAO.showTransaksi(query);
        TableTransaksi tableTransaksi = new TableTransaksi(dataTransaksi);
        
        return tableTransaksi;
    }
    
    public TableTransaksi showTransaksiBy(String query){
        List<Transaksi> dataTransaksi = tDAO.showTransaksiBy(query);
        TableTransaksi tableTransaksi = new TableTransaksi(dataTransaksi);
        
        return tableTransaksi;
    }
}
