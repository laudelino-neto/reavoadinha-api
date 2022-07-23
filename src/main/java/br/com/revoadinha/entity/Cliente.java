package br.com.revoadinha.entity;

import java.time.LocalDate;

import br.com.revoadinha.utils.DateUtils;
import br.com.revoadinha.utils.FakeData;
import lombok.AccessLevel;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.EqualsAndHashCode;
import lombok.experimental.FieldDefaults;

@Data
@FieldDefaults(level = AccessLevel.PRIVATE)
@AllArgsConstructor
@EqualsAndHashCode(of = "cpf")
public class Cliente {
	String nomeCompleto;
	String cpf;
	Boolean genero;
	LocalDate dataNascimento;
	Carteira carteira;
	
	public static Cliente mock() {
			return new Cliente(
					FakeData.getFaker().name().fullName(), 
					FakeData.getFaker().idNumber().valid(), 
					true, 
					DateUtils.getRandom(),
					Carteira.mock());
	}
	
}
