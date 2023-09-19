package br.com.ava.aula_2_exercicio_4;

import java.time.ZoneId;
import java.time.ZonedDateTime;
import java.time.format.DateTimeFormatter;

public class TimeZoneConversion {

	public static void main(String[] args) {

		ZonedDateTime now = ZonedDateTime.now();

		ZonedDateTime newYorkTime = now.withZoneSameInstant(ZoneId.of("America/New_York"));
		ZonedDateTime parisTime = now.withZoneSameInstant(ZoneId.of("Europe/Paris"));
		ZonedDateTime tokyoTime = now.withZoneSameInstant(ZoneId.of("Asia/Tokyo"));

		DateTimeFormatter formatter = DateTimeFormatter.ofPattern("dd/MM/yyyy HH:mm:ss z");

		System.out.println("Hora atual: " + formatter.format(now));
		System.out.println("Hora em Nova York: " + formatter.format(newYorkTime));
		System.out.println("Hora em Paris: " + formatter.format(parisTime));
		System.out.println("Hora em Tóquio: " + formatter.format(tokyoTime));
	}
}
