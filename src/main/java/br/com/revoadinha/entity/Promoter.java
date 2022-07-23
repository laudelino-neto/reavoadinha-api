package br.com.revoadinha.entity;

import br.com.revoadinha.utils.FakeData;
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
		return new Promoter(FakeData.getFaker().company().name(), FakeData.getFaker().idNumber().ssnValid(), Evento.mock());
	}
}
