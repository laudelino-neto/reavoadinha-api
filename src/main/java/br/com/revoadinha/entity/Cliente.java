package br.com.revoadinha.entity;

import java.time.LocalDate;
import java.util.Random;

import lombok.AccessLevel;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.experimental.FieldDefaults;

@Data
@FieldDefaults(level = AccessLevel.PRIVATE)
@AllArgsConstructor
public class Cliente {
	String nomeCompleto;
	String cpf;
	Boolean genero;
	LocalDate dataNascimento;
	Carteira carteira;
	
	public static Cliente mock() {
		switch (new Random().nextInt(10)) {
		case 1:
			return new Cliente("Roberto da Silva", "12345678912", true, LocalDate.of(2002, 11, 7), Carteira.mock());
		case 2:
			return new Cliente("Veronica F.", "12345678912", false, LocalDate.of(2001, 10, 6), Carteira.mock());
		case 3:
			return new Cliente("Daniel S.", "12345678912", true, LocalDate.of(2003, 12, 9), Carteira.mock());
		case 4:
			return new Cliente("Luisa Mell", "12345678912", false, LocalDate.of(1993, 10, 31), Carteira.mock());
		case 5:
			return new Cliente("Rodrigo Hilbert", "12345678912", true, LocalDate.of(1998, 8, 23), Carteira.mock());
		case 6:
			return new Cliente("Maristela Roberta", "12345678912", false, LocalDate.of(2002, 6, 21), Carteira.mock());
		case 7:
			return new Cliente("Josefino Andrade", "12345678912", true, LocalDate.of(2001, 4, 12), Carteira.mock());
		case 8:
			return new Cliente("Josefina R.", "12345678912", false, LocalDate.of(1999, 6, 14), Carteira.mock());
		case 9:
			return new Cliente("Laudelino Dev", "12345678912", true, LocalDate.of(1921, 2, 24), Carteira.mock());
		default:
			return new Cliente("Julia D.", "12345678912", false, LocalDate.of(1997, 12, 9), Carteira.mock());
		}
		
	}
}
