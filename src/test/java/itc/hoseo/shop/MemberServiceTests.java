package itc.hoseo.shop;

import itc.hoseo.shop.domain.Favorite;
import itc.hoseo.shop.repo.FavoriteRepository;
import itc.hoseo.shop.repo.LoginLogRepository;
import itc.hoseo.shop.repo.MemberRepository;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.ActiveProfiles;

import static org.junit.jupiter.api.Assertions.assertEquals;

@SpringBootTest
@ActiveProfiles("test")
class MemberServiceTests {

    @Autowired
    private FavoriteRepository favoriteRepository;

    @Test
    void contextLoads() {
        Favorite f1 = Favorite.builder()
                .memberSeq(1)
                .name("코인")
                .build();
        favoriteRepository.insert(f1);

        assertEquals(1, favoriteRepository.findByMemberSeq(1).size());


    }

}
