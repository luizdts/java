package application;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.text.ParseException;
import java.text.SimpleDateFormat;

import db.DB;

public class Program {

	public static void main(String[] args) {
		SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yyyy");
		Connection conn = null;
		PreparedStatement st = null;
		try {
			conn = DB.getConnection();
			/* inserindo dados
			st = conn.prepareStatement(
					"INSERT INTO seller "
					+ "(Name, Email, BirthDate, BaseSalary, DepartmentId)"
					+ "VALUES "
					+ "(?, ?, ?, ?, ?)",
					Statement.RETURN_GENERATED_KEYS// placeholders
					);
			st.setString(1, "Carl Blue");
			st.setString(2, "carl@gmail.com");
			st.setDate(3, new java.sql.Date(sdf.parse("22/04/1985").getTime()));
			// fixar uma data para um banco de dados
			st.setDouble(4, 3000.0);
			st.setInt(5, 4);
			*/
			
			st = conn.prepareStatement("INSERT INTO department (Name) values ('D1'),('D2')",
					Statement.RETURN_GENERATED_KEYS
					);
			
			int rowsAffected = st.executeUpdate();
			
			if (rowsAffected > 0) {
				ResultSet rs = st.getGeneratedKeys();
				while(rs.next()) {
					int id = rs.getInt(1);
					System.out.println("Done! Id = " + id);
				}
			} else {
				System.out.println("No rows affected!");
			}
		} 
		catch (SQLException e) {
			e.printStackTrace();
		}
		/*
		catch(ParseException e) {
			e.printStackTrace();
		}
		*/
		finally {
			DB.closeStatement(st);
			DB.closeConnection();
		}
	}

}
