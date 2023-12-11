package application;

import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.HashMap;
import java.util.Map;

import db.DB;

public class Program {

	public static void main(String[] args) {
		
		Map<Integer, String> mp = new HashMap<>();
		Connection conn = null;
		Statement st = null;
		ResultSet rs = null;
		try {
			//conectando ao banco
			conn = DB.getConnection();
			
			//instanciando o objeto statement
			st = conn.createStatement();
			
			//executando a query com o método executeQuery()
			//E armazenando dentro do objeto ResultSet
			rs = st.executeQuery("select * from department");
			
			//Percorrendo o resultado obtido do banco de dados
			while( rs.next() ) {
				System.out.println(rs.getInt("Id") + ", " + rs.getString("Name"));
				mp.put(rs.getInt("Id"), rs.getString("Name"));
			}
			
			for( Integer key : mp.keySet() ) {
				System.out.println(key + " : " + mp.get(key));
			}
		}catch(SQLException e) {
			e.printStackTrace();
		}finally {
			DB.closeResultSet(rs);
			DB.closeStatement(st);
			DB.getConnection();
		}
		
		
		

	}

}
