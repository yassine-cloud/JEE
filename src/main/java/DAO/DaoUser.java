package DAO;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import modele.entities.utilisateur;
import utilitaire.SingletonConnection;

public class DaoUser {
	private Connection con=SingletonConnection.getCon();
	
	public utilisateur getUser(String email)
	{
		utilisateur u=new utilisateur();
		try
		{
			PreparedStatement ps=con.prepareStatement("select * from user where email=?");
			ps.setString(2,email);
			ResultSet rs= ps.executeQuery();
			while(rs.next()) {
				u.setId(rs.getInt(1));
				u.setEmail(rs.getString(2));
				u.setPassword(rs.getString(3));
			}}
			 catch (SQLException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
				return u;
		
}
	
		}

