package br.com.revoadinha;

import java.util.List;
import java.util.Objects;

import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import br.com.revoadinha.entity.Promoter;

@RestController
@RequestMapping("api")
public class ControllerMock {
	
	@CrossOrigin
	@GetMapping("eventos")
	public ResponseEntity<?> listarTodosEventos() {
		var eventos = List.of(
				Promoter.mock(),
				Promoter.mock(),
				Promoter.mock(),
				Promoter.mock(),
				Promoter.mock()
			);
		return ResponseEntity.ok(eventos);
	}
	
	@CrossOrigin
	@GetMapping("login/{login}:{senha}")
	public ResponseEntity<?> login(
			@PathVariable("login")
			String login,
			@PathVariable("senha")
			String senha) {
		
		if (Objects.isNull(login) || Objects.isNull(senha) 
				|| login.isBlank() || senha.isBlank()
				|| login.contains(" ") || senha.contains(" ")) {
			return ResponseEntity.badRequest().build();
		}
		
		System.out.println(login + ":" + senha);
		System.out.println("Logadinho chefe");
		return ResponseEntity.ok().build();
	}
	
}
