package br.com.caelum.jdbc;

import java.sql.Connection;
import java.sql.SQLException;
import java.sql.Statement;

public class TestaRemocao {

	public static void main(String[] args) throws SQLException {
		Connection con = new ConnectionPool().getConnection();
		
		Statement stat = con.createStatement();
		
		stat.execute("delete from produto where id > 3");
		
		int qtd = stat.getUpdateCount();
		
		System.out.println(qtd + " linhas alteradas");
		
	}
}
