package com.demo.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;

import com.demo.service.DemoService;
// Controller-----> Service
@Controller
public class DemoController {

	//private DemoService demoService=new DemoServiceImpl();
	@Autowired
	private DemoService demoService;
	public void methodController()
	{
		System.out.println("I am in DemoController");
		demoService.methodService();
	}
}
