package br.com.ava.aula6_exercicio_1;

import java.util.Objects;
import java.util.Optional;

public class Usuario {

	private String nome;
	private Optional<String> email;
	private Optional<Integer> idade;

	public Usuario(String nome, Optional<String> email, Optional<Integer> idade) {
		this.nome = nome;
		this.email = email;
		this.idade = idade;
	}

	public void mostrarDetalhes() {
		System.out.println("Nome: " + nome);
		System.out.println("Email: " + email.orElse("Informação não disponível"));
		System.out.println("Idade: " + idade.map(String::valueOf).orElse("Informação não disponível"));
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public Optional<String> getEmail() {
		return email;
	}

	public void setEmail(Optional<String> email) {
		this.email = email;
	}

	public Optional<Integer> getIdade() {
		return idade;
	}

	public void setIdade(Optional<Integer> idade) {
		this.idade = idade;
	}

	@Override
	public int hashCode() {
		return Objects.hash(email, idade, nome);
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Usuario other = (Usuario) obj;
		return Objects.equals(email, other.email) && Objects.equals(idade, other.idade)
				&& Objects.equals(nome, other.nome);
	}

	@Override
	public String toString() {
		return "Usuario [nome=" + nome + ", email=" + email + ", idade=" + idade + "]";
	}
}
