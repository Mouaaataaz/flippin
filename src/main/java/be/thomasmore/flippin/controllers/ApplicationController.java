package be.thomasmore.flippin.controllers;

import be.thomasmore.flippin.model.Application;
import be.thomasmore.flippin.model.Ecommerce;
import be.thomasmore.flippin.repositories.ApplicationRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;


import java.util.Optional;

@Controller
public class ApplicationController {


    @Autowired
    private ApplicationRepository applicationRepository;

    @GetMapping({"/applicationlist", "/applicationlist/{something}"})
    public String applicationList(Model model) {
        Iterable<Application> allApplication = applicationRepository.findAll();
        model.addAttribute("applications", allApplication);
        return "applicationlist";
    }
}
