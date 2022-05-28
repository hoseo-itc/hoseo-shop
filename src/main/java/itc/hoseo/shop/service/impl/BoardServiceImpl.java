package itc.hoseo.shop.service.impl;

import itc.hoseo.shop.domain.Board;
import itc.hoseo.shop.repo.BoardRepository;
import itc.hoseo.shop.service.BoardService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class BoardServiceImpl implements BoardService {
    @Autowired
    private BoardRepository boardRepository;

    @Override
    public List<Board> findById(String id) {
        return boardRepository.findById(id);
    }

    @Override
    public Board findBySeq(Integer seq) {
        return boardRepository.findBySeq(seq);
    }

    @Override
    public boolean save(Board board) {
        if(board.getSeq() == null){
            return boardRepository.insert(board);
        }else{
            return boardRepository.update(board);
        }
    }

    @Override
    public boolean delete(Board board) {
        board.setDelYn("Y");
        return boardRepository.update(board);
    }
}
