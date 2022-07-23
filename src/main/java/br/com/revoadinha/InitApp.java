package br.com.revoadinha;

import javax.sql.DataSource;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.Bean;

@SpringBootApplication
public class InitApp {

	@Autowired
	private DataSource dataSource;
	
	public static void main(String[] args) {
		SpringApplication.run(InitApp.class, args);
	}

	@Bean
	public CommandLineRunner cml(ApplicationContext ac) {
		return args -> {
			
			//Teste de conexao com banco
			System.out.println(dataSource.getConnection().isClosed());
		};
	}
	
}
