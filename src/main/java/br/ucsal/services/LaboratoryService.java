package br.ucsal.services;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import br.ucsal.model.Laboratory;
import br.ucsal.model.StatusLaboratory;
import br.ucsal.repositories.LaboratoryRepository;

@Service
public class LaboratoryService {

	@Autowired
	private LaboratoryRepository repository;

	public List<Laboratory> findAll() {
		return repository.findAll();
	}

	public Laboratory save(Laboratory _laboratory) {
		_laboratory.setStatus(StatusLaboratory.LIVRE);
		return repository.save(_laboratory);
	}
}
