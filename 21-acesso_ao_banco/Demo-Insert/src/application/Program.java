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
			/*
			//Preparando o comando SQL insert
			st = conn.prepareStatement(
					"insert into seller"
					+ "(Name, Email, BirthDate, BaseSalary, DepartmentId) "
					+ "value "
					+ "(?, ?, ?, ?, ?)",
					//este comando retorna o id do último valor inserido
					Statement.RETURN_GENERATED_KEYS);
			
			//Substituindo as interrogações pelos valores
			st.setString(1, "Carl Purple");
			st.setString(2, "carl@gmail.com");
			//inserindo no banco dado tipo date
			st.setDate(3, new java.sql.Date(sdf.parse("22/04/1985").getTime()));
			st.setDouble(4, 3000.0);
			st.setInt(5, 4);
			*/
			
			st = conn.prepareStatement("insert into department (Name) values "
					+ "('D1'),('D2')", Statement.RETURN_GENERATED_KEYS);
			
			//Executando o comando com o método executeUpdate()
			//Este método retorna um número inteiro das linhas afetadas
			int rowsAffected = st.executeUpdate();
			
			if( rowsAffected > 0 ) {
				//Este método retorna uma tabela das últimas chaves
				//inseridas
				ResultSet rs = st.getGeneratedKeys();
				while( rs.next() ) {
					int id = rs.getInt(1);
					System.out.println("Done! Id = " + id);
				}
			}else {
				System.out.println("No rows affected!");
			}
		}//Lançando dois tipos de exceções num único catch
		catch(SQLException e) {
			e.printStackTrace();
		}finally {
			DB.closeStatement(st);
			DB.closeConnection();
		}

	}

}
