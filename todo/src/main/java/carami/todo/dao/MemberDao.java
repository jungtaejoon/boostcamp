package carami.todo.dao;

import java.util.*;

import javax.sql.*;

import org.springframework.jdbc.core.*;
import org.springframework.jdbc.core.namedparam.*;
import org.springframework.jdbc.core.simple.*;
import org.springframework.stereotype.*;

import carami.todo.domain.*;

@Repository
public class MemberDao {
	
	private NamedParameterJdbcTemplate jdbc;
	private SimpleJdbcInsert insertAction;
	private RowMapper<Member> rowMapper = BeanPropertyRowMapper.newInstance(Member.class);
	
	public MemberDao(DataSource dataSource) {
		this.jdbc = new NamedParameterJdbcTemplate(dataSource);
		this.insertAction = new SimpleJdbcInsert(dataSource)
				.withTableName("member")
				.usingGeneratedKeyColumns("id");
	}
	
	public Long insert(Member member) {
		SqlParameterSource params = new BeanPropertySqlParameterSource(member);
		return insertAction.executeAndReturnKey(params).longValue();
	}
	
	public Member selectById(long id) {
		Map<String, Object> params = new HashMap<>();
		params.put("id", id);
		return jdbc.queryForObject(MemberSqls.SELECT_BY_ID, params, rowMapper);
	}
}
