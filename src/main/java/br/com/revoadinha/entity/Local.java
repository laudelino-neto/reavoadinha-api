package br.com.revoadinha.entity;

import java.util.Random;

import lombok.AccessLevel;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.experimental.FieldDefaults;

@Data
@FieldDefaults(level = AccessLevel.PRIVATE)
@AllArgsConstructor
public class Local {
	String nome, localizacao;
	
	public static Local mock() {
		Integer n = new Random().nextInt(4);
		switch (n) {
		case 0:
			return new Local("Hangar", "Rua dos Bobos, numero 0");
		case 1:
		case 2:
			return new Local("BeLiv", "Rua 3, numero 2");
		default:
			return new Local("Black Wood", "Rua 1, numero 666");
		}
	}
}
