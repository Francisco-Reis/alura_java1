package br.com.caelum.jdbc;

import java.sql.Connection;
import java.sql.SQLException;

import javax.sql.DataSource;

import org.hsqldb.jdbc.JDBCPool;

public class ConnectionPool {

	DataSource dataSource;
	
	public ConnectionPool() {
		JDBCPool pool = new JDBCPool();
        pool.setUrl("jdbc:hsqldb:hsql://localhost/loja-virtual");
        pool.setUser("SA");
        pool.setPassword("");
        dataSource = pool;
	}
	
	public Connection getConnection() throws SQLException {
//		return DriverManager.getConnection("jdbc:hsqldb:hsql://localhost/loja-virtual", "SA", "");
		return dataSource.getConnection();
	}

}