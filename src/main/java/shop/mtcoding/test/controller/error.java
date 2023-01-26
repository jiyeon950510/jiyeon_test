package shop.mtcoding.test.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class error {
    @GetMapping("/notfound")
    public String notfound() {
        return "error/error";
    }
}
