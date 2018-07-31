package com.sistemaprematricula.controllers;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import com.sistemaprematricula.models.CurricularComponent;
import com.sistemaprematricula.services.CurricularComponentService;

@RestController
@RequestMapping(value = "/api")
@CrossOrigin(value = "*")
public class CurricularComponentController {

	@Autowired
	CurricularComponentService curricularComponentService;

	@RequestMapping(value = "/curricularComponent", method = RequestMethod.GET)
	public List<CurricularComponent> getAll() {
		return this.curricularComponentService.getAll();

	}

	@RequestMapping(value = "/curricularComponent", method = RequestMethod.POST)
	public CurricularComponent save(@RequestBody CurricularComponent curricularComponent) {
		return this.curricularComponentService.save(curricularComponent);
	}

	@RequestMapping(value = "/curricularComponent/{code}", method = RequestMethod.GET)
	public CurricularComponent getCurricularComponent(@PathVariable String code) {
		return this.curricularComponentService.getCurricularComponent(code).get();
	}

	@RequestMapping(value = "/curricularComponent/{id}", method = RequestMethod.DELETE)
	public void deleteCurricularComponent(@PathVariable String code) {
		this.curricularComponentService.deleteCurricularComponent(code);
	}

	@RequestMapping(value = "/curricularComponent/{id}", method = RequestMethod.PUT)
	public void updateCurricularComponent(@PathVariable String code,
			@RequestBody CurricularComponent curricularComponent) {
		this.curricularComponentService.updateCurricularComponent(code, curricularComponent);
	}
}