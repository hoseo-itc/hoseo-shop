package itc.hoseo.shop.repo;

import itc.hoseo.shop.domain.Member;

import java.util.List;

public interface MemberRepository {
    List<Member> findAll();
    Member findById(String id);
    Member save(Member m);
}
