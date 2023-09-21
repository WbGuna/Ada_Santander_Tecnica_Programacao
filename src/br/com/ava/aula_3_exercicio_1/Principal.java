package br.com.ava.aula_3_exercicio_1;

import java.util.Arrays;
import java.util.List;
import java.util.function.Function;

public class Principal {

	public static double calcular(List<Produto> produtos, Function<Produto, Double> funcao) {
		double total = 0.0;
		for (Produto produto : produtos) {
			total += funcao.apply(produto);
		}
		return total;
	}

	public static void main(String[] args) {
		List<Produto> produtos = Arrays.asList(new Produto(10.00, "cafe"), 
											   new Produto(7.30, "açucar"),
											   new Produto(12.20, "pão de forma"));

		double total = calcular(produtos, (Produto produto) -> {
			return produto.getPreco();
		});
		System.out.println("O preço total dos produtos é: " + total);
	}

}
