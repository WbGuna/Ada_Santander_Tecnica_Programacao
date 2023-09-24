package br.com.ava.aula_4_exercicio_2;

import java.util.List;
import java.util.Optional;

public class Principal {

	public static void main(String[] args) {
		List<Produto> produtos = List.of(new Produto("Notebook", 2500.0), 
										 new Produto("Camisa", 50.0),
										 new Produto("Smartphone", 1200.0), 
										 new Produto("Tênis", 150.0));

		Optional<Produto> produtoMaisCaro = produtos.stream()
				.max((produto1, produto2) -> produto1.getPreco().compareTo(produto2.getPreco()));

		if (produtoMaisCaro.isPresent()) {
			System.out.println("O produto mais caro é: " + produtoMaisCaro.get().getNome() + " e seu valor é: " + produtoMaisCaro.get().getPreco());
		} else {
			System.out.println("A lista de produtos está vazia.");
		}
	}
}
