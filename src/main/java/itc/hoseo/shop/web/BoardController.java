package itc.hoseo.shop.web;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

@Controller
public class BoardController {

    @RequestMapping("board/form")
    public String form(){
        return "board/form";
    }

    @RequestMapping("board/list")
    public String list(){
        return "board/list";
    }

    @RequestMapping("board/detail")
    public String detail(@RequestParam int seq){
        return "board/detail";
    }



}
