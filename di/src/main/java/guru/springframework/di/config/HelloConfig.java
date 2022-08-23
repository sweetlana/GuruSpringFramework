package guru.springframework.di.config;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Profile;

import guru.springframework.di.services.HelloWorldFactory;
import guru.springframework.di.services.HelloWorldService;
import guru.springframework.di.services.HelloWorldServiceEnglishImpl;
import guru.springframework.di.services.HelloWorldServiceSpanishImpl;

@Configuration
public class HelloConfig {
	
	@Bean
	public HelloWorldFactory helloWorldFactory() {
		return new HelloWorldFactory();
	}
	
	@Bean
	@Profile("english")
	public HelloWorldService helloWorldServiceEnglish(HelloWorldFactory factory) {
		return factory.createHelloWorldService("en");
	}
	
	@Bean
	@Profile("spanish")
	public HelloWorldService helloWorldServiceSpanish(HelloWorldFactory factory) {
		return factory.createHelloWorldService("es");
	}

}
