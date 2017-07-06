package carami.todo.service;

import carami.todo.domain.*;

public interface MemberService {
    public Member get(Long id);
    public Member addMember(Member member);
    public int delete(Long id);
    public int update(Member member);
    public Member getByEmail(String email);
}
