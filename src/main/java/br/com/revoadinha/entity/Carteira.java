package br.com.revoadinha.entity;

import java.util.Random;

import lombok.AccessLevel;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.experimental.FieldDefaults;

@Data
@FieldDefaults(level = AccessLevel.PRIVATE)
@AllArgsConstructor
public class Carteira {
	Double saldo;
	
	public static Carteira mock() {
		return new Carteira((double) new Random().nextInt(3000));
	}
}