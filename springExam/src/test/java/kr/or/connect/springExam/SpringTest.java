package kr.or.connect.springExam;

import static org.junit.Assert.*;

import org.junit.*;
import org.junit.runner.*;
import org.springframework.beans.factory.annotation.*;
import org.springframework.test.context.*;
import org.springframework.test.context.junit4.*;

import kr.or.connect.springExam.config.*;
import kr.or.connect.springExam.examples.*;

@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration(classes = ApplicationContextConfig.class)
public class SpringTest {

	@Autowired
	private User user;

	@Test
	public void test() {
		System.out.println(user.getName());
		assertEquals("joon", user.getName());

	}

}
