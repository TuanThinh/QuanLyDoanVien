package mta.qldv.controller;

import mta.qldv.security.CustomUserDetail;
import mta.qldv.utils.SecurityUtil;
import org.springframework.security.core.GrantedAuthority;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping("/")
public class HomeController {

    @GetMapping
    public String Default(Model model) {
        String role = "";
        CustomUserDetail currentUser = SecurityUtil.getCurrentUser();
        for (GrantedAuthority authority : currentUser.getAuthorities()) {
            role = authority.getAuthority();
        }
        if (role.equals("ROLE_USER")) {
            return "redirect:/user";
        } else if (role.equals("ROLE_DCS")) {
            return "redirect:/user";
        } else if (role.equals("ROLE_DV")) {
            return "redirect:/user";
        } else if (role.equals("ROLE_ADMIN")) {
            return "redirect:/admin";
        }
        return "forward:/403";
    }

    @GetMapping("/home")
    public String Home() {

        return "home";
    }
}
