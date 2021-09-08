package project4;
import java.sql.*;

public class conn {
	Connection c;
	Statement s;
	public conn() {
		try {
			Class.forName("com.mysql.cj.jdbc.Driver");
			c=DriverManager.getConnection("jdbc:mysql:///project4","root","Hashani#87");
			s=c.createStatement();
		}
		catch(Exception e) {
			System.out.println(e);
		}
	}
	
	

}
