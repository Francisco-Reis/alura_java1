package br.com.caelum.jdbc;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

public class TestaInsercao {

	public static void main(String[] args) throws SQLException {
		try (Connection connection = new ConnectionPool().getConnection()) {
			connection.setAutoCommit(false);

			String sql = "insert into produto (nome, descricao) values (?, ?)";
			try (PreparedStatement statement = connection.prepareStatement(sql,
					Statement.RETURN_GENERATED_KEYS)) {

				adiciona(statement, "TV LCD 32",
						"TV LCD, 32 polegadas, tela plana");
				adiciona(statement, "Blu-ray", "Leitor de blu-rays, Full HDMI");

				connection.commit();
			} catch (Exception e) {
				e.printStackTrace();
				System.out.println("Rollback efetuado");
				connection.rollback();
			}
		}
	}

	private static void adiciona(PreparedStatement statement, String nome,
			String desc) throws SQLException {

		if (nome.equals("Blu-ray")) {
			throw new IllegalArgumentException("Problema ocorrido");
		}

		statement.setString(1, nome);
		statement.setString(2, desc);

		statement.execute();

		try (ResultSet resultSet = statement.getGeneratedKeys()) {

			while (resultSet.next()) {
				System.out.println(resultSet.getString("id"));
			}
		}
	}
}
