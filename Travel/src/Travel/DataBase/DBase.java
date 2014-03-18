package Travel.DataBase;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

import Travel.Entity.Agents;


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
	
	// get next id (primary key) for agents
	public static Integer getNextvalAgentsSeq()
	{
		try 
		{
			Integer nextVal=0;
			
			// get connection
			Connection conn = DBase.getOracleConnection();
			
			Statement stmt;
			stmt = conn.createStatement();
			
			ResultSet rs;
			String qry = "select agents_seq.nextval from dual ";
			
			
			rs = stmt.executeQuery(qry.toString());
		
			while (rs.next())
			{
				nextVal = Integer.valueOf(rs.getString("nextval"));
			}

			// close all data base objects to release memory
			DBase.closeDBase(conn, rs, stmt);
			
			return nextVal;
		} 
		catch (SQLException e) 
		{
			e.printStackTrace();
		}
		catch (ClassNotFoundException e) 
		{
			e.printStackTrace();
		}
		return 1; // error condition
	}
}
