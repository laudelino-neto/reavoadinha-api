package br.com.revoadinha.utils;

import java.sql.Date;
import java.time.LocalDate;
import java.time.ZoneId;

import org.springframework.stereotype.Component;

@Component
public class DateUtils {
	
	public static LocalDate getRandom() {
		var start = Date.valueOf(LocalDate.of(1997, 1, 1));
		var end = Date.valueOf(LocalDate.of(2003, 12, 31));
		return LocalDate.ofInstant(FakeData.getFaker().date().between(start, end).toInstant(), ZoneId.systemDefault());
	}
	
}
