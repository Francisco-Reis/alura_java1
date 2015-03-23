package br.com.caelum.jdbc;

import java.sql.SQLException;
import java.util.List;

public class TestaProduto {

	public static void main(String[] args) throws SQLException {
		Produto produto = new Produto("Mesa Azul", "Mesa azul com 4 pés");
		
		ProdutosDAO produtosDAO = new ProdutosDAO(new ConnectionPool().getConnection());
		
		produtosDAO.salva(produto);
		
		System.out.println("Produto salvo. ID: " + produto.getId());
		
		mostraLista(produtosDAO);
		
	}

	private static void mostraLista(ProdutosDAO produtosDAO)
			throws SQLException {
		List<Produto> prods = produtosDAO.lista();
		for (Produto p: prods){
			System.out.println(p);
		}
	}

	
}
