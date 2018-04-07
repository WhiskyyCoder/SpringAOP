package com.test.Beans;

import org.aspectj.lang.JoinPoint;
import org.aspectj.lang.annotation.AfterReturning;
import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Before;
import org.aspectj.lang.annotation.Pointcut;
import org.springframework.core.annotation.Order;
import org.springframework.stereotype.Component;


@Component
@Aspect
@Order(1)
public class LogginAscpect {

	//.. -> one to many
	@Before("execution(public void add*(..))")
	//@Before("execution(* add*())")
	public void beforeAdd() {
		System.out.println("Before add*");
	}

	@Pointcut("execution(public void delete*(..))")
	public void getPointcut() {}
	
	//	@Before("getPointcut() || getPointcut()")	
	@Before("getPointcut() ")
	public void beforeDelete() {
		System.out.println("Before del*");
	}	
	
	@AfterReturning(pointcut="getPointcut()",returning="result")
	public void afterDelete(JoinPoint jp,Object result) {
		System.out.println("After del*"+result);
	}
}
