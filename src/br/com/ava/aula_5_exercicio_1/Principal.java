package br.com.ava.aula_5_exercicio_1;

import java.util.Arrays;
import java.util.Comparator;
import java.util.List;

public class Principal {

	public static void main(String[] args) {
		List<Produto> produtos = Arrays.asList(new Produto("Notebook", 2500.0, 10), 
											   new Produto("Impressora", 800.0, 5),
				                               new Produto("Mouse", 50.0, 20), 
				                               new Produto("Teclado", 100.0, 15));


		System.out.println("Estes Produtos tem seus valores acima de R$500,00");
		produtos.stream().filter(produto -> produto.getPreco() > 500)
				.forEach(produto -> System.out.println(produto.getNome()));
		System.out.println();

		System.out.println("Estes são os Produtos disponiveis e seus preços :");
		produtos.stream().map(produto -> produto.getNome() + ": R$ " + produto.getPreco()).forEach(System.out::println);
		System.out.println();
		
		System.out.println("Este é nosso Produto em promoção mais barato! ");
		Produto maisBarato = produtos.stream().min(Comparator.comparing(Produto::getPreco))
				.orElseThrow(IllegalStateException::new);
		System.out.println("Produto mais barato: " + maisBarato.getNome() + " e seu preço é R$ " + maisBarato.getPreco());
		System.out.println();

		System.out.println("Estes são nossos produtos que tem uma quantidade em estoque abaixo de 10 unidades!");
		produtos.stream()
        .filter(produto -> produto.getQuantidade() < 10)
        .forEach(produto -> System.out.println(produto.getNome() + 
        		" - Quantidade disponível: " + produto.getQuantidade()));
	}
}
