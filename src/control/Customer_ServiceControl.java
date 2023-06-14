package control;

import dao.Customer_ServiceDAO;
import java.sql.SQLException;
import model.Customer_Service;
import java.util.List;
import table.TableCS;

public class Customer_ServiceControl {
    private final Customer_ServiceDAO csDAO = new Customer_ServiceDAO();
    
    public String AutoID(){
        return csDAO.autoID();
    }
    
    public void insertDataCS(Customer_Service c){
        csDAO.insertCustomerService(c);
    }
    
    public void updateDataCS(Customer_Service c, String id){
        csDAO.updateCS(c, id);
    }
    
    public void deleteDataCS(String id){
        csDAO.deleteCS(id);
    }
    
    public Customer_Service fetchDataCS(String id){
        return csDAO.fetchCS(id);
    }
    
    public TableCS showCS(String query){
        List<Customer_Service> dataCS = csDAO.showCS(query);
        TableCS tableCS = new TableCS(dataCS);
        
        return tableCS;
    }
    
    public Customer_Service showCSby(String query){
        return csDAO.showCSby(query);
    }
    
    public boolean authenticateUser(String username, String password) {
        try {
            return csDAO.authenticateUser(username, password);
        } catch (SQLException e) {
            e.printStackTrace();
            return false;
        }
    }
}
