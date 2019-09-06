package com.narayanatutorial.SpringBootJASYPTExample;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.narayanatutorial.beans.MyBean;

@RestController
public class JasypController {

	@Autowired
	MyBean bean;

	@RequestMapping("/getDecryptValue")
	public String getStatus() {
		return bean.printVariable();
	}
}
