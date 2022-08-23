package guru.springframework.di.config;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Profile;

import guru.springframework.di.services.HelloWorldService;
import guru.springframework.di.services.HelloWorldServiceEnglishImpl;
import guru.springframework.di.services.HelloWorldServiceSpanishImpl;

@Configuration
public class HelloConfig {
	
	@Bean
	@Profile("english")
	public HelloWorldService helloWorldServiceEnglish() {
		return new HelloWorldServiceEnglishImpl();
	}
	
	@Bean
	@Profile("spanish")
	public HelloWorldService helloWorldServiceSpanish() {
		return new HelloWorldServiceSpanishImpl();
	}

}
