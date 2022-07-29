package com.example.demo;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.core.env.Environment;

@SpringBootApplication
public class Springbootdemo1Application implements CommandLineRunner {
// In this main method we are doing all the initial steps related
// to the Springboot application
//* Getting a reference of Container
// Creation of object for bean classes
// The classes which are annotated with @Component,
// @Controller,@Service and @Repository
	
	@Autowired
	Environment environment;
	public static void main(String[] args) {
		SpringApplication.run(Springbootdemo1Application.class, args);
		System.out.println("Ok I am ready and application is up!!!!!!");
		
	}

	@Override
	// v-args 
	// run(String s1,String s2);
	// run(String s1);
	// run(String s1, String s2, String s3);
	
	// When all the initial steps required
	// for making the spring application up and running
	// The run method is called
	public void run(String ...args) throws Exception {
		System.out.println("I am the method which will be called and I am inside run");
		System.out.println(environment.getProperty("message"));
		
	}

}
