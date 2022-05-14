package itc.hoseo.shop.service.impl;

import itc.hoseo.shop.domain.Favorite;
import itc.hoseo.shop.domain.Member;
import itc.hoseo.shop.service.MemberService;
import org.springframework.stereotype.Service;

@Service
public class MemberServiceImpl implements MemberService {


    @Override
    public boolean join(Member m, Favorite... Favorites) {
        /**
         * TODO :: 회원가입과 동시에 관심사가 추가되도록 해야함.
         * 단 관심사는 동일한분야가 두개 가질수 없음
         * 만일 동일한 관심사가 두개 들어온 경우 예외가 발생할것이며 기존에 가입되었된 회원 가입 자체도 취소되어야함
         * (취소란 데이터베이스도 롤백 되어야함)
         */
        return false;
    }
}
