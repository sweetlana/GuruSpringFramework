package springboot;


import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;
//import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.ImportResource;

import guru.springframework.di.controllers.GreetingController;

@SpringBootApplication
//@ComponentScan("guru.springframework")
@ImportResource("classpath:/spring/spring-config.xml")
public class DependencyInjectionApplication {

	public static void main(String[] args) {
		ApplicationContext ctx = SpringApplication.run(DependencyInjectionApplication.class, args);
		
		GreetingController controller = (GreetingController) ctx.getBean("greetingController");
		
		controller.sayHello();
	}

}
