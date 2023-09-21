package br.com.ava.aula_3_exercicio_2;

import java.util.function.BiFunction;

public class Calculadora {

	public static int executar(int num1, int num2, BiFunction<Integer, Integer, Integer> funcao) {
		return funcao.apply(num1, num2);
	}
}
