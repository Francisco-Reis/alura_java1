package br.com.caelum.jdbc;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

public class ProdutosDAO {

	private final Connection connection;

	public ProdutosDAO(Connection connection) {
		this.connection = connection;
	}

	public void salva(Produto produto) throws SQLException {

		String sql = "insert into produto (nome, descricao) values (?,?)";
		try (PreparedStatement ps = connection.prepareStatement(sql,
				PreparedStatement.RETURN_GENERATED_KEYS)) {

			ps.setString(1, produto.getNome());
			ps.setString(2, produto.getDescricao());

			ps.execute();

			ResultSet rs = ps.getGeneratedKeys();

			rs.next();
			produto.setId(rs.getInt("id"));
			rs.close();
		}

	}

	public List<Produto> lista() throws SQLException {
		List<Produto> produtos = new ArrayList<>();

		String sql = "select * from produto";
		try (PreparedStatement ps = connection.prepareStatement(sql)) {
			ps.execute();
			transformaEmProdutos(produtos, ps);
		}
		
		return produtos;
	}
	
	public List<Produto> lista(Categoria c) throws SQLException {
		List<Produto> produtos = new ArrayList<>();

		String sql = "select * from produto where categoria_id = ?";
		try (PreparedStatement ps = connection.prepareStatement(sql)) {
			ps.setInt(1, c.getId());
			ps.execute();
			transformaEmProdutos(produtos, ps);
		}
		
		return produtos;
	}

	private void transformaEmProdutos(List<Produto> produtos,
			PreparedStatement ps) throws SQLException {
		ps.execute();
		try(ResultSet rs = ps.getResultSet()) {

			while (rs.next()) {
				Produto prod = new Produto(rs.getString("nome"),
						rs.getString("descricao"));
				prod.setId(rs.getInt("id"));
				produtos.add(prod);
			}
		}
	}
}
