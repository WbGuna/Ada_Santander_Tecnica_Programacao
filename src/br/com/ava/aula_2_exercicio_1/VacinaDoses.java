package br.com.ava.aula_2_exercicio_1;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.time.format.DateTimeParseException;
import java.util.Scanner;

public class VacinaDoses {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Digite a data da primeira dose no formato dd/MM/yyyy:");
		String dataInicioDasDoses = sc.nextLine();

		DateTimeFormatter formatacao = DateTimeFormatter.ofPattern("dd/MM/yyyy");
		try {			
			LocalDate dataPrimeiraDose = LocalDate.parse(dataInicioDasDoses, formatacao);
			
			LocalDate dataSegundaDose = dataPrimeiraDose.plusMonths(1);
			LocalDate dataTerceiraDose = dataSegundaDose.plusMonths(1);
			
			System.out.println("Primeira dose : " + dataPrimeiraDose.format(formatacao));
			System.out.println("Segunda dose : " + dataSegundaDose.format(formatacao));
			System.out.println("Terceira dose : " + dataTerceiraDose.format(formatacao));
		} catch (DateTimeParseException e) {
			 System.out.println("Formato inválido! Por favor, insira a data no formato dd/MM/yyyy.");
		}
		
		sc.close();
	}
}
