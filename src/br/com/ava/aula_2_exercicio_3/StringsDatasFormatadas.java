package br.com.ava.aula_2_exercicio_3;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.util.ArrayList;
import java.util.List;

public class StringsDatasFormatadas {

	public static void main(String[] args) {
		List<LocalDate> datas = new ArrayList<>();
		datas.add(LocalDate.of(2023, 8, 10));
		datas.add(LocalDate.of(2022, 5, 20));
		datas.add(LocalDate.of(2021, 11, 30));

		DateTimeFormatter formatter = DateTimeFormatter.ofPattern("dd/MM/yyyy");
		List<String> datasFormatadas = new ArrayList<>();
		for (LocalDate data : datas) {
			datasFormatadas.add(data.format(formatter));
		}

		// Imprimir as datas formatadas
		for (String data : datasFormatadas) {
			System.out.println(data);
		}
	}

}
