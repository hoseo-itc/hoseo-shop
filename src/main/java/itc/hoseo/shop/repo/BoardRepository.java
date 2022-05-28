package itc.hoseo.shop.repo;

import itc.hoseo.shop.domain.Board;

import java.util.List;

public interface BoardRepository {
    List<Board> findById(String id); //게시판 id별로 게시글을 찾음
    Board findBySeq(Integer seq); //게시글 고유번호로 게시글을 조회
    boolean update(Board board);
    boolean insert(Board board);
}
