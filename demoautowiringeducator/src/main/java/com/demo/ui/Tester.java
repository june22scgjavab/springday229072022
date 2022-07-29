package com.demo.ui;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.core.env.Environment;

import com.demo.config.AppConfig;
import com.demo.controller.DemoController;

public class Tester {

	/*
	 * @Autowired static Environment environment=null;
	 */
	
	public static void main(String[] args) {
	
		ApplicationContext context=new AnnotationConfigApplicationContext(AppConfig.class);
		DemoController controller=context.getBean(DemoController.class);
		Environment  environment=context.getEnvironment();
	    System.out.println(environment.getProperty("GREET"));
		
		controller.methodController();
	}

}
