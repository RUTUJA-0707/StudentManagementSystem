package mini_projects;



import java.sql.*;
public class CP {
	static Connection con;
	public static Connection createc() {
		
		try {
			
			//load the driver
			Class.forName("com.mysql.jdbc.Driver");
			
			//create the Connection
			String user = "root"; //user of mysql
			String password = "1234567890"; //password of mysql
			//String url = "jdbc:mysql://localhost:3306/student";
			String url="jdbc:mysql://localhost:3306/student?autoReconnect=true&useSSL=false";
			con = DriverManager.getConnection(url,user,password);
			
			
		}catch(Exception e) {
			e.printStackTrace();
		}
		return con;
		
	}
}
;
