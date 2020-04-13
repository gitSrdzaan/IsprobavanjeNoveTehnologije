package srdjan.springboot.helloworld.controller;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HelloWorldContainer {
	
	@RequestMapping(value="/")
	public String hell() {
		return "Hello World";
	}
	
}
