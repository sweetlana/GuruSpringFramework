package guru.springframework.di.controllers;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;

import guru.springframework.di.services.HelloWorldService;

@Controller
public class GreetingController {
	
	private HelloWorldService helloWorldService;

	@Autowired
	public void setHelloWorldService(HelloWorldService helloWorldService) {
		this.helloWorldService = helloWorldService;
	}



	public String sayHello() {
		
		String greeting = helloWorldService.getGreeting();
		
		System.out.println(greeting);
		
		return greeting;
	}
}
