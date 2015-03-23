package br.com.caelum.jdbc;

import java.util.ArrayList;
import java.util.List;

public class Categoria {

	private int id;
	private String nome;

	private final List<Produto> produtos = new ArrayList<>();
	
	public Categoria(int id, String nome) {
		super();
		this.id = id;
		this.nome = nome;
	}
	
	@Override
	public String toString() {
		return "Categoria:" + id + "|" + nome ;
	}

	public int getId() {
		return this.id;
	}

	public String getNome() {
		return this.nome;
	}
	
	public List<Produto> getProdutos() {
		return produtos;
	}
	
	public void adiciona(Produto p){
		this.produtos.add(p);
	}
}
