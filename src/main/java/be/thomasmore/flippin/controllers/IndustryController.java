package be.thomasmore.flippin.controllers;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class IndustryController {
    @GetMapping( "/industrylist")
    public String industrylist() {
        return "industrylist";
    }
}
