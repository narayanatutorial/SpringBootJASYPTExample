package com.narayanatutorial.beans;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

@Component
public class MyBean {

	@Value("${variable.secret-var}")
	private String mySecretVar;
	
	public String printVariable(){
		System.out.println("============================================");
		System.out.format("My secret variable is: %s\n", mySecretVar);
		System.out.println("============================================");
		return mySecretVar;
	}
}
