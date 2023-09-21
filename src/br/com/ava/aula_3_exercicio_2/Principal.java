package br.com.ava.aula_3_exercicio_2;

public class Principal {

	public static void main(String[] args) {
		int num1 = 10;
		int num2 = 5;

		// Soma
		int soma = Calculadora.executar(num1, num2, (Integer a, Integer b) -> {
			return a + b;
		});
		System.out.println("Soma: " + soma);

		// Subtração
		int subtracao = Calculadora.executar(num1, num2, (Integer a, Integer b) -> {
			return a - b;
		});
		System.out.println("Subtração: " + subtracao);

		// Multiplicação
		int multiplicacao = Calculadora.executar(num1, num2, (Integer a, Integer b) -> {
			return a * b;
		});
		System.out.println("Multiplicação: " + multiplicacao);

		// Divisão
		if (num2 != 0) {
			int divisao = Calculadora.executar(num1, num2, (Integer a, Integer b) -> {
				return a / b;
			});
			System.out.println("Divisão: " + divisao);
		} else {
			System.out.println("Não é possível dividir por zero");
		}
	}
}
