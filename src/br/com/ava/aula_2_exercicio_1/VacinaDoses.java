package br.com.ava.aula_2_exercicio_1;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.util.Scanner;

public class VacinaDoses {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		System.out.println("Digite a data da primeira dose no formato dd/MM/yyyy:");
		String firstDoseDateInput = scanner.nextLine();

		DateTimeFormatter formatter = DateTimeFormatter.ofPattern("dd/MM/yyyy");
		LocalDate dataPrimeiraDose = LocalDate.parse(firstDoseDateInput, formatter);

		LocalDate dataSegundaDose = dataPrimeiraDose.plusMonths(1);
		LocalDate dataTerceiraDose = dataSegundaDose.plusMonths(1);

		System.out.println("Primeira dose : " + dataPrimeiraDose.format(formatter));
		System.out.println("Segunda dose : " + dataSegundaDose.format(formatter));
		System.out.println("Terceira dose : " + dataTerceiraDose.format(formatter));
		
		scanner.close();
	}
}
