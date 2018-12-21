package p1;

import java.sql.Connection;
import java.sql.DriverManager;

import oracle.jdbc.OracleDriver;

public class DBConnector 
{
	String url="jdbc:oracle:thin:@//localhost:1521/XE";
	String un="system";
	String pw="system";
	
	Connection con=null;
	
	public Connection giveConnection()
	{
		try
		{
			Class.forName("oracle.jdbc.driver.OracleDriver");
			con=DriverManager.getConnection(url, un, pw);
		}
		catch(Exception e)
		{
			e.printStackTrace();
		}
		return con;
	}
}
