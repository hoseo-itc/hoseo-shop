package itc.hoseo.shop;

import itc.hoseo.shop.domain.Member;
import itc.hoseo.shop.repo.MemberRepository;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import static org.junit.jupiter.api.Assertions.assertEquals;

@SpringBootTest
class SampleApplicationTests {

    @Autowired
    private MemberRepository memberRepository;

    @Test
    void contextLoads() {
        assertEquals("1q2w3e4r!!",memberRepository.findById("admin").getPassword());

        Member m = new Member();
        m.getPassword().equals("123");


    }

}
