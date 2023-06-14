package dao;

import connection.DbConnection;
import java.math.BigDecimal;
import java.math.BigInteger;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;
import java.util.Random;

import model.Rekening;
import model.Nasabah;

public class RekeningDAO {
    private final DbConnection dbConnection = new DbConnection();
    
    public void insertRekening(Rekening rekening) {
        Connection connection = null;
        PreparedStatement statement = null;
        
        try {
            connection = dbConnection.makeConnection();
            String query = "INSERT INTO rekening (no_rekening, customer_identification, jenis, saldo) VALUES (?, ?, ?, ?)";
            statement = connection.prepareStatement(query);
            statement.setString(1, rekening.getNoRekening());
            statement.setString(2, rekening.getCin());
            statement.setString(3, rekening.getJenis());
            statement.setLong(4, rekening.getSaldo().longValueExact());
            statement.executeUpdate();
        } catch (SQLException e) {
            e.printStackTrace();
        } finally {
            dbConnection.closeConnection();
        }
    }
    
    public List<Rekening> getRekeningsByNasabah(Nasabah nasabah) {
        List<Rekening> rekeningList = new ArrayList<>();
        Connection connection = null;
        PreparedStatement statement = null;
        ResultSet resultSet = null;

        try {
            connection = dbConnection.makeConnection();
            String query = "SELECT * FROM rekening WHERE customer_identification = ?";
            statement = connection.prepareStatement(query);
            statement.setString(1, nasabah.getCustomer_identification());

            resultSet = statement.executeQuery();
            while (resultSet.next()) {
                String noRekening = resultSet.getString("no_rekening");
                String cin = resultSet.getString("customer_identification");
                String jenis = resultSet.getString("jenis");
                BigInteger saldo = resultSet.getBigDecimal("saldo").toBigIntegerExact();

                Rekening rekening = new Rekening(noRekening, cin, jenis, saldo);
                rekeningList.add(rekening);
            }
        } catch (SQLException e) {
            e.printStackTrace();
        } finally {
            dbConnection.closeConnection();
        }

        return rekeningList;
    }
    
    public void updateRekening(Rekening rekening) {
        Connection connection = null;
        PreparedStatement statement = null;

        try {
            connection = dbConnection.makeConnection();
            String query = "UPDATE rekening SET saldo = ? WHERE no_rekening = ?";
            statement = connection.prepareStatement(query);
            statement.setLong(1, rekening.getSaldo().longValueExact());
            statement.setString(2, rekening.getNoRekening());
            statement.executeUpdate();
        } catch (SQLException e) {
            e.printStackTrace();
        } finally {
            dbConnection.closeConnection();
        }
    }

    public void deleteRekening(String noRekening) {
        Connection connection = null;
        PreparedStatement statement = null;

        try {
            connection = dbConnection.makeConnection();
            String query = "DELETE FROM rekening WHERE no_rekening = ?";
            statement = connection.prepareStatement(query);
            statement.setString(1, noRekening);
            statement.executeUpdate();
        } catch (SQLException e) {
            e.printStackTrace();
        } finally {
            dbConnection.closeConnection();
        }
    }
    
    public Rekening getRekeningByNoRekening(String query) {
        Rekening rekening = null;
        Connection connection = null;
        PreparedStatement statement = null;
        ResultSet resultSet = null;

        try {
            connection = dbConnection.makeConnection();
            String sql = "SELECT r.*, n.nama FROM rekening r INNER JOIN nasabah n ON r.customer_identification = n.customer_identification WHERE r.no_rekening LIKE ? LIMIT 1";
            statement = connection.prepareStatement(sql);
            statement.setString(1, "%" + query + "%");

            resultSet = statement.executeQuery();
            if (resultSet.next()) {
                String noRekening = resultSet.getString("no_rekening");
                String cin = resultSet.getString("customer_identification");
                String namaNasabah = resultSet.getString("nama");
                String jenis = resultSet.getString("jenis");
                BigInteger saldo = resultSet.getBigDecimal("saldo").toBigIntegerExact();

                rekening = new Rekening(noRekening, cin, jenis, saldo);
                rekening.setNamaNasabah(namaNasabah);
            }
        } catch (SQLException e) {
            e.printStackTrace();
        } finally {
            dbConnection.closeConnection();
        }

        // Pemantauan log
        if (rekening == null) {
            System.out.println("Rekening is null");
        } else {
            System.out.println("Rekening found: " + rekening.toString());
        }

        return rekening;
    }




}
