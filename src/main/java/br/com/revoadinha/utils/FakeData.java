package br.com.revoadinha.utils;

import com.github.javafaker.Faker;

public class FakeData {

	private static Faker faker;

	public static Faker getFaker() {
		if (faker == null) faker = new Faker();
		return faker;
	}
	
}
