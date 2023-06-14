package be.thomasmore.flippin.controllers;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class HomeController {
    @GetMapping({"/", "/home"})
    public String home() {
        return "home";
    }
    @GetMapping("/about")
    public String about(Model model) {
        return "about";
    }

    @GetMapping("/marketplace")
    public String marketplace(Model model) {
        return "marketplacelist";
    }
}