package com.test.Beans;

import org.springframework.stereotype.Component;

@Component("car")
public class CarDAO implements IPersist{

	public void addCar() {
		
		
		System.out.println("Added car to database");
	}

	public void addData() {
		// TODO Auto-generated method stub
		
	}

	public void deleteData() {
		// TODO Auto-generated method stub
		
	}
	
}
