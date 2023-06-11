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

    @GetMapping({"/applicationdetails", "/applicationdetails/{id}"})
    public String applicationDetails(Model model, @PathVariable(required = false) Integer id) {
        if (id == null) return "artistdetails";
        Optional<Application> optionalEcommerce = applicationRepository.findById(id);
        Optional<Application> optionalPrev = applicationRepository.findFirstByIdLessThanOrderByIdDesc(id);
        Optional<Application> optionalNext = applicationRepository.findFirstByIdGreaterThanOrderById(id);

        if (optionalEcommerce.isPresent()) {
            model.addAttribute("applicationlisting", optionalEcommerce.get());
        }
        if (optionalPrev.isPresent()) {
            model.addAttribute("prev", optionalPrev.get().getId());
        } else {
            model.addAttribute("prev", applicationRepository.findFirstByOrderByIdDesc().get().getId());
        }
        if (optionalNext.isPresent()) {
            model.addAttribute("next", optionalNext.get().getId());
        } else {
            model.addAttribute("next", applicationRepository.findFirstByOrderByIdAsc().get().getId());
        }
        return "applicationdetails";
    }

}
