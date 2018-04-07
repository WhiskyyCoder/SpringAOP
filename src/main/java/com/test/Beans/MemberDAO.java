package com.test.Beans;

import org.aspectj.lang.annotation.Aspect;
import org.springframework.stereotype.Component;

@Component("member")
public class MemberDAO implements IPersist{

	public void addData() {
		// TODO Auto-generated method stub
		System.out.println(getClass());
	}

	public void deleteData() {
		// TODO Auto-generated method stub
		
	}

	public void addData(String text) {
		System.out.println("Before add with param" +text);
	}
	
	
}
