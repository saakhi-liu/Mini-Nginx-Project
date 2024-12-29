package com.example.mini_nginx_project;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class HomeController {

    @GetMapping("/proxy")
    public String home() {
        return "proxy/proxy.html";
    }
}
