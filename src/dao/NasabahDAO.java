package dao;

import connection.DbConnection;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;

import model.Nasabah;

public class NasabahDAO {
    private final DbConnection dbConnection = new DbConnection();
    
    private Nasabah fetch(String query, Connection connection) throws SQLException{
        Nasabah n = null;
        
        Statement statement = connection.createStatement();
        statement.execute(query);
        var resultSet = statement.getResultSet();
        
         while(resultSet.next()){
            n = new Nasabah(
                resultSet.getString("customer_identification"),
                resultSet.getString("nik"),
                resultSet.getString("nama"),
                resultSet.getString("alamat"),
                resultSet.getString("tanggal_lahir"),
                resultSet.getString("pekerjaan")
            );
        }
        
        statement.close();
        return n;
    }
    
    private List<Nasabah> fetchAll(String query, Connection connection) throws SQLException{
        List<Nasabah> nList = new ArrayList<>();
        
        Statement statement = connection.createStatement();
        statement.execute(query);
        var resultSet = statement.getResultSet();
        
        while(resultSet.next()){
            Nasabah n = new Nasabah(
                        resultSet.getString("customer_identification"),
                        resultSet.getString("nik"),
                        resultSet.getString("nama"),
                        resultSet.getString("alamat"),
                        resultSet.getString("tanggal_lahir"),
                        resultSet.getString("pekerjaan")
                    );
            nList.add(n);
        }
        
        statement.close();
        return nList;
    }
    
    public String autoID(){
        Connection connection = dbConnection.makeConnection();
        String customer_identification = null;
        String template = "CIN-";

        try {
            Statement statement = connection.createStatement();
            String sqlQuery = "SELECT customer_identification FROM nasabah ORDER BY customer_identification DESC LIMIT 1";
            ResultSet resultSet = statement.executeQuery(sqlQuery);

            if (resultSet.next()) {
                String lastID = resultSet.getString("customer_identification");
                System.out.println("Last ID: " + lastID);
                String extractedNum = lastID.substring(template.length()); // Mengambil angka setelah template
                System.out.println("Extracted Number: " + extractedNum);
                int num = Integer.parseInt(extractedNum);
                int nextNum = num + 1;
                String Snum = String.format("%02d", nextNum); // Format angka menjadi dua digit dengan leading zero jika perlu
                customer_identification = template + Snum;
            } else {
                customer_identification = template + "01"; // Jika tidak ada data sebelumnya, gunakan nomor 01
            }

            resultSet.close();
            statement.close();
        } catch (Exception e) {
            System.out.println("Error generating auto ID: " + e.getMessage());
        }

        return customer_identification;
    }
    
    public void insertNasabah(Nasabah n) {
        try (Connection connection = dbConnection.makeConnection();
             PreparedStatement statement = connection.prepareStatement(
                     "INSERT INTO nasabah (customer_identification, nik, nama, alamat, tanggal_lahir, pekerjaan) " +
                             "VALUES (?, ?, ?, ?, ?, ?)")) {

            statement.setString(1, n.getCustomer_identification());
            statement.setString(2, n.getNik());
            statement.setString(3, n.getNama());
            statement.setString(4, n.getAlamat());
            statement.setString(5, n.getTanggalLahir());
            statement.setString(6, n.getPekerjaan());

            int result = statement.executeUpdate();
            System.out.println("Added " + result + " Nasabah!");
        } catch (SQLException e) {
            System.out.println("Error while trying to add new Nasabah!");
            e.printStackTrace();
        } finally {
            dbConnection.closeConnection();
        }
    }
    
    public List<Nasabah> fetchAllNasabah(){
        Connection connection = dbConnection.makeConnection();
        
        String query = "SELECT * FROM nasabah";
        System.out.println("Fetching all Nasabah...");
        
        List<Nasabah> nList = new ArrayList<>();
        
        try{
            nList = fetchAll(query, connection);
        }catch(Exception e){
            System.out.println("Error while trying to fetch Nsabah!");
            System.out.println(e.getMessage());
        }finally{
            dbConnection.closeConnection();
        }
        
        return nList;
    }
    
    public Nasabah fetchNasabah(String customer_identification){
        Connection connection = dbConnection.makeConnection();
        
        String query = "SELECT * FROM nasabah WHERE customer_identification = '"+ customer_identification + "'";
        System.out.println("Fetching Nasabah...");
        
        Nasabah n = null;
        
        try{
            n = fetch(query, connection);
        }catch(Exception e){
            System.out.println("Error while trying to fetch Nasabah!");
            System.out.println(e.getMessage());
        }finally{
            dbConnection.closeConnection();
        }
        return n;
    }
    
    public void updateNasabah(Nasabah n, String customer_identification){
        Connection connection = dbConnection.makeConnection();
        
        String query = "UPDATE nasabah SET customer_identification = '" + n.getCustomer_identification() + "', nik = '" + n.getNik() + "', nama = '" + n.getNama() + "', tanggal_lahir = '" + n.getTanggalLahir() + "', alamat = '" + n.getAlamat() + "', pekerjaan = '" + n.getPekerjaan() + "' WHERE customer_identification = '" + customer_identification + "'";
        System.out.println("Updating Nasabah...");
        
        try{
            Statement statement = connection.createStatement();
            int result = statement.executeUpdate(query);
            System.out.println("Updated " + result + " Nasabah!");
            statement.close();
        }catch(Exception e){
            System.out.println("Error while trying to update Nasabah!");
            System.out.println(e.getMessage());
        }finally{
            dbConnection.closeConnection();
        }
    }
    
    public void deleteNasabah(String customer_identification){
        Connection connection = dbConnection.makeConnection();

        String query = "DELETE FROM nasabah WHERE customer_identification = '" + customer_identification + "'";
        System.out.println("Deleting Nasabah...");
        
        try{
            Statement statement = connection.createStatement();
            int result = statement.executeUpdate(query);
            System.out.println("Deleted " + result + " Nasabah!");
            statement.close();
        }catch(Exception e){
            System.out.println("Error while trying to delete Nasabah!");
            System.out.println(e.getMessage());
        }finally{
            dbConnection.closeConnection();
        }
    }
    
    public List<Nasabah> showNasabah(String query){
        Connection connection = dbConnection.makeConnection();
        
        String sql = "SELECT * FROM nasabah WHERE customer_identification LIKE 'CIN-%' ORDER BY CAST(SUBSTRING(customer_identification, 5) AS UNSIGNED)";
        System.out.println("Mengambil data Nasabah..");
        
        List<Nasabah> list = new ArrayList<>();
        
        try{
            Statement statement = connection.createStatement();
            ResultSet resultSet = statement.executeQuery(sql);
            
            if(resultSet!=null){
                while(resultSet.next()){
                    Nasabah n = new Nasabah(
                                resultSet.getString("customer_identification"),
                                resultSet.getString("nik"),
                                resultSet.getString("nama"),
                                resultSet.getString("alamat"),
                                resultSet.getString("tanggal_lahir"),
                                resultSet.getString("pekerjaan")
                            );
                    list.add(n);
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
    
    public int countNasabah() {
        Connection connection = dbConnection.makeConnection();
        int count = 0;

        try {
            Statement statement = connection.createStatement();
            String sqlQuery = "SELECT COUNT(*) AS count FROM nasabah";
            ResultSet resultSet = statement.executeQuery(sqlQuery);

            if (resultSet.next()) {
                count = resultSet.getInt("count");
            }

            resultSet.close();
            statement.close();
        } catch (Exception e) {
            System.out.println("Error counting Nasabah: " + e.getMessage());
        } finally {
            dbConnection.closeConnection();
        }

        return count;
    }
    
    public Nasabah showNasabahby(String query) {
        Connection connection = dbConnection.makeConnection();

        String sql = "SELECT * FROM nasabah WHERE customer_identification LIKE '%" + query + "%' OR nik LIKE '%" + query + "%' OR nama LIKE '%" + query + "%' ORDER BY customer_identification";
        System.out.println("Mengambil data Nasabah..");
        Nasabah n = null;

        try {
            n = fetch(sql, connection);
        } catch (Exception e) {
            System.out.println("Error while trying to fetch Nasabah!");
            System.out.println(e.getMessage());
        } finally {
            dbConnection.closeConnection();
        }
        return n;
    }


}
