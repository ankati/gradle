package com.app.dao;

import org.aspectj.lang.annotation.After;
import org.aspectj.lang.annotation.AfterThrowing;
import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Before;
import org.springframework.stereotype.Component;

@Component
@Aspect
public class RepositoryAspect {

	@AfterThrowing(pointcut = "execution(* com.app.dao..*(..)) || execution(* com.gap.corporate.pem.repository.mongo.PriceGroupRepository..*(..))", throwing = "e")
	public void handleDataAccessExceptions(
			org.springframework.jdbc.BadSqlGrammarException e) {
		System.out.println("vbvvb");
	}

	@Before("execution(* com.app.dao..*(..))")
	public void handleDataAccessExceptio() {
		System.out.println("vbvvb");
	}
	
	@After("execution(* com.app.dao..*(..))")
	public void handleDataAccessExcepti() {
		System.out.println("vbvvb");
	}
}
