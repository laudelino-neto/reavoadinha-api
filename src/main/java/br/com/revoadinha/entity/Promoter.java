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
			return new Promoter("AlgoEventos", "143259843985", Evento.mock());
		case 2:
			return new Promoter("OutraCoisaRevoadas", "98435759843", Evento.mock());
		default:
			return new Promoter("EventosTops", "392847938424", Evento.mock());
		}
	}
}
