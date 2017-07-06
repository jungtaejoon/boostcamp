package todo;

import static org.junit.Assert.*;
import static org.hamcrest.CoreMatchers.is;

import org.junit.*;
import org.junit.runner.*;
import org.springframework.beans.factory.annotation.*;
import org.springframework.test.context.*;
import org.springframework.test.context.junit4.*;
import org.springframework.transaction.annotation.*;

import carami.todo.config.*;
import carami.todo.dao.*;
import carami.todo.domain.*;

@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration(classes = RootApplicationContextConfig.class)
@Transactional
public class SpringJdbcTest {
	@Autowired
	MemberDao memberDao;

	@Test
	public void shouldInsertAndSelect() {
		Member member = new Member("강경미", "carami@nate.com", "1234");
		Long memberPk = memberDao.insert(member);

		Member result = memberDao.selectById(memberPk);

		assertThat(result.getName(), is("강경미"));
		assertThat(result.getEmail(), is("carami@nate.com"));
		assertThat(result.getPasswd(), is("1234"));
	}

}
