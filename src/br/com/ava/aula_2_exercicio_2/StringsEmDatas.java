package br.com.ava.aula_2_exercicio_2;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;

public class StringsEmDatas {

	public static void main(String[] args) {
		List<String> datasStrings = new ArrayList<>();
		datasStrings.add("2023-08-10");
		datasStrings.add("2022-05-20");
		datasStrings.add("2021-11-30");

		List<LocalDate> datas = new ArrayList<>();
		for (String data : datasStrings) {
			datas.add(LocalDate.parse(data));
		}

		// Imprimir as datas
		for (LocalDate data : datas) {
			System.out.println(data);
		}

	}

}
