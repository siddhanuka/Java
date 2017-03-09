import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;



public class DBConnection {

	public static void main(String[] args) {
		try {
			Class.forName("oracle.jdbc.driver.OracleDriver");
			//OracleDriver obj = new OracleDriver();
			Connection connection = null;
			connection = DriverManager.getConnection(
				"jdbc:oracle:thin:@localhost:1521:XE","system","123");
			Statement stmt = connection.createStatement();
			ResultSet rs = stmt.executeQuery("select * from emp where name='sanchit'");
			
			while(rs.next())
			{
				System.out.println("Name:"+rs.getString(1)+" Id:"+rs.getInt(2)+" Dept:"+rs.getString(3));
			}
			
			
			
			connection.close();
			//oracle.jdbc.driver.OracleDriver obj = new 
			
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
}
