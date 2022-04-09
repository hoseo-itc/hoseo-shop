package itc.hoseo.shop.domain;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.time.LocalDateTime;
import java.util.Date;

@Data
@NoArgsConstructor
@AllArgsConstructor
public class LoginLog {
    private int seq;
    private String id;
    private String ip;
    private String loginStatus;
    private Date loginDttm;
}
