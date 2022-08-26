package guru.springframework.di;

import static org.junit.Assert.*;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.boot.test.SpringApplicationConfiguration;
//import org.springframework.boot.test.context.SpringBootTest;
//import org.springframework.boot.test.SpringApplicationConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;
//import org.springframework.test.context.junit4.SpringRunner;
import org.springframework.test.context.web.WebAppConfiguration;
import org.junit.Test;
import springboot.DependencyInjectionApplication;

@RunWith(SpringJUnit4ClassRunner.class)
@SpringApplicationConfiguration(classes = DependencyInjectionApplication.class)
//@RunWith(SpringRunner.class)
//
//@SpringBootTest(classes = DependencyInjectionApplication.class)
//
//@WebAppConfiguration
public class DependencyInjectionApplicationTests {

	@Test
	public void contextLoads() {
	}

}
