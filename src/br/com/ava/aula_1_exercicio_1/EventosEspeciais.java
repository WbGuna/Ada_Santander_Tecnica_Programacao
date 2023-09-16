package br.com.ava.aula_1_exercicio_1;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.LocalTime;

public class EventosEspeciais {

	public static void main(String[] args) {

		EventosEspeciais eventos = new EventosEspeciais();

		System.out.println("Evento 1: " + eventos.evento1(15, 9, 2023));
		System.out.println("Evento 2: " + eventos.evento2(21, 7));
		System.out.println("Evento 3: " + eventos.evento3(15, 9, 2023, 21, 7));
	}

	public LocalDate evento1(int dia, int mes, int ano) {
		return LocalDate.of(ano, mes, dia);
	}

	public LocalTime evento2(int hora, int minuto) {
		return LocalTime.of(hora, minuto);
	}

	public LocalDateTime evento3(int dia, int mes, int ano, int hora, int minuto) {
		return LocalDateTime.of(ano, mes, dia, hora, minuto);
	}

}
