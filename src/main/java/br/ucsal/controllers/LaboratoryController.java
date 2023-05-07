package br.ucsal.controllers;

import java.util.List;

import org.springframework.beans.BeanUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import br.ucsal.dtos.LaboratoryDto;
import br.ucsal.model.Laboratory;
import br.ucsal.services.LaboratoryService;
import jakarta.validation.Valid;

@RestController
@RequestMapping("/lab")
public class LaboratoryController {

	@Autowired
	private LaboratoryService service;
	
	@GetMapping("/allLab")
	public ResponseEntity<List<Laboratory>> findAll(){
		return ResponseEntity.status(HttpStatus.OK).body(service.findAll());
	}
	
	@PostMapping("/addLab")
	public ResponseEntity<Laboratory> insert(@RequestBody @Valid LaboratoryDto _laboratory){
		Laboratory laboratorio = new Laboratory();
		BeanUtils.copyProperties(_laboratory, laboratorio);
		return ResponseEntity.status(HttpStatus.CREATED).body(service.save(laboratorio));
	}
}
