package carami.todo.service;

import org.springframework.beans.factory.annotation.*;
import org.springframework.stereotype.*;
import org.springframework.transaction.annotation.*;

import carami.todo.dao.*;
import carami.todo.domain.*;

@Service
@Transactional
public class MemberServiceImpl implements MemberService {
	
	@Autowired
	MemberDao memberDao;

    @Override
    @Transactional(readOnly = true)
    public Member get(Long id) {
        return memberDao.selectById(id);
    }

    @Override
    @Transactional(readOnly = false)
    public Member addMember(Member member){
        Long insert = memberDao.insert(member);
        member.setId(insert);
        return member;
    }

    @Override
    public int delete(Long id) {
        return memberDao.delete(id);
    }

    @Override
    public int update(Member member) {
        return memberDao.update(member);
    }

    @Override
    public Member getByEmail(String email) {
        return memberDao.selectByEmail(email);
    }
}
