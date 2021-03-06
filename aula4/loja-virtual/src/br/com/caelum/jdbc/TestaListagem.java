package br.com.caelum.jdbc;

import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

public class TestaListagem {
	public static void main(String[] args) throws SQLException {
		Connection con = new ConnectionPool().getConnection();
		//DriverManager.getConnection("jdbc:hsqldb:hsql://localhost/loja-virtual", "SA", "");
		
		Statement st = con.createStatement();
		st.execute("select * from produto");
		ResultSet rs = st.getResultSet();
		
		while(rs.next()){
			int id = rs.getInt("id");
			String nome = rs.getString("nome");
			String descricao = rs.getString("descricao");
			
			System.out.println(id);
			System.out.println(nome);
			System.out.println(descricao);
		}
		
		rs.close();
		st.close();
		con.close();
	}
}
