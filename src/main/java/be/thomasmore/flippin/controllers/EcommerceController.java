package be.thomasmore.flippin.controllers;


import be.thomasmore.flippin.model.Ecommerce;
import be.thomasmore.flippin.repositories.EcommerceRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;

import java.util.Optional;

@Controller
public class EcommerceController {

    @Autowired
    private EcommerceRepository ecommerceRepository;


    @GetMapping({"/ecommercelist", "/ecommercelist/{something}"})
    public String ecommerceList(Model model) {
        Iterable<Ecommerce> allEcommerce = ecommerceRepository.findAll();
        model.addAttribute("ecommerces", allEcommerce);
        return "ecommercelist";
    }

    @GetMapping({"/ecommercedetails", "/ecommercedetails/{id}"})
    public String ecommerceDetails(Model model, @PathVariable(required = false) Integer id) {
        if (id == null) return "artistdetails";
        Optional<Ecommerce> optionalEcommerce = ecommerceRepository.findById(id);

        if (optionalEcommerce.isPresent()) {
            model.addAttribute("ecommercelisting", optionalEcommerce.get());
        }
        return "ecommercedetails";
    }

}
