package com.revature.assignforce.testing;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

@RunWith(SpringJUnit4ClassRunner.class)
@SpringBootTest
public class ConfigServiceTest {
	@Test
	public void applicationContextTest() {
		com.revature.assignforce.ConfigServiceApplication.main(new String[] {});
	}
}
