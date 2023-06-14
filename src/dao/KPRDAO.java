package dao;

import connection.DbConnection;
import model.Transaksi;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import model.KPR;

public class KPRDAO {
    private final DbConnection dbConnection = new DbConnection();
    
    public String autoID(){
        Connection connection = dbConnection.makeConnection();
        String id = null;
        String template = "KPR-";

        try {
            Statement statement = connection.createStatement();
            String sqlQuery = "SELECT id FROM kpr ORDER BY id DESC LIMIT 1";
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
    
    public void insertKPR(KPR kpr) throws SQLException{
        Connection connection = null;
        PreparedStatement statement = null;
        
        try{
            connection = dbConnection.makeConnection();
            String query = "INSERT INTO kpr (id, customer_identification, harga_rumah, penghasilan, pinjaman, jangka_waktu, rasio_cicilan, approve) VALUES(?, ?, ?, ?, ?, ?, ?, ?)";
            statement = connection.prepareStatement(query);
            statement.setString(1, kpr.getId());
            statement.setString(2, kpr.getCin());
            statement.setLong(3, kpr.getHargaRumah().longValueExact());
            statement.setLong(4, kpr.getPenghasilan().longValueExact());
            statement.setLong(5, kpr.getPinjaman().longValueExact());
            statement.setInt(6, kpr.getJangkaWaktu());
            statement.setFloat(7, kpr.getRasioCicilan());
            statement.setString(8, kpr.getApprove());
            statement.executeUpdate();
        }catch (SQLException e) {
            e.printStackTrace();
        } finally {
            dbConnection.closeConnection();
        }
    }
}
