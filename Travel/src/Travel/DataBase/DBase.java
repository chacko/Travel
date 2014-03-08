package Travel.DataBase;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;


public class DBase 
{

	public static Connection getOracleConnection() throws ClassNotFoundException, SQLException
	{
		
		Class.forName("oracle.jdbc.driver.OracleDriver");
		return DriverManager.getConnection("jdbc:oracle:thin:@localhost:1521:xe", "ictoosd", "ictoosd");
		
	}
	
	// close data base objects
	public static void closeDBase(Connection conn,ResultSet reSet,Statement stmnt) throws SQLException
	{
		conn.commit();
		conn.close();
		
		if(reSet != null)
		{
			reSet.close();
		}
		
		stmnt.close();
	}
}
