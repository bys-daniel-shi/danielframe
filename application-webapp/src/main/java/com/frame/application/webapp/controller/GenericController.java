package com.frame.application.webapp.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.frame.application.domain.service.IGenericService;

@RestController
public class GenericController {

	@Autowired
	private IGenericService genericService;
	
	@RequestMapping("/hello")
	public String HelloWorld() {
		return genericService.helloWorld();
	}
}
