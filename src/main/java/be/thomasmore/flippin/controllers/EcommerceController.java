package be.thomasmore.flippin.controllers;


import be.thomasmore.flippin.model.Ecommerce;
import be.thomasmore.flippin.model.Industry;
import be.thomasmore.flippin.repositories.EcommerceRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestParam;

import java.security.Principal;
import java.util.List;
import java.util.Optional;

@Controller
public class EcommerceController {

    @Autowired
    EcommerceRepository ecommerceRepository;


    @GetMapping({"/ecommercelist"})
    public String ecommerceList(Model model) {
        Iterable<Ecommerce> allEcommerce = ecommerceRepository.findAll();
        model.addAttribute("allEcommerce", allEcommerce);
        return "ecommercelist";
    }

    @GetMapping({"/ecommercedetails", "/ecommercedetails/{id}"})
    public String ecommerceDetails(Model model, @PathVariable(required = false) Integer id) {
        if (id == null) return "ecommercedetails";
        Optional<Ecommerce> optionalEcommerce = ecommerceRepository.findById(id);
        Optional<Ecommerce> optionalPrev = ecommerceRepository.findFirstByIdLessThanOrderByIdDesc(id);
        Optional<Ecommerce> optionalNext = ecommerceRepository.findFirstByIdGreaterThanOrderById(id);

        if (optionalEcommerce.isPresent()) {
            Ecommerce e = optionalEcommerce.get();
            model.addAttribute("ecommerce", e);
            model.addAttribute("ecommercelisting", optionalEcommerce.get());
        }
        if (optionalPrev.isPresent()) {
            model.addAttribute("prev", optionalPrev.get().getId());
        } else {
            model.addAttribute("prev", ecommerceRepository.findFirstByOrderByIdDesc().get().getId());
        }
        if (optionalNext.isPresent()) {
            model.addAttribute("next", optionalNext.get().getId());
        } else {
            model.addAttribute("next", ecommerceRepository.findFirstByOrderByIdAsc().get().getId());
        }
        return "ecommercedetails";

    }

    @GetMapping({"/ecommercelist/{filter}"})
    public String allEcommerceWithFilter(Model model, Principal principal,
                                         @RequestParam(required = false) String keyword,
                                         @RequestParam(required = false) Integer minimumPrice,
                                         @RequestParam(required = false) Integer maximumPrice,
                                         @RequestParam(required = false) String type,
                                         @RequestParam(required = false) String profit
                                ) {

        List<Ecommerce> allEcommerce = ecommerceRepository.findByQuery(keyword, minimumPrice,maximumPrice,type, profit);

        model.addAttribute("keyword",keyword);
        model.addAttribute("minimumPrice",minimumPrice);
        model.addAttribute("maximumPrice",maximumPrice);
        model.addAttribute("type",type);
        model.addAttribute("profit",profit);


        model.addAttribute("allEcommerce",allEcommerce);
        model.addAttribute("showFilter",true);

        return "ecommercelist";
    }

}
