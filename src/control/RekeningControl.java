package control;

import java.util.List;

import dao.RekeningDAO;
import model.Rekening;
import model.Nasabah;
import table.TableRekening;

public class RekeningControl {
    private final RekeningDAO rDao = new RekeningDAO();

    public void insertRekening(Rekening rekening) {
        rDao.insertRekening(rekening);
    }
    
    public void updateRekening(Rekening rekening){
        rDao.updateRekening(rekening);
    }
    
    public List<Rekening> getRekeningsByNasabah(Nasabah nasabah) {
        return rDao.getRekeningsByNasabah(nasabah);
    }

    public TableRekening getRekeningTableByNasabah(Nasabah nasabah) {
        List<Rekening> rekeningList = getRekeningsByNasabah(nasabah);
        return new TableRekening(rekeningList);
    }
    
    public Rekening getRekeningByNoRekening(String query) {
        return rDao.getRekeningByNoRekening(query);
    }
}
