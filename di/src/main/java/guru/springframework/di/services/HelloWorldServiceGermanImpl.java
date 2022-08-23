package guru.springframework.di.services;

public class HelloWorldServiceGermanImpl implements HelloWorldService{

	@Override
	public String getGreeting() {
		return "Guten tag";
	}

}
