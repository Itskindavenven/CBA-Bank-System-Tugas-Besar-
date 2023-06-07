package dao;

import connection.DbConnection;
import model.Manajer;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

public class ManajerDAO {
    private final DbConnection dbConnection = new DbConnection();

    public boolean authenticateUser(String username, String password) throws SQLException {
        Connection con = dbConnection.makeConnection();

        String query = "SELECT * FROM manajer WHERE BINARY username = ? AND BINARY password = ?";

        PreparedStatement statement = con.prepareStatement(query);
        statement.setString(1, username);
        statement.setString(2, password);

        ResultSet resultSet = statement.executeQuery();
        return resultSet.next();
    }
}
