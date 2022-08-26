package guru.springframework.di;

import guru.springframework.di.services.HelloWorldService;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

import static org.junit.Assert.*;

@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration(locations = {"classpath:/spring/helloworld-config.xml", 
		"classpath*:/spring/spanish-hello-world.xml"})
public class SpanishIntegrationTest {

	@Autowired
	HelloWorldService helloWorldService;
	
	@Test
	public void testHelloWorld() {
		String greeting = helloWorldService.getGreeting();
		
		assertEquals("Hola mundo!!!", greeting);
	}

}
