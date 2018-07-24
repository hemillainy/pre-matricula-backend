package com.sistemaprematricula.controllers;

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
@RequestMapping(value = "/curricularComponent")
@CrossOrigin(value = "*")
public class CurricularComponentController {

	@Autowired
	CurricularComponentService curricularComponentService;

	@RequestMapping(value = "/save", method = RequestMethod.POST)
	public CurricularComponent save(@RequestBody CurricularComponent curricularComponent) {
		return this.curricularComponentService.save(curricularComponent);
	}

	@RequestMapping(value = "/{code}", method = RequestMethod.GET)
	public CurricularComponent getCurricularComponent(@PathVariable String code) {
		return this.curricularComponentService.getCurricularComponent(code).get();
	}
	
	@RequestMapping(value="/delete/{code}", method=RequestMethod.DELETE)
	public void deleteCurricularComponent(@PathVariable String code) {
		this.curricularComponentService.deleteCurricularComponent(code);
	}
	
	@RequestMapping(value="updateName/code", method=RequestMethod.PUT)
	public void updateCodeCurricularComponent(@PathVariable String code) {
		this.curricularComponentService.updateCodeCurricularComponent(code);
	}
	
}