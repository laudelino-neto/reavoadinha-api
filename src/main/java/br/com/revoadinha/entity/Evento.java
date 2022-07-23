package br.com.revoadinha.entity;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;

import br.com.revoadinha.utils.FakeData;
import lombok.AccessLevel;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.experimental.FieldDefaults;

@Data
@FieldDefaults(level = AccessLevel.PRIVATE)
@AllArgsConstructor
public class Evento {

	LocalDate data;
	String nome;
	Local local;
	Integer lotacaoMaxima;
	Boolean requerDocumento;
	String camera;
	List<Participante> participantes;
	
	public static Evento mock() {
		return new Evento(
				LocalDate.now(), 
				FakeData.getFaker().options().option("Festa da uva", "Festa da salsicha"), 
				Local.mock(), 
				FakeData.getFaker().number().numberBetween(100, 400), 
				FakeData.getFaker().bool().bool(),
				"https://v.redd.it/vm3i0kpjkbd91/DASH_360.mp4", 
				gerarParticipantes());
	}
	
	private static List<Participante> gerarParticipantes() {
		var list = new ArrayList<Participante>();
		for (int i = 0; i < FakeData.getFaker().number().numberBetween(30, 100); i++) {
			list.add(Participante.mock());
		}
		return list;
	}
	
}
