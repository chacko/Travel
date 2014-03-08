
package Travel.DataBase;

import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;

import Travel.Entity.Fees;

/**
 * @author 		George Chacko
 * Date			08 March 2014
 * Course		CMPP 264 Java workshop
 * DB class		Class to handle data base operations (select,insert,update and delete) 
 * 				on Fees table 
 *
 */
public class FeesDB 
{
	// Constructor
	public FeesDB()
	{
		
	}
	
	/* Data base methods */
	// SELECT - Get get specific fee information
	public static Fees getFees(String feeId)
	{
		try 
		{
			Fees fee = new Fees();
			
			// get connection
			Connection conn = DBase.getOracleConnection();
			
			Statement stmt;
			stmt = conn.createStatement();
			
			ResultSet rs;
			rs = stmt.executeQuery("select feeid,feename,feeamt,feedesc from fees where feeid='" + feeId +"'");
		
			while (rs.next())
			{
				fee.setFeeId(rs.getString("feeid")); 
				fee.setFeeName(rs.getString("feename"));
				fee.setFeeAmount(Double.valueOf(rs.getString("feeamt")));
				fee.setFeeDesc(rs.getString("feedesc"));
			}

			// close all data base objects to release memory
			DBase.closeDBase(conn, rs, stmt);
			
			return fee;
		} 
		catch (SQLException e) 
		{
			e.printStackTrace();
		}
		catch (ClassNotFoundException e) 
		{
			e.printStackTrace();
		}
		return null;
	}
	// -----------------------------------------
	// SELECT - all fees informations from fees table
	public static List<Fees> getAllFees()
	{
		try 
		{
			List<Fees> feeLst = new ArrayList<Fees>();
			
			// get connection
			Connection conn = DBase.getOracleConnection();
			
			Statement stmt;
			stmt = conn.createStatement();
			
			ResultSet rs;
			rs = stmt.executeQuery("select feeid,feename,feeamt,feedesc from fees ");
		
			while (rs.next())
			{
				Fees fee = new Fees();
				
				fee.setFeeId(rs.getString("feeid")); 
				fee.setFeeName(rs.getString("feename"));
				fee.setFeeAmount(Double.valueOf(rs.getString("feeamt")));
				fee.setFeeDesc(rs.getString("feedesc"));
				
				feeLst.add(fee);
			}
			
			// close all data base objects to release memory
			DBase.closeDBase(conn, rs, stmt);
			
			return feeLst;
		} 
		catch (SQLException e) 
		{
			e.printStackTrace();
		}
		catch (ClassNotFoundException e) 
		{
			e.printStackTrace();
		}
		return null;
	}
	//------------------------------------------
	// UPDATE - save changes for a specific fee record
	/**
	 * @param fee  - object variable hold individual fee info 
	 * 				- to update
	 * @return integer - number of rows updated
	 */
	public static int updateFees(Fees fee)
	{
		try 
		{
			int numRows=0;
			// get connection
			Connection conn = DBase.getOracleConnection();
			
			Statement stmt;
			stmt = conn.createStatement();
			
			StringBuilder qry = new StringBuilder();
			qry.append("update fees set feename ='");
			qry.append(fee.getFeeName());
			qry.append("',");
			qry.append(" feedesc ='");
			qry.append(fee.getFeeDesc());
			qry.append("',");
			qry.append(" feeamt =");
			qry.append(fee.getFeeAmount());
			qry.append(" where feeid ='");
			qry.append(fee.getFeeId());
			qry.append("' ");
			
			numRows = stmt.executeUpdate(qry.toString());

			// close all data base objects to release memory
			DBase.closeDBase(conn, null, stmt);
			
			return numRows;
		} 
		catch (SQLException e) 
		{
			e.printStackTrace();
		}
		catch (ClassNotFoundException e) 
		{
			e.printStackTrace();
		}
		return 0;
	}
	//------------------------------------------
	/**
	 * @param fee - object variable holds individual fee information
	 * 				- to insert	 
	 * @return Integer - number of rows inserted
	 */
	public static int insertFees(Fees fee)
	{
		try 
		{
			int numRows=0;
			// get connection
			Connection conn = DBase.getOracleConnection();
			
			Statement stmt;
			stmt = conn.createStatement();
			
			StringBuilder qry = new StringBuilder();
			qry.append("insert into fees (feeid,feename,feedesc,feeamt) values (");
			qry.append("'");
			qry.append(fee.getFeeId());
			qry.append("','");
			qry.append(fee.getFeeName());
			qry.append("','");
			qry.append(fee.getFeeDesc());
			qry.append("',");
			qry.append(fee.getFeeAmount());
			qry.append(")");
			
			numRows = stmt.executeUpdate(qry.toString());

			// close all data base objects to release memory
			DBase.closeDBase(conn, null, stmt);
			
			return numRows;
		} 
		catch (SQLException e) 
		{
			e.printStackTrace();
		}
		catch (ClassNotFoundException e) 
		{
			e.printStackTrace();
		}
		return 0;
	}
	//------------------------------------------
	/**
	 * @param feeId
	 * @return Integer - number of rows deleted
	 */
	public static int deleteFees(String feeId)
	{
		try 
		{
			int numRows=0;
			// get connection
			Connection conn = DBase.getOracleConnection();
			
			Statement stmt;
			stmt = conn.createStatement();
			
			String qry = "delete from fees where feeid='" + feeId + "'";
			
			numRows = stmt.executeUpdate(qry.toString());
			
			// close all data base objects to release memory
			DBase.closeDBase(conn, null, stmt);
			
			return numRows;
		} 
		catch (SQLException e) 
		{
			e.printStackTrace();
		}
		catch (ClassNotFoundException e) 
		{
			e.printStackTrace();
		}
		return 0;
	}
	//------------------------------------------
}
