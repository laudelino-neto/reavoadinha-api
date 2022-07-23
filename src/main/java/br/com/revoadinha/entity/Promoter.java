package br.com.revoadinha.entity;

import java.util.Random;

import lombok.AccessLevel;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.experimental.FieldDefaults;

@Data
@FieldDefaults(level = AccessLevel.PRIVATE)
@AllArgsConstructor
public class Promoter {
	String razaoSocial;
	String cnpj;
	Evento evento;
	
	public static Promoter mock() {
		switch (new Random().nextInt(4)) {
		case 1:
			return new Promoter("AlgoEventos", "143259843985", null);
		default:
			return new Promoter(null, null, null);
		}
	}
}
