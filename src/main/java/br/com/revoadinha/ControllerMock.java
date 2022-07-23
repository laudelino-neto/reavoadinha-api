package br.com.revoadinha;

import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("api")
public class ControllerMock {

	@GetMapping("listar")
	public ResponseEntity<?> listar() {	
		
		//Teste de response
		return ResponseEntity.ok("Salve rapeize");
	}
	
}
