package itc.hoseo.shop.web;

import itc.hoseo.shop.domain.Board;
import itc.hoseo.shop.service.BoardService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.util.StringUtils;
import org.springframework.validation.BindingResult;
import org.springframework.validation.annotation.Validated;
import org.springframework.web.bind.annotation.*;

import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

@Controller
public class BoardController {
    @Autowired
    private BoardService boardService;

    @RequestMapping(value = "board/login", method = RequestMethod.GET)
    public String login(@RequestParam String name, HttpSession session){
        //TODO :: 고양이 XXXX 사진말고 로그인 창으로 이동
        if(StringUtils.hasText(name) == false){
            return "redirect:https://http.cat/400";
        }
        //TODO :: DB에서 값을 가져와서 이름이 아니라 id & pw를 비교해서 맞으면 이름을 세션에 넣음
        session.setAttribute("fulnm", name);
        return "redirect:/board/form";
    }

    @RequestMapping(value = "board/form", method = RequestMethod.GET)
    public String form(@ModelAttribute Board board, HttpServletResponse response, HttpSession session){
        if(session.getAttribute("fulnm") == null){
            response.setStatus(HttpStatus.UNAUTHORIZED.value());
            return "redirect:https://http.cat/401";
        }
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
