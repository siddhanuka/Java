package jdbc;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.Statement;

public class practice1 {

	
	public static void main(String[] args) {
		try{
			Class.forName("oracle.jdbc.driver.OracleDriver");
			Connection conn;
			conn=DriverManager.getConnection("jdbc:oracle:thin:@localhost:1521:XE", "system", "123");
			Statement querry=conn.createStatement();
			String s="select * from emp";
			ResultSet rs=querry.executeQuery(s);
			while(rs.next()){
				System.out.println("NAME: "+rs.getString(1)+ " ID: "+rs.getString(2)+" branch:"+rs.getString(3));
			}
		}catch (Exception e) {
			e.printStackTrace();
		}
	}
}


