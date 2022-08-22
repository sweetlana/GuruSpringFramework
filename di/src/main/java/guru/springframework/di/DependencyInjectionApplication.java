package guru.springframework.di;


import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;

import guru.springframework.di.controllers.GreetingController;

@SpringBootApplication
public class DependencyInjectionApplication {

	public static void main(String[] args) {
		ApplicationContext ctx = SpringApplication.run(DependencyInjectionApplication.class, args);
		
		GreetingController controller = (GreetingController) ctx.getBean("greetingController");
		
		controller.sayHello();
	}

}
