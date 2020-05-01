package com.shippingservice.demo.helloapp.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HelloController {

	@GetMapping(value = "/getHi")
	public String sayHello() {
		return "Hi Mate, Welcome to world of Microservices";
	}

	@GetMapping(value = "/getHi/{name}")
	public String sayHello(@PathVariable(value = "name") String name) {
		return "Hi " + name + ", Welcome to world of Microservices";
	}

}
