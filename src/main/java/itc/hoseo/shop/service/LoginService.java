package itc.hoseo.shop.service;

import itc.hoseo.shop.domain.Member;
import itc.hoseo.shop.repo.MemberRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
import org.springframework.stereotype.Service;
import org.springframework.util.ObjectUtils;
import org.springframework.util.StringUtils;

@Service
// 1. DB에서 id로 사용자 정보를 가져옴
// 2. pwd 와 일치하는지 확인
// 3. 만약에 일치하지 않는다면 false , 일치하면 true
// 4. 로그인을 시도할떄마다 로그를 남겨야함
// 5. 비밀번호가 5회 틀리면 계정을 잠궈버려야함
public class LoginService {
    @Autowired
    MemberRepository memberRepository;

    /**
     * 해당 id,pwd 가 일치하는지를 확인해주는 서비스
     * @param id
     * @param pwd
     * @return
     */
    public boolean checkPassword (String id, String pwd){
        Member member = memberRepository.findById(id);
        //DB에 사용자가 없거나, 비밀번호가 지정이 안되있거나
        if(ObjectUtils.isEmpty(member) || StringUtils.hasText(member.getPassword()) == false)
            return false;
        return member.getPassword().equals(pwd);
    }
}
