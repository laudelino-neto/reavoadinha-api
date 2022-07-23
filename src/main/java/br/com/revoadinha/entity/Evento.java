package br.com.revoadinha.entity;

import java.time.LocalDate;
import java.util.List;

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
	
}
