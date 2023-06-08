package dao;

import connection.DbConnection;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;

import model.Customer_Service;

public class Customer_ServiceDAO {
    private final DbConnection dbConnection = new DbConnection();
    
    private Customer_Service fetch(String query, Connection connection) throws SQLException{
        Customer_Service c = null;
        
        Statement statement = connection.createStatement();
        statement.execute(query);
        var resultSet = statement.getResultSet();
        
        while(resultSet.next()){
            c = new Customer_Service(
                resultSet.getString("cs_id"),
                resultSet.getString("username"),
                resultSet.getString("password"),
                resultSet.getString("nama"),
                resultSet.getString("tanggal_lahir"),
                resultSet.getDouble("gaji")
            );
        }
        
        statement.close();
        return c;
    }
    
    private List<Customer_Service> fetchAll(String query, Connection connection) throws SQLException{
        List<Customer_Service> csList = new ArrayList<>();
        
        Statement statement = connection.createStatement();
        statement.execute(query);
        var resultSet = statement.getResultSet();
        
        while(resultSet.next()){
            Customer_Service c = new Customer_Service(
                                resultSet.getString("cs_id"),
                                resultSet.getString("username"),
                                resultSet.getString("password"),
                                resultSet.getString("nama"),
                                resultSet.getString("tanggal_lahir"),
                                resultSet.getDouble("gaji")
                            );
            csList.add(c);
        }
        
        statement.close();
        return csList;
    }
    
    public String autoID() {
        Connection connection = dbConnection.makeConnection();
        String id = null;
        String template = "CUS-";

        try {
            Statement statement = connection.createStatement();
            String sqlQuery = "SELECT cs_id FROM customer_service ORDER BY cs_id DESC LIMIT 1";
            ResultSet resultSet = statement.executeQuery(sqlQuery);

            if (resultSet.next()) {
                String lastID = resultSet.getString("cs_id");
                System.out.println("Last ID: " + lastID);
                String extractedNum = lastID.substring(template.length()); // Mengambil angka setelah template
                System.out.println("Extracted Number: " + extractedNum);
                int num = Integer.parseInt(extractedNum);
                int nextNum = num + 1;
                String Snum = String.format("%02d", nextNum); // Format angka menjadi dua digit dengan leading zero jika perlu
                id = template + Snum;
            } else {
                id = template + "01"; // Jika tidak ada data sebelumnya, gunakan nomor 01
            }

            resultSet.close();
            statement.close();
        } catch (Exception e) {
            System.out.println("Error generating auto ID: " + e.getMessage());
        }

        return id;
    }


    
    public void insertCustomerService(Customer_Service c){
        Connection connection = dbConnection.makeConnection();
        
         String query = "INSERT INTO customer_service VALUES ('" + c.getCs_id() + "', '" + c.getUsername() + "', '" + c.getPassword() + "', '" + c.getNama() + "', '" + c.getTanggalLahir() + "', '" + c.getGaji() + "')";
         System.out.println("Adding new Customer Service...");
         
         try{
             Statement statement = connection.createStatement();
            int result = statement.executeUpdate(query);
            System.out.println("Added " + result + " Customer Service!");
            statement.close();
         }catch(Exception e){
            System.out.println("Error while trying to add new Customer Service!");
            System.out.println(e.getMessage());
         }finally{
             dbConnection.closeConnection();
         }
    }
    
    public List<Customer_Service> fetchAllCS(){
        Connection connection = dbConnection.makeConnection();
        
        String query = "SELECT * FROM customer_service";
        System.out.println("Fetching all Customer Service...");
        
        List<Customer_Service> csList = new ArrayList<>();
        
        try{
            csList = fetchAll(query, connection);
        }catch(Exception e){
            System.out.println("Error while trying to fetch Customer Service!");
            System.out.println(e.getMessage());
        }finally{
            dbConnection.closeConnection();
        }
        return csList;
    }
    
    public Customer_Service fetchCS(String id){
        Connection connection = dbConnection.makeConnection();
        
        String query = "SELECT * FROM customer_service WHERE cs_id = '"+ id + "'";
        System.out.println("Fetching Customer Service...");
        
        Customer_Service c = null;
        
        try{
            c = fetch(query, connection);
        }catch(Exception e){
            System.out.println("Error while trying to fetch Customer Service!");
            System.out.println(e.getMessage());
        }finally{
            dbConnection.closeConnection();
        }
        return c;
    }
    
    public Customer_Service showCSby(String query){
        Connection connection = dbConnection.makeConnection();

        String sql = "SELECT * FROM customer_service WHERE cs_id LIKE '%" + query + "%' OR username LIKE '%" + query + "%' OR password LIKE '%" + query + "%' OR nama LIKE '%" + query + "%' OR tanggal_lahir LIKE '%" + query + "%' OR gaji LIKE '%" + query + "%' ORDER BY cs_id";
        System.out.println("Mengambil data Customer Service..");
        Customer_Service c = null;

        try{
            c = fetch(sql, connection); // Menggunakan query 'sql' yang telah didefinisikan sebelumnya
        }catch(Exception e){
            System.out.println("Error while trying to fetch Customer Service!");
            System.out.println(e.getMessage());
        }finally{
            dbConnection.closeConnection();
        }
        return c;
    }

    
    public void updateCS(Customer_Service c, String id){
        Connection connection = dbConnection.makeConnection();
        
        String query = "UPDATE customer_service SET cs_id = '" + c.getCs_id() + "', username = '" + c.getUsername() + "', password = '" + c.getPassword() + "', nama = '" + c.getNama() + "', tanggal_lahir = '" + c.getTanggalLahir() + "', gaji = '" + c.getGaji() + "' WHERE cs_id = '" + id + "'";
        System.out.println("Updating Customer Service...");
        
        try{
            Statement statement = connection.createStatement();
            int result = statement.executeUpdate(query);
            System.out.println("Updated " + result + " Customer Service!");
            statement.close();
        }catch(Exception e){
            System.out.println("Error while trying to update Customer Service!");
            System.out.println(e.getMessage());
        }finally{
            dbConnection.closeConnection();
        }
    }
    
    public void deleteCS(String id){
        Connection connection = dbConnection.makeConnection();

        String query = "DELETE FROM customer_service WHERE cs_id = '" + id + "'";
        System.out.println("Deleting Customer Service...");
        
        try{
            Statement statement = connection.createStatement();
            int result = statement.executeUpdate(query);
            System.out.println("Deleted " + result + " Customer Service!");
            statement.close();
        }catch(Exception e){
            System.out.println("Error while trying to delete Customer Service!");
            System.out.println(e.getMessage());
        }finally{
            dbConnection.closeConnection();
        }
    }
    
    public List<Customer_Service> showCS(String query){
        Connection connection = dbConnection.makeConnection();
        
        String sql = "SELECT * FROM customer_service WHERE cs_id LIKE 'CUS-%' ORDER BY CAST(SUBSTRING(cs_id, 5) AS UNSIGNED)";
        System.out.println("Mengambil data Customer Service..");
        
        List<Customer_Service> list = new ArrayList<>();
        
        try{
            Statement statement = connection.createStatement();
            ResultSet resultSet = statement.executeQuery(sql);
            
            if(resultSet!=null){
                while(resultSet.next()){
                    Customer_Service c = new Customer_Service(
                                resultSet.getString("cs_id"),
                                resultSet.getString("username"),
                                resultSet.getString("password"),
                                resultSet.getString("nama"),
                                resultSet.getString("tanggal_lahir"),
                                resultSet.getDouble("gaji")
                            );
                    list.add(c);
                }
            }
            resultSet.close();
            statement.close();
        }catch(Exception e){
            System.out.println("Error reading database....");
            System.out.println(e.getMessage());
        }finally{
            dbConnection.closeConnection();
        }
        
        return list;
    }
    
    
    
    public boolean authenticateUser(String username, String password) throws SQLException {
        Connection con = dbConnection.makeConnection();

        String query = "SELECT * FROM customer_service WHERE BINARY username = ? AND BINARY password = ?";

        PreparedStatement statement = con.prepareStatement(query);
        statement.setString(1, username);
        statement.setString(2, password);

        ResultSet resultSet = statement.executeQuery();
        return resultSet.next();
    }
}
