package br.com.ava.aula6_exercicio_1;

import java.util.Arrays;
import java.util.List;
import java.util.Optional;

public class Principal {

	public static void main(String[] args) {
		Usuario usuario1 = new Usuario("João", Optional.of("joao@email.com"), Optional.of(25));
		Usuario usuario2 = new Usuario("Maria", Optional.empty(), Optional.of(30));
		Usuario usuario3 = new Usuario("Carlos", Optional.of("carlos@email.com"), Optional.empty());
		Usuario usuario4 = new Usuario("Ana", Optional.empty(), Optional.empty());

		List<Usuario> usuarios = Arrays.asList(usuario1, usuario2, usuario3, usuario4);

		for (Usuario usuario : usuarios) {
			usuario.mostrarDetalhes();
			System.out.println("--------------------");
		}
	}
}
