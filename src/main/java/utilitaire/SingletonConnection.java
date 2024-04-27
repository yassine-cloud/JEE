package utilitaire;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class SingletonConnection {
	private static Connection con;
	
	
	public static Connection getCon() {
		return con;
	}


	static {
	try {
		Class.forName("com.mysql.jdbc.Driver");
		con=DriverManager.getConnection("jdbc:mysql://localhost:3306/tpjee","root","");
		System.out.print("success");
	} catch (ClassNotFoundException e) {
		// TODO Auto-generated catch block
		e.printStackTrace();
	} catch (SQLException e) {
		// TODO Auto-generated catch block
		e.printStackTrace();
	}
	}

}

