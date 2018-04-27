package com.avanticaspring.demo;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

//notacion es como una inyeccion de dependencias
@SpringBootApplication
@RestController

public class DemoApplication {

/*
* /hello -->hello world
* /hello/daniel ---> hello daniel
* /hello/spring ---> I am in the spring couse
*
* */


	@RequestMapping(path = "/hello", method = RequestMethod.GET)
	String home(){
		return "Hello World!!!!!!";
	}

	public static void main(String[] args) {
		SpringApplication.run(DemoApplication.class, args);
	}
}
