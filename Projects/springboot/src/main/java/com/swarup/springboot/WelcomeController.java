package com.swarup.springboot;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class WelcomeController {
    @RequestMapping("/")

    public String showHome() {
        return "Hello ! This is the first page from Spring Boot !" +
                " VNBP Project: Mridul | Swarup";
    }
}
