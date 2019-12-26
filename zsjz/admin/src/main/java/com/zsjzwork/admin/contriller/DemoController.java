package com.zsjzwork.admin.contriller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

import java.text.DateFormat;
import java.util.Date;

/**
 * @Author zgq
 * @create 2019/12/26 0026 下午 4:07
 */
@Controller
public class DemoController {
    @RequestMapping("/")
    public String index(Model model){
        model.addAttribute("now", DateFormat.getTimeInstance().format(new Date()));
        return "login";
    }
}
