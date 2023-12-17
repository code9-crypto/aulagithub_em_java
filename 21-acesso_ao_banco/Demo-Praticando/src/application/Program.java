package application;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.Scanner;

import db.DB;

public class Program {

	public static void main(String[] args) {
		//Preparando o programa para receber dados do usuário
		Scanner sc = new Scanner(System.in);
		
		//Preparando as variáveis para conexão com o banco
		Connection conn = null;
		PreparedStatement st = null;
		Statement stt = null;
		ResultSet rs = null;
		try {
			conn = DB.getConnection();
			//Bloco do insert
			System.out.print("What's the department want do register? ");
			String dpt = sc.next();
			String queryInsert = "insert into department (Name) values (?)";
			st = conn.prepareStatement(queryInsert, Statement.RETURN_GENERATED_KEYS);
			st.setString(1, dpt);			
			int rowsInsert = st.executeUpdate();
			System.out.println("Done! Rows affected in INSERT: " + rowsInsert);
			
			//Bloco do update
			System.out.print("What's the department you want to update? ");
			String dptUpdate = sc.next();
			rs = st.getGeneratedKeys();
			int id = 0;
			while( rs.next() ) {
				id = rs.getInt(1);
			}
			String queryUpdate = "update department set Name = ? where Id = " + id;
			st = conn.prepareStatement(queryUpdate);
			st.setString(1, dptUpdate);
			int rowsUpdate = st.executeUpdate();
			System.out.println("Done! Rows affected in UPDATE: " + rowsUpdate);
			
			//Bloco do delete
			String queryDelete = "delete from department where id = " + id;
			st = conn.prepareStatement(queryDelete);
			int rowsDelete = st.executeUpdate();
			System.out.println("Done! Rows affected in DELETE: " + rowsDelete);
			
			//Bloco do select
			stt = conn.createStatement();
			String querySelect = "select * from department";
			rs = stt.executeQuery(querySelect);
			System.out.println("List of Departments");
			while( rs.next() ) {
				System.out.println(rs.getString("Name"));
			}
			
		}catch(SQLException e) {
			e.printStackTrace();
		}finally {
			DB.closeStatement(st);
			DB.closeStatement(stt);
			DB.closeResultSet(rs);
			DB.closeConnection();
		}
		
	}
}
