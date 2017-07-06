package todo;

import static org.hamcrest.CoreMatchers.*;
import static org.junit.Assert.*;

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
public class TodoJdbcTest {
	@Autowired
	TodoDao todoDao;

	@Test
	public void shouldInsertAndSelect() {
		Todo todo = new Todo("장보기");
		Long todoPk = todoDao.insert(todo);

		Todo result = todoDao.selectById(todoPk);
		System.out.println(result);
		assertThat(result.getTodo(), is("장보기"));
		assertEquals(result.isCompleted(), false);
	}

}
