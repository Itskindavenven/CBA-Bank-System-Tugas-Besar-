/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package control;
import dao.TellerDAO;
import java.sql.SQLException;
import model.Teller;
import java.util.List;
import table.TableTeller;

public class TellerControl {
    private final TellerDAO tDAO = new TellerDAO();
    
    public void insertDataTeller(Teller t){
        tDAO.insertTeller(t);
    }
    
    public void updateDataTeller(Teller t, String id){
        tDAO.updateTeller(t, id);
    }
    
    public void deleteDataTeller(String id){
        tDAO.deleteTeller(id);
    }
    
    public Teller fetchDataTeller(String id){
        return tDAO.fetchTeller(id);
    }
    
    public TableTeller showTeller(String query){
        List<Teller> dataTeller = tDAO.showTeller(query);
        TableTeller tableTeller = new TableTeller(dataTeller);
        
        return tableTeller;
    }
    
    public boolean authenticateUser(String username, String password) {
        try {
            return tDAO.authenticateUser(username, password);
        } catch (SQLException e) {
            e.printStackTrace();
            return false;
        }
    }
}
