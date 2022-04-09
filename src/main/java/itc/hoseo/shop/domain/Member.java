package itc.hoseo.shop.domain;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class Member {
    private int seq;
    private String id;
    private String name;
    private String password;
    private String role;
    private String address;
    private String telno;
    private String email;
    private String use_yn;
}
