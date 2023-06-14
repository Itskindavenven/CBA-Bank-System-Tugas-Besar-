/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package dao;
import connection.DbConnection;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;

import model.Teller;

public class TellerDAO {
    private final DbConnection dbConnection = new DbConnection();
    
    private Teller fetch(String query, Connection connection) throws SQLException{
        Teller t = null;
        
        Statement statement = connection.createStatement();
        statement.execute(query);
        var resultSet = statement.getResultSet();
        
        while(resultSet.next()){
            t = new Teller(resultSet.getString("teller_id"),
                resultSet.getString("username"),
                resultSet.getString("password"),
                resultSet.getString("nama"),
                resultSet.getString("tanggal_lahir"),
                resultSet.getDouble("gaji")
            );
        }
        statement.close();
        return t;
    }
    
    private List<Teller> fetchAll(String query, Connection connection) throws SQLException{
        List<Teller> tList = new ArrayList<>();
        
        Statement statement = connection.createStatement();
        statement.execute(query);
        var resultSet = statement.getResultSet();
        
        while(resultSet.next()){
            Teller t = new Teller(resultSet.getString("teller_id"),
                resultSet.getString("username"),
                resultSet.getString("password"),
                resultSet.getString("nama"),
                resultSet.getString("tanggal_lahir"),
                resultSet.getDouble("gaji")
            );
            tList.add(t);
        }
        
        statement.close();
        return tList;
    }
    
    
    public void insertTeller(Teller t){
        Connection connection = dbConnection.makeConnection();
        
         String query = "INSERT INTO teller VALUES ('" + t.getTeller_id()+ "', '" + t.getUsername()+ "', '" + t.getPassword()+ "', '" + t.getNama() + "', '" + t.getTanggalLahir() + "', '" + t.getGaji() + "')";
         System.out.println("Adding new Teller...");
         
         try{
             Statement statement = connection.createStatement();
            int result = statement.executeUpdate(query);
            System.out.println("Added " + result + " Teller!");
            statement.close();
         }catch(Exception e){
            System.out.println("Error while trying to add new Teller!");
            System.out.println(e.getMessage());
         }finally{
             dbConnection.closeConnection();
         }
    }
    
    public List<Teller> fetchAllTeller(){
        Connection connection = dbConnection.makeConnection();
        
        String query = "SELECT * FROM teller";
        System.out.println("Fetching all Teller...");
        
        List<Teller> tList = new ArrayList<>();
        
        try{
            tList = fetchAll(query, connection);
        }catch(Exception e){
            System.out.println("Error while trying to fetch Teller!");
            System.out.println(e.getMessage());
        }finally{
            dbConnection.closeConnection();
        }
        return tList;
    }
    
    public Teller fetchTeller(String id){
        Connection connection = dbConnection.makeConnection();
        
        String query = "SELECT * FROM teller WHERE teller_id = '"+ id + "'";
        System.out.println("Fetching Customer Service...");
        
        Teller t = null;
        
        try{
            t = fetch(query, connection);
        }catch(Exception e){
            System.out.println("Error while trying to fetch Teller!");
            System.out.println(e.getMessage());
        }finally{
            dbConnection.closeConnection();
        }
        return t;
    }
    
    public void updateTeller(Teller t, String id){
        Connection connection = dbConnection.makeConnection();
        
        String query = "UPDATE teller SET teller_id = '" + t.getTeller_id() + "', username = '" + t.getUsername() + "', password = '" + t.getPassword() + "', nama = '" + t.getNama() + "', tanggal_lahir = '" + t.getTanggalLahir() + "', gaji = '" + t.getGaji() + "' WHERE teller_id = '" + id + "'";
        System.out.println("Updating Teller...");
        
        try{
            Statement statement = connection.createStatement();
            int result = statement.executeUpdate(query);
            System.out.println("Updated " + result + " Teller!");
            statement.close();
        }catch(Exception e){
            System.out.println("Error while trying to update Teller!");
            System.out.println(e.getMessage());
        }finally{
            dbConnection.closeConnection();
        }
    }
    
    public void deleteTeller(String id){
        Connection connection = dbConnection.makeConnection();

        String query = "DELETE FROM teller WHERE teller_id = '" + id + "'";
        System.out.println("Deleting Teller...");
        
        try{
            Statement statement = connection.createStatement();
            int result = statement.executeUpdate(query);
            System.out.println("Deleted " + result + " Teller!");
            statement.close();
        }catch(Exception e){
            System.out.println("Error while trying to delete Teller!");
            System.out.println(e.getMessage());
        }finally{
            dbConnection.closeConnection();
        }
    }
    
    public List<Teller> showTeller(String query){
        Connection connection = dbConnection.makeConnection();
        
        String sql = "SELECT * FROM teller WHERE teller_id LIKE '%" + query + "%' OR username LIKE '%" + query + "%' OR password LIKE '%" + query + "%' OR nama LIKE '%" + query + "%' OR tanggal_lahir LIKE '%" + query + "%' OR gaji LIKE '%" + query + "%' ORDER BY teller_id";
        System.out.println("Mengambil data Customer Service..");
        
        List<Teller> list = new ArrayList<>();
        
        try{
            Statement statement = connection.createStatement();
            ResultSet resultSet = statement.executeQuery(sql);
            
            if(resultSet!=null){
                while(resultSet.next()){
                    Teller t = new Teller(resultSet.getString("teller_id"),
                                resultSet.getString("username"),
                                resultSet.getString("password"),
                                resultSet.getString("nama"),
                                resultSet.getString("tanggal_lahir"),
                                resultSet.getDouble("gaji")
                            );
                    list.add(t);
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
    
    public Teller showTellerby(String query){
        Connection connection = dbConnection.makeConnection();

        String sql = "SELECT * FROM teller WHERE teller_id LIKE '%" + query + "%' OR username LIKE '%" + query + "%' OR password LIKE '%" + query + "%' OR nama LIKE '%" + query + "%' OR tanggal_lahir LIKE '%" + query + "%' OR gaji LIKE '%" + query + "%' ORDER BY cs_id";
        System.out.println("Mengambil data Teller..");
        Teller c = null;

        try{
            c = fetch(sql, connection); // Menggunakan query 'sql' yang telah didefinisikan sebelumnya
        }catch(Exception e){
            System.out.println("Error while trying to fetch Teller!");
            System.out.println(e.getMessage());
        }finally{
            dbConnection.closeConnection();
        }
        return c;
    }
    
    public boolean authenticateUser(String username, String password) throws SQLException {
        Connection con = dbConnection.makeConnection();

        String query = "SELECT * FROM teller WHERE BINARY username = ? AND BINARY password = ?";

        PreparedStatement statement = con.prepareStatement(query);
        statement.setString(1, username);
        statement.setString(2, password);

        ResultSet resultSet = statement.executeQuery();
        return resultSet.next();
    }
    
    public String autoID() {
        Connection connection = dbConnection.makeConnection();
        String id = null;
        String template = "TEL-";

        try {
            Statement statement = connection.createStatement();
            String sqlQuery = "SELECT teller_id FROM teller ORDER BY teller_id DESC LIMIT 1";
            ResultSet resultSet = statement.executeQuery(sqlQuery);

            if (resultSet.next()) {
                String lastID = resultSet.getString("teller_id");
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
    
}
