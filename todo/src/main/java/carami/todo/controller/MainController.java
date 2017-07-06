package carami.todo.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;

/**
 * Created by 강경미 on 2017. 6. 3..
 */
@Controller
@RequestMapping("/")
public class MainController {
    @GetMapping
    public String index(Model model){
        return "index";
    }

}