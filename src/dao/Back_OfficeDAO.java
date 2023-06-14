package dao;
import connection.DbConnection;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;

import model.Back_Office;

public class Back_OfficeDAO {
    private final DbConnection dbConnection = new DbConnection();
    
    private Back_Office fetch(String query, Connection connection) throws SQLException{
        Back_Office b = null;
        
        Statement statement = connection.createStatement();
        statement.execute(query);
        var resultSet = statement.getResultSet();
        
        while(resultSet.next()){
            b = new Back_Office(resultSet.getString("bo_id"),
                resultSet.getString("username"),
                resultSet.getString("password"),
                resultSet.getString("nama"),
                resultSet.getString("tanggal_lahir"),
                resultSet.getDouble("gaji")
            );
        }
        statement.close();
        return b;
    }
    
    private List<Back_Office> fetchAll(String query, Connection connection) throws SQLException{
        List<Back_Office> bList = new ArrayList<>();
        
        Statement statement = connection.createStatement();
        statement.execute(query);
        var resultSet = statement.getResultSet();
        
        while(resultSet.next()){
            Back_Office b = new Back_Office(resultSet.getString("bo_id"),
                resultSet.getString("username"),
                resultSet.getString("password"),
                resultSet.getString("nama"),
                resultSet.getString("tanggal_lahir"),
                resultSet.getDouble("gaji")
            );
            bList.add(b);
        }
        
        statement.close();
        return bList;
    }
    
    
    public void insertBO(Back_Office b){
        Connection connection = dbConnection.makeConnection();
        
         String query = "INSERT INTO back_office VALUES ('" + b.getBo_id()+ "', '" + b.getUsername()+ "', '" + b.getPassword()+ "', '" + b.getNama() + "', '" + b.getTanggalLahir() + "', '" + b.getGaji() + "')";
         System.out.println("Adding new Back Office...");
         
         try{
             Statement statement = connection.createStatement();
            int result = statement.executeUpdate(query);
            System.out.println("Added " + result + " Back Office!");
            statement.close();
         }catch(Exception e){
            System.out.println("Error while trying to add new Back Office!");
            System.out.println(e.getMessage());
         }finally{
             dbConnection.closeConnection();
         }
    }
    
    public List<Back_Office> fetchAllBO(){
        Connection connection = dbConnection.makeConnection();
        
        String query = "SELECT * FROM back_office";
        System.out.println("Fetching all Back Office...");
        
        List<Back_Office> bList = new ArrayList<>();
        
        try{
            bList = fetchAll(query, connection);
        }catch(Exception e){
            System.out.println("Error while trying to fetch Back Office!");
            System.out.println(e.getMessage());
        }finally{
            dbConnection.closeConnection();
        }
        return bList;
    }
    
    public Back_Office fetchBO(String id){
        Connection connection = dbConnection.makeConnection();
        
        String query = "SELECT * FROM back_office WHERE bo_id = '"+ id + "'";
        System.out.println("Fetching Back Office...");
        
        Back_Office b = null;
        
        try{
            b = fetch(query, connection);
        }catch(Exception e){
            System.out.println("Error while trying to fetch Back Office!");
            System.out.println(e.getMessage());
        }finally{
            dbConnection.closeConnection();
        }
        return b;
    }
    
    public String autoID() {
        Connection connection = dbConnection.makeConnection();
        String id = null;
        String template = "BO-";

        try {
            Statement statement = connection.createStatement();
            String sqlQuery = "SELECT bo_id FROM back_office ORDER BY bo_id DESC LIMIT 1";
            ResultSet resultSet = statement.executeQuery(sqlQuery);

            if (resultSet.next()) {
                String lastID = resultSet.getString("bo_id");
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
    
    public Back_Office showBOby(String query){
        Connection connection = dbConnection.makeConnection();

        String sql = "SELECT * FROM back_office WHERE bo_id LIKE '%" + query + "%' OR username LIKE '%" + query + "%' OR password LIKE '%" + query + "%' OR nama LIKE '%" + query + "%' OR tanggal_lahir LIKE '%" + query + "%' OR gaji LIKE '%" + query + "%' ORDER BY cs_id";
        System.out.println("Mengambil data Customer Service..");
        Back_Office b = null;

        try{
            b = fetch(sql, connection); // Menggunakan query 'sql' yang telah didefinisikan sebelumnya
        }catch(Exception e){
            System.out.println("Error while trying to fetch Back Office!");
            System.out.println(e.getMessage());
        }finally{
            dbConnection.closeConnection();
        }
        return b;
    }
    
    public void updateBO(Back_Office b, String id){
        Connection connection = dbConnection.makeConnection();
        
        String query = "UPDATE back_office SET bo_id = '" + b.getBo_id() + "', username = '" + b.getUsername() + "', password = '" + b.getPassword() + "', nama = '" + b.getNama() + "', tanggal_lahir = '" + b.getTanggalLahir() + "', gaji = '" + b.getGaji() + "' WHERE bo_id = '" + id + "'";
        System.out.println("Updating Back Office...");
        
        try{
            Statement statement = connection.createStatement();
            int result = statement.executeUpdate(query);
            System.out.println("Updated " + result + " Back Office!");
            statement.close();
        }catch(Exception e){
            System.out.println("Error while trying to update Back Office!");
            System.out.println(e.getMessage());
        }finally{
            dbConnection.closeConnection();
        }
    }
    
    public void deleteBO(String id){
        Connection connection = dbConnection.makeConnection();

        String query = "DELETE FROM back_office WHERE bo_id = '" + id + "'";
        System.out.println("Deleting Back Office...");
        
        try{
            Statement statement = connection.createStatement();
            int result = statement.executeUpdate(query);
            System.out.println("Deleted " + result + " Back office!");
            statement.close();
        }catch(Exception e){
            System.out.println("Error while trying to delete Back Office!");
            System.out.println(e.getMessage());
        }finally{
            dbConnection.closeConnection();
        }
    }
    
    public List<Back_Office> showBO(String query){
        Connection connection = dbConnection.makeConnection();
        
        String sql = "SELECT * FROM back_office WHERE bo_id LIKE '%" + query + "%' OR username LIKE '%" + query + "%' OR password LIKE '%" + query + "%' OR nama LIKE '%" + query + "%' OR tanggal_lahir LIKE '%" + query + "%' OR gaji LIKE '%" + query + "%' ORDER BY bo_id";
        System.out.println("Mengambil data Back Office..");
        
        List<Back_Office> list = new ArrayList<>();
        
        try{
            Statement statement = connection.createStatement();
            ResultSet resultSet = statement.executeQuery(sql);
            
            if(resultSet!=null){
                while(resultSet.next()){
                    Back_Office b = new Back_Office(resultSet.getString("bo_id"),
                                resultSet.getString("username"),
                                resultSet.getString("password"),
                                resultSet.getString("nama"),
                                resultSet.getString("tanggal_lahir"),
                                resultSet.getDouble("gaji")
                            );
                    list.add(b);
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

        String query = "SELECT * FROM back_office WHERE BINARY username = ? AND BINARY password = ?";

        PreparedStatement statement = con.prepareStatement(query);
        statement.setString(1, username);
        statement.setString(2, password);

        ResultSet resultSet = statement.executeQuery();
        return resultSet.next();
    }
}
