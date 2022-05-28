package itc.hoseo.shop.domain;

import lombok.Data;

import java.util.Date;


@Data
public class Board {
    //게시글 식별자
    private Integer seq;
    //게시판 식별자
    private String id;
    //작성자 이름
    private String wrtrName;
    //게시글 비밀번호
    private String password;
    //게시글 제목
    private String title;
    //게시글 내용
    private String ctnt;
    //작성일시
    private Date rgstDttm;
    //삭제여부 N : 삭제안됨 , Y : 삭제됨
    private String delYn;
}
