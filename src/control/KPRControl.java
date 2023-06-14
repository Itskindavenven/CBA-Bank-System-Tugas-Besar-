package control;

import model.KPR;
import dao.KPRDAO;
import java.sql.SQLException;

public class KPRControl {
    private KPRDAO kDao = new KPRDAO();
    
    public String autoID(){
        return kDao.autoID();
    }
    
    public void insertKPR(KPR kpr) throws SQLException{
        kDao.insertKPR(kpr);
    }
    
    
}
