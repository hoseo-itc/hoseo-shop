package itc.hoseo.shop.repo.imp;

import itc.hoseo.shop.domain.Member;
import itc.hoseo.shop.repo.MemberRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Primary;
import org.springframework.jdbc.core.BeanPropertyRowMapper;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Component;

import java.util.List;

@Component
@Primary
public class DBMemberRepository implements MemberRepository {
    @Autowired
    JdbcTemplate template;

    @Override
    public List<Member> findAll() {
        return template.query("select * from member",
                new BeanPropertyRowMapper<>(Member.class));
    }

    @Override
    public Member findById(String id) {
        return template.queryForObject("select * from member where id = ?",
                new BeanPropertyRowMapper<>(Member.class), id);
    }

    @Override
    public Member save(Member m) {
        return null;
    }
}
