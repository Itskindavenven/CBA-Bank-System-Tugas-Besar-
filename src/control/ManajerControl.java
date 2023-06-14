/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package control;

import dao.ManajerDAO;
import model.Manajer;

import java.sql.SQLException;
/**
 *
 * @author Asus
 */
public class ManajerControl {
    private ManajerDAO manajerDAO;

    public ManajerControl() {
        this.manajerDAO = new ManajerDAO();
    }

    public boolean authenticateUser(String username, String password) {
        try {
            return manajerDAO.authenticateUser(username, password);
        } catch (SQLException e) {
            e.printStackTrace();
            return false;
        }
    }
}
