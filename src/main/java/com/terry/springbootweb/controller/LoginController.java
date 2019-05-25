package com.terry.springbootweb.controller;


import org.springframework.stereotype.Controller;
import org.springframework.util.StringUtils;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;

import javax.servlet.http.HttpSession;
import java.util.Map;

@Controller
public class LoginController {

    @PostMapping(value="/login")
    public String login(@RequestParam("username")String username,
                        @RequestParam("password") String password, Map<String,Object> maps, HttpSession session) {
        if (!StringUtils.isEmpty(username) && "123".equals(password)) {
            session.setAttribute("loginuser", username);
            return "redirect:/main.html";
        } else {
            maps.put("msg", "用户名或者密码错误");
            return "index";
        }
    }
}
