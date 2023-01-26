package shop.mtcoding.test.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;

import shop.mtcoding.test.model.UserRepository;

@Controller
public class UserController {

    @Autowired
    private UserRepository userRepository;

    @GetMapping("")

    @PostMapping("/login")
    public String login() {
        return "redirect:/list";
    }

    @GetMapping("/loginForm")
    public String loginForm() {
        return "loginForm";
    }

    @PostMapping("/join")
    public String join(String username, String password, String email) {
        int result = userRepository.insert(username, password, email);
        if (result == 1) {
            return "redirect:/loginForm";
        } else {
            return "redirect:/joinForm";
        }
    }

    @GetMapping("/joinForm")
    public String joinForm() {
        return "joinForm";
    }
}
