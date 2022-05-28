package itc.hoseo.shop.service;

import itc.hoseo.shop.domain.Favorite;
import itc.hoseo.shop.domain.Member;

import java.util.List;

public interface MemberService {
    public boolean join(Member m, Favorite... Favorites);

    /**
     * 가입된 모든 회원 목록을 가져온다
     * @return
     */
    public List<Member> getAllMembers();
}
