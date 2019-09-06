package com.narayanatutorial.SpringBootJASYPTExample;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ConfigurableApplicationContext;
import org.springframework.context.annotation.ComponentScan;



@ComponentScan({ "com.narayanatutorial" })
@SpringBootApplication
public class SpringBootJasyptExampleApplication {

	public static void main(String[] args) {

		SpringApplication.run(SpringBootJasyptExampleApplication.class, args);

	}

}
