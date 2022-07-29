package com.demo.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.demo.component.Validator;
import com.demo.repository.DemoRepository;

@Service
public class DemoServiceImpl implements DemoService {
    
	@Autowired
	private DemoRepository demoRepository;
	
	@Autowired
	private Validator validator;
	
	public void methodService() {
		System.out.println("I am the method of Service");
		validator.validate();
		demoRepository.methodRepository();

	}

}
