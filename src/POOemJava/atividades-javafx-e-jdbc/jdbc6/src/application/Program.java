package application;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.text.ParseException;
import java.text.SimpleDateFormat;

import db.DB;
import db.DbException;
import db.DbIntegrityException;

public class Program {

	public static void main(String[] args) {
		Connection conn = null;
		Statement st = null;
		try {
			conn = DB.getConnection();
			
			conn.setAutoCommit(false); // n�o confirma transa��es automaticamente
			
			st = conn.createStatement();
			
			int rows1 = st.executeUpdate("UPDATE seller SET "
					+ "BaseSalary = 2770 WHERE DepartmentId = 1");
			
			//int x = 1; erro for�ado
			//if(x<2) {
			//	throw new SQLException("Fake error");
			//}
			
			int rows2 = st.executeUpdate("UPDATE seller SET "
					+ "BaseSalary = 3290 WHERE DepartmentId = 2");
			
			conn.commit(); // a transa��o � confirmada
 			
			System.out.println("Rows 1 : " + rows1);
			System.out.println("Rows 2 : " + rows2);
			
		}
		catch(SQLException e) {
			try {
				conn.rollback();
				throw new DbException("Transaction rolled back. Caused by: " + e.getMessage());
			} catch (SQLException e1) {
				throw new DbException("Error trying to rollback! Caused by: " + e.getMessage());
			}
		}
		
		finally {
			DB.closeStatement(st);
			DB.closeConnection();
		}

	}

}
