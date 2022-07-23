package br.com.revoadinha.entity;

import br.com.revoadinha.utils.FakeData;
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
		return new Local(FakeData.getFaker().address().streetName(), FakeData.getFaker().address().buildingNumber());
	}
}
