package guru.springframework.di.services;

public class HelloWorldServicePolishImpl implements HelloWorldService{

	@Override
	public String getGreeting() {
		return "Dzen dobry";
	}

}
