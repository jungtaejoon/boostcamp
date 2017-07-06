package todo;

import static org.hamcrest.CoreMatchers.*;
import static org.junit.Assert.*;

import org.junit.*;
import org.junit.runner.*;
import org.springframework.beans.factory.annotation.*;
import org.springframework.dao.*;
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
	
	@Test
	public void shouldUpdate() {
		Member member = new Member("강경미", "carami@nate.com", "1234");
		Long memberPk = memberDao.insert(member);
		member.setId(memberPk);
		member.setName("정태준");
		member.setEmail("jungtaejoon@naver.com");
		memberDao.update(member);
		
		Member result = memberDao.selectById(memberPk);
		
		assertThat(result.getName(), is("정태준"));
		assertThat(result.getEmail(), is("jungtaejoon@naver.com"));
	}
	
	
	@Test(expected = EmptyResultDataAccessException.class)
	public void shouldDelete() {
		Member member = new Member("강경미", "carami@nate.com", "1234");
		Long memberPk = memberDao.insert(member);
		memberDao.delete(memberPk);
		
		memberDao.selectById(memberPk);
		
	}

}
