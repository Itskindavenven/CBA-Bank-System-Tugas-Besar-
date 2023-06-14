/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package control;
import dao.Back_OfficeDAO;
import java.sql.SQLException;
import model.Back_Office;
import java.util.List;
import table.TableBO;

public class Back_OfficeControl {
    private final Back_OfficeDAO bDAO = new Back_OfficeDAO();
    
    public String AutoID(){
        return bDAO.autoID();
    }
    
    public void insertDataBO(Back_Office b){
        bDAO.insertBO(b);
    }
    
    public void updateDataBO(Back_Office b, String id){
        bDAO.updateBO(b, id);
    }
    
    public void deleteDataBO(String id){
        bDAO.deleteBO(id);
    }
    
    public Back_Office fetchDataBO(String id){
        return bDAO.fetchBO(id);
    }
    
    public TableBO showBO(String query){
        List<Back_Office> dataBack_Offices = bDAO.showBO(query);
        TableBO tableBO = new TableBO(dataBack_Offices);
        
        return tableBO;
    }
    
    public Back_Office showBOby(String query){
        return bDAO.showBOby(query);
    }
    
    public boolean authenticateUser(String username, String password) {
        try {
            return bDAO.authenticateUser(username, password);
        } catch (SQLException e) {
            e.printStackTrace();
            return false;
        }
    }
}
