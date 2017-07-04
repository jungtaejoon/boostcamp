package kr.or.connect.dao;

import static org.junit.Assert.*;

import org.junit.*;

import kr.or.connect.dto.*;

public class MemberDaoTest {

	@Test
	public void getMemberTest() {
		MemberDao dao = new MemberDao();
		MemberDto dto = dao.getMember("joon");
		assertNotNull(dto);
		System.out.println(dto);
	}

}
