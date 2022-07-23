package br.com.revoadinha;

import java.util.List;

import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import br.com.revoadinha.entity.Promoter;

@RestController
@RequestMapping("api")
public class ControllerMock {

	@GetMapping("listar")
	public ResponseEntity<?> listar() {	
		
		//Teste de response
		return ResponseEntity.ok("Salve rapeize");
	}
	
	@GetMapping("eventos")
	public ResponseEntity<?> listarTodosEventos() {
		var eventos = List.of(
				Promoter.mock(),
				Promoter.mock(),
				Promoter.mock(),
				Promoter.mock()
				);
		return ResponseEntity.ok(eventos);
	}
	
}
