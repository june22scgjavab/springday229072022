package com.demo.repository;

import org.springframework.stereotype.Repository;

@Repository
public class DemoRepositoryImpl implements DemoRepository {

	public void methodRepository() {
		System.out.println("I am method repository");

	}

}
