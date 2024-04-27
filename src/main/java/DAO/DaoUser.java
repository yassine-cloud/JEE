package DAO;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import modele.entities.utilisateur;
import utilitaire.SingletonConnection;

public class DaoUser {
    private Connection con = SingletonConnection.getCon();

    public utilisateur getUser(String email) {
        utilisateur u = new utilisateur();
        try {
            if (con == null) {
                // Handle null connection
                System.err.println("Connection is null.");
                return null;
            }
            PreparedStatement ps = con.prepareStatement("SELECT * FROM user WHERE email=?");
            ps.setString(1, email);
            ResultSet rs = ps.executeQuery();
            while (rs.next()) {
                u.setId(rs.getInt(1));
                u.setEmail(rs.getString(3));
                u.setPassword(rs.getString(4));
            }
            rs.close();
            ps.close();
        } catch (SQLException e) {
            // Handle SQL exception
            e.printStackTrace();
        } finally {
            try {
                if (con != null) {
                    con.close();
                }
            } catch (SQLException e) {
                // Handle close exception
                e.printStackTrace();
            }
        }
        if(u.getEmail() != null)
        	return u;
        else
        	return null;
    }
}
