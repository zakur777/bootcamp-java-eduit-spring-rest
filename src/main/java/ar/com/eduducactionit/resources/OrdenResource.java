package ar.com.eduducactionit.resources;

import java.util.List;

import ar.com.eduducactionit.dto.OrdenRequestDTO;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import ar.com.eduducactionit.entity.Orden;
import ar.com.eduducactionit.service.OrdenService;

import javax.validation.Valid;

@RestController
public class OrdenResource {

	@Autowired
	private OrdenService ordenService;
	
	//GET all
	@GetMapping(value="/orden", produces = "application/json")
	public ResponseEntity<List<Orden>> findAll() {
	
		List<Orden>  ordenes = this.ordenService.findAll();

		return ResponseEntity.ok(ordenes);
	}

	@PostMapping("/orden")
	public ResponseEntity<?> post(
			@Valid @RequestBody OrdenRequestDTO ordenRequestDTO
			) {

		return null;
	}
}
