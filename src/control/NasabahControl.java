package control;

import java.sql.SQLException;
import java.util.List;

import dao.NasabahDAO;
import model.Nasabah;
import table.TableNasabah;

public class NasabahControl {
    private final NasabahDAO nDao = new NasabahDAO();
    
    public String AutoID(){
        return nDao.autoID();
    }
    
    public void insertDataNasabah(Nasabah n){
        nDao.insertNasabah(n);
    }
    
    public void updateDataNasabah(Nasabah n, String customer_identification){
        nDao.updateNasabah(n, customer_identification);
    }
    
    public void deleteDataNasabah(String customer_identification){
        nDao.deleteNasabah(customer_identification);
    }
    
    public Nasabah fetchDataNasabah(String customer_identification){
        return nDao.fetchNasabah(customer_identification);
    }
    
    public TableNasabah showNasabah(String query){
        List<Nasabah> dataNasabah = nDao.showNasabah(query);
        TableNasabah tableNasabah = new TableNasabah(dataNasabah);
        
        return tableNasabah;
    }
    
    public Nasabah showNasabahby(String query){
        return nDao.showNasabahby(query);
    }
    
    public int countNasabah() {
        return nDao.countNasabah();
    }
}
