package br.com.ava.aula_4_exercicio_1;

import java.util.Objects;

public class Produto {

	private String nome;
    private String categoria;

    public Produto(String nome, String categoria) {
        this.nome = nome;
        this.categoria = categoria;
    }

    public String getNome() {
        return nome;
    }

    public String getCategoria() {
        return categoria;
    }

	@Override
	public int hashCode() {
		return Objects.hash(categoria, nome);
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
		return Objects.equals(categoria, other.categoria) && Objects.equals(nome, other.nome);
	}

	@Override
	public String toString() {
		return "Produto [nome=" + nome + ", categoria=" + categoria + "]";
	}
}
