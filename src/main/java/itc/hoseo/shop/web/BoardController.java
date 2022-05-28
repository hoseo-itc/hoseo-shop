package itc.hoseo.shop.web;

import itc.hoseo.shop.domain.Board;
import itc.hoseo.shop.service.BoardService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.validation.BindingResult;
import org.springframework.validation.annotation.Validated;
import org.springframework.web.bind.annotation.*;

@Controller
public class BoardController {
    @Autowired
    private BoardService boardService;

    @RequestMapping(value = "board/form", method = RequestMethod.GET)
    public String form(@ModelAttribute Board board){
        return "board/form";
    }

    @RequestMapping(value = "board/submit", method = RequestMethod.POST)
    public String save(Board board, BindingResult bindingResult){
        boardService.save(board);
        return "redirect:/board/list?id=" + board.getId();
    }

    @RequestMapping("board/list")
    public String list(@RequestParam String id, ModelMap mm) {
        mm.put("list", boardService.findById(id));
        return "board/list";
    }

    //@RequestMapping("board/detail")
    //public String detail(@RequestParam int seq){
    //    return "board/detail";
    //}



}
