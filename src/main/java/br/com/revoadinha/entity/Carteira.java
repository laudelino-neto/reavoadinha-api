package br.com.revoadinha.entity;

import br.com.revoadinha.utils.FakeData;
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
		return new Carteira(FakeData.getFaker().number().randomDouble(2, 40, 300));
	}
}