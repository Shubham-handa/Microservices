package com.authorizationMicroservice.model;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.meanbean.test.BeanTester;
import org.springframework.boot.test.context.SpringBootTest;

@SpringBootTest
public class UserTest {
	private User user1;
	private User user2;
	

	@BeforeEach
	void setUp() throws Exception {
		
		user1 = new User();
		user2 = new User(1, "admin", "admin");
	}
	
	@Test
    void testPensionerBean() {
        final BeanTester beanTester = new BeanTester();
        beanTester.getFactoryCollection();
        beanTester.testBean(User.class);
    }

}
