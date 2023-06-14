package be.thomasmore.flippin.controllers;

import be.thomasmore.flippin.model.Ecommerce;
import be.thomasmore.flippin.model.Industry;
import be.thomasmore.flippin.repositories.IndustryRepository;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestParam;

import java.util.List;
import java.util.Optional;

@Controller
public class IndustryController {

    private Logger logger = LoggerFactory.getLogger(IndustryController.class);
    @Autowired
    private IndustryRepository industryRepository;
    @GetMapping({"/industrylist", "/industrylist/{something}"})
    public String industryList(Model model) {
        Iterable<Industry> allIndustry = industryRepository.findAll();
        model.addAttribute("industries", allIndustry);
        return "industrylist";
    }

    @GetMapping({"/industrydetails", "/industrydetails/{id}"})
    public String industryDetails(Model model, @PathVariable(required = false) Integer id) {
        if (id == null) return "industrydetails";
        Optional<Industry> optionalIndustry = industryRepository.findById(id);
        Optional<Industry> optionalPrev = industryRepository.findFirstByIdLessThanOrderByIdDesc(id);
        Optional<Industry> optionalNext = industryRepository.findFirstByIdGreaterThanOrderById(id);

        if (optionalIndustry.isPresent()) {
            model.addAttribute("industrylisting", optionalIndustry.get());
        }
        if (optionalPrev.isPresent()) {
            model.addAttribute("prev", optionalPrev.get().getId());
        } else {
            model.addAttribute("prev", industryRepository.findFirstByOrderByIdDesc().get().getId());
        }
        if (optionalNext.isPresent()) {
            model.addAttribute("next", optionalNext.get().getId());
        } else {
            model.addAttribute("next", industryRepository.findFirstByOrderByIdAsc().get().getId());
        }
        return "industrydetails";
    }
    @GetMapping("/industrylist/filter")
    public String industryListWithFilter(Model model, @RequestParam(required = false) String keyword) {
        logger.info("industryListWithFilter -- keyword=" + keyword);
        model.addAttribute("keyword", keyword);
        List<Industry> industries = industryRepository.findByKeyword(keyword);
        model.addAttribute("industries", industries);
        model.addAttribute("showFilter", true);
        return "industrylist";
    }

}
