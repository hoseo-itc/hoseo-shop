package itc.hoseo.shop.service;

import itc.hoseo.shop.domain.Board;

import java.util.List;

public interface BoardService {
    List<Board> findById(String id); //게시판 id별로 게시글을 찾음
    Board findBySeq(Integer seq); //게시글 고유번호로 게시글을 조회
    boolean save(Board board); //게시글을 추가/수정(seq가 없는 경우 추가, 있는경우 수정)
    boolean delete(Board board); //게시글을 삭제
}
