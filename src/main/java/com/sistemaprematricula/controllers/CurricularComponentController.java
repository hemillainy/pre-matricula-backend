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

	@RequestMapping(value = "/curricularComponent/", method = RequestMethod.GET)
	public List<CurricularComponent> getAll() {
		return this.curricularComponentService.getAll();

	}

	@RequestMapping(value = "/curricularComponent/", method = RequestMethod.POST)
	public CurricularComponent save(@RequestBody CurricularComponent curricularComponent) {
		return this.curricularComponentService.save(curricularComponent);
	}

	@RequestMapping(value = "/curricularComponent/{id}", method = RequestMethod.GET)
	public CurricularComponent getCurricularComponent(@PathVariable Long id) {
		return this.curricularComponentService.getCurricularComponent(id).get();
	}

	@RequestMapping(value = "/curricularComponent/{id}", method = RequestMethod.DELETE)
	public void deleteCurricularComponent(@PathVariable Long id) {
		this.curricularComponentService.deleteCurricularComponent(id);
	}

	@RequestMapping(value = "/curricularComponent/{id}", method = RequestMethod.PUT)
	public void updateCurricularComponent(@PathVariable Long id,
			@RequestBody CurricularComponent curricularComponent) {
		this.curricularComponentService.updateCurricularComponent(id, curricularComponent);
	}
}