package itc.hoseo.shop.repo.imp;

import itc.hoseo.shop.domain.Board;
import itc.hoseo.shop.repo.BoardRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.BeanPropertyRowMapper;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public class BoardRepositoryImpl implements BoardRepository {
    @Autowired
    JdbcTemplate jdbcTemplate;

    @Override
    public List<Board> findById(String id) {
        return jdbcTemplate.query("select * from board where id = ?", new BeanPropertyRowMapper<>(Board.class), id);
    }

    @Override
    public Board findBySeq(Integer seq) {
        return jdbcTemplate.queryForObject("select * from board where seq = ?",new BeanPropertyRowMapper<>(Board.class), seq);
    }

    @Override
    public boolean update(Board board) {
        return jdbcTemplate.update("update board set title = ? , ctnt = ? , del_yn = ? where seq = ? password = ?",
            board.getTitle(), board.getCtnt(), board.getSeq(), board.getDelYn(), board.getPassword()) == 1;
    }

    @Override
    public boolean insert(Board board) {
        return jdbcTemplate.update("insert into board(id,wrtr_name,password, title, ctnt) values(?,?,?,?,?)",
                board.getId(), board.getWrtrName(), board.getPassword(), board.getTitle(), board.getCtnt()) == 1;
    }
}
