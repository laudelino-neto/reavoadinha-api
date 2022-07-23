package br.com.revoadinha.entity;

import java.time.LocalDate;
import java.util.List;
import java.util.Random;

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
		switch (new Random().nextInt(4)) {
		case 0:
			return new Evento(LocalDate.now(), "Festa da uva", Local.mock(), new Random().ints(100, 300).findFirst().getAsInt(), true, "link.mp4", List.of(Participante.mock(), Participante.mock(), Participante.mock(), Participante.mock()));
		case 1:
			return new Evento(LocalDate.now(), "Festa da salsicha", Local.mock(), new Random().ints(100, 300).findFirst().getAsInt(), false, "link.mp4", List.of(Participante.mock(), Participante.mock(), Participante.mock(), Participante.mock()));
		case 2:
			return new Evento(LocalDate.now(), "Festinha no meu barraco", Local.mock(), new Random().ints(100, 300).findFirst().getAsInt(), true, "link.mp4", List.of(Participante.mock(), Participante.mock(), Participante.mock(), Participante.mock()));
		default:
			return new Evento(LocalDate.now(), "Show de bola", Local.mock(), new Random().ints(100, 300).findFirst().getAsInt(), false, "link.mp4", List.of(Participante.mock(), Participante.mock(), Participante.mock(), Participante.mock()));
		}
	}
	
}
