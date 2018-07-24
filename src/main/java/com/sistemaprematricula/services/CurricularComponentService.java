package com.sistemaprematricula.services;

import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.sistemaprematricula.models.CurricularComponent;
import com.sistemaprematricula.repositories.CurricularComponentRepository;

@Service
public class CurricularComponentService {
	
	@Autowired
	CurricularComponentRepository curricularComponentRepository;
	
	public CurricularComponent save(CurricularComponent curricularComponent) {
		return this.curricularComponentRepository.save(curricularComponent);
	}

	public Optional<CurricularComponent> getCurricularComponent(String code) {
		return this.curricularComponentRepository.findById(code);
	}

	public void deleteCurricularComponent(String code) {
		this.curricularComponentRepository.deleteById(code);
	}
}
