package guru.springframework.di;

import static org.junit.Assert.*;
import guru.springframework.di.services.HelloWorldService;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
//import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;
//import org.springframework.test.context.junit4.SpringRunner;

@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration(locations = {"classpath:/spring/helloworld-config.xml", 
		"classpath*:/spring/english-hello-world.xml"})

//@RunWith(SpringRunner.class)
//@SpringBootTest(classes = {"classpath:/spring/helloworld-config.xml", 
//		"classpath*:/spring/english-hello-world.xml"})
public class EnglishIntegrationTest {

	@Autowired
	HelloWorldService helloWorldService;
	
	@Test
	public void testHelloWorld() {
		String greeting = helloWorldService.getGreeting();
		
		assertEquals("Hello World!!!", greeting);
	}

}
