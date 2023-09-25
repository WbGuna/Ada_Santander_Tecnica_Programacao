package br.com.ava.aula_5_exercicio_1;

import java.util.Objects;

public class Produto {

	private String nome;
	private Double preco;
	private Integer quantidade;

	public Produto(String nome, Double preco, Integer quantidade) {
		this.nome = nome;
		this.preco = preco;
		this.quantidade = quantidade;
	}

	public String getNome() {
		return nome;
	}

	public Double getPreco() {
		return preco;
	}

	public Integer getQuantidade() {
		return quantidade;
	}

	@Override
	public int hashCode() {
		return Objects.hash(nome, preco, quantidade);
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Produto other = (Produto) obj;
		return Objects.equals(nome, other.nome) && Objects.equals(preco, other.preco)
				&& Objects.equals(quantidade, other.quantidade);
	}

	@Override
	public String toString() {
		return "Produto [nome=" + nome + ", preco=" + preco + ", quantidade=" + quantidade + "]";
	}
}
