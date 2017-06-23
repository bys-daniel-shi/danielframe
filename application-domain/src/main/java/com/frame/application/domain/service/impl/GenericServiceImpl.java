package com.frame.application.domain.service.impl;

import org.springframework.stereotype.Repository;

import com.frame.application.domain.service.IGenericService;

@Repository("genericService")
public class GenericServiceImpl implements IGenericService {

	@Override
	public String helloWorld() {
		// TODO Auto-generated method stub
		return "Hello World!";
	}

}
