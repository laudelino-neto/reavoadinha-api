package br.com.revoadinha.entity;

import java.util.Random;

import lombok.AccessLevel;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.experimental.FieldDefaults;

@Data
@FieldDefaults(level = AccessLevel.PRIVATE)
@AllArgsConstructor
public class Preferencia {

	String visibilidade, objetivo;

	public static Preferencia mock() {
		switch (new Random().nextInt(4)) {
		case 0:
			return new Preferencia("privado", "aproveitar a festa");
		case 1:
			return new Preferencia("publico", "aproveitar a festa");
		case 2:
			return new Preferencia("privado", "conhecer pessoas");
		default:
			return new Preferencia("publico", "conhecer pessoas");
		}
	}
}
