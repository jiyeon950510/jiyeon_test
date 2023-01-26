package shop.mtcoding.test.controller;

import java.security.Principal;

import javax.servlet.http.HttpSession;
import javax.websocket.Session;

import org.apache.ibatis.annotations.Param;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;

import shop.mtcoding.test.model.User;
import shop.mtcoding.test.model.UserRepository;

@Controller
public class UserController {

    @Autowired
    private UserRepository userRepository;
    @Autowired
    private HttpSession session;

    @PostMapping("/update")
    public String update(String password, String email) {
        User principal = (User) session.getAttribute("principal");
        int result = userRepository.update(principal.getId(), password, email);
        if (result == 1) {
            return "redirect:/loginForm";
        } else {
            return "update";
        }
    }

    @GetMapping("/updateForm")
    public String updateForm() {
        return "user/updateForm";
    }

    @GetMapping("/logout")
    public String logout() {
        session.invalidate();
        return "redirect:/";
    }

    @PostMapping("/login")
    public String login(String username, String password) {
        User user = userRepository.findByUsernameAndPassword(username, password);
        if (user == null) {
            System.out.println("디버그 :");
            return "redirect:/notfound";
        }
        session.setAttribute("principal", user);
        return "redirect:/list";

    }

    @GetMapping("/")
    public String loginForm() {
        return "user/loginForm";
    }

    @PostMapping("/join")
    public String join(String username, String password, String email) {
        int result = userRepository.insert(username, password, email);
        if (result == 1) {
            return "redirect:/";
        } else {
            return "redirect:/joinForm";
        }
    }

    @GetMapping("/joinForm")
    public String joinForm() {
        return "user/joinForm";
    }
}
