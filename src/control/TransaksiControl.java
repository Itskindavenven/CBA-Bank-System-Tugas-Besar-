package control;

import java.util.List;

import dao.TransaksiDAO;
import java.sql.SQLException;
import model.Transaksi;

public class TransaksiControl {
    private TransaksiDAO tDAO = new TransaksiDAO();
    
    public String autoID(){
        return tDAO.autoID();
    }
    
    public void insertTransaksi(Transaksi transaksi) throws SQLException{
        tDAO.insertTransaksi(transaksi);
    }
}
