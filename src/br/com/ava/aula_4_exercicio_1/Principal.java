package br.com.ava.aula_4_exercicio_1;

import java.util.List;
import java.util.stream.Collectors;

public class Principal {

	public static void main(String[] args) {
		List<Produto> produtos = List.of(new Produto("Notebook", "Eletrônicos"), 
										 new Produto("Camisa", "Vestuário"),
										 new Produto("Smartphone", "Eletrônicos"), 
										 new Produto("Tênis", "Calçados"));

		List<Produto> produtosFiltrados = produtos.stream()
				.filter(produto -> produto.getCategoria().equals("Vestuário")).collect(Collectors.toList());

		produtosFiltrados.forEach(produto -> System.out.println(produto.getNome()));
	}
}
