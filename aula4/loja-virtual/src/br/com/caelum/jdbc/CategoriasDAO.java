package br.com.caelum.jdbc;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

public class CategoriasDAO {

	private final Connection con;

	public CategoriasDAO(Connection con) {
		this.con = con;
	}

	public List<Categoria> lista() throws SQLException {
		List<Categoria> categs = new ArrayList<>();

		String sql = "select * from categoria";
		try (PreparedStatement ps = con.prepareStatement(sql)) {
			ps.execute();

			try (ResultSet rs = ps.getResultSet()) {
				while (rs.next()) {
					Categoria categ = new Categoria(rs.getInt("id"),
							rs.getString("nome"));
					categs.add(categ);
				}
			}
		}

		return categs;
	}

	public List<Categoria> listaComProdutos() throws SQLException {
		List<Categoria> categorias = new ArrayList<>();
		Categoria ultima = null;

		String sql = "select c.id as c_id, c.nome as c_nome, p.id as p_id, p.nome as p_nome"
				+ ", p.descricao as p_descricao from Categoria as c join Produto as p "
				+ "on p.categoria_id = c.id";
		try (PreparedStatement stmt = con.prepareStatement(sql)) {
			stmt.execute();
			try (ResultSet rs = stmt.getResultSet()) {
				while (rs.next()) {

					int id = rs.getInt("c_id");
					String nome = rs.getString("c_nome");

					if (ultima == null || !ultima.getNome().equals(nome)) {
						Categoria categoria = new Categoria(id, nome);
						categorias.add(categoria);
						ultima = categoria;
					}

					Produto prod = new Produto(rs.getString("p_nome"),
							rs.getString("p_descricao"));
					prod.setId(rs.getInt("p_id"));
					ultima.adiciona(prod);
				}
			}
		}
		return categorias;
	}

}
