package be.thomasmore.flippin.controllers;

import be.thomasmore.flippin.model.Marketplace;
import be.thomasmore.flippin.repositories.EcommerceRepository;
import be.thomasmore.flippin.repositories.MarketplaceRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;

import java.util.Optional;



@Controller
public class MarketplaceController {

    @Autowired
    EcommerceRepository ecommerceRepository;

    @Autowired
    MarketplaceRepository marketplaceRepository;

    @GetMapping({"/marketplacelist", "/marketplacelist/{id}"})
    public String marketplacelist(Model model, @PathVariable ( required=false) Integer id) {
        if (id==null) return "marketplacelist";

        Optional<Marketplace> optionalMarketplace = marketplaceRepository.findById(id);

        if (optionalMarketplace.isPresent()) {
            Marketplace marketplace = optionalMarketplace.get();
            model.addAttribute("marketplace", marketplace);
            model.addAttribute("ecommerces",ecommerceRepository.findByMarketplace(marketplace));
        }

        return "marketplacelist";
    }

}
