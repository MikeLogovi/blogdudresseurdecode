package com.dresseurdecode.blog;

import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import javax.servlet.http.HttpServletRequest;

@Controller
public class MyController {
    @GetMapping("/")
    public String home(@RequestParam String name, ModelMap modelMap){
         modelMap.put("name",name);
         return "hello Boss";
    }
}
