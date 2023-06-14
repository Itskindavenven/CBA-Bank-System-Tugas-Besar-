package dao;

import connection.DbConnection;
import model.Rekening;
import model.Transaksi;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

public class TransaksiDAO {
    private final DbConnection dbConnection = new DbConnection();
    
    public String autoID(){
        Connection connection = dbConnection.makeConnection();
        String id = null;
        String template = "T-";

        try {
            Statement statement = connection.createStatement();
            String sqlQuery = "SELECT id FROM transaksi ORDER BY id DESC LIMIT 1";
            ResultSet resultSet = statement.executeQuery(sqlQuery);

            if (resultSet.next()) {
                String lastID = resultSet.getString("id");
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
    
    public void insertTransaksi(Transaksi transaksi) throws SQLException {
        Connection connection = null;
        PreparedStatement statement = null;
        
        try{
            connection = dbConnection.makeConnection();
            String query = "INSERT INTO transaksi (id, no_rekening, tanggal, jumlah, jenis) VALUES (?, ?, ?, ?, ?)";
            statement = connection.prepareStatement(query);
            statement.setString(1, transaksi.getTransaksi_id());
            statement.setString(2, transaksi.getNo_rekening());
            statement.setString(3, transaksi.getTanggal());
            statement.setLong(4, transaksi.getJumlah().longValueExact());
            statement.setString(5, transaksi.getJenisTransaksi());
            statement.executeUpdate();
        }catch(Exception e){
            e.printStackTrace();
        }finally{
            dbConnection.closeConnection();
        }
    }

}
