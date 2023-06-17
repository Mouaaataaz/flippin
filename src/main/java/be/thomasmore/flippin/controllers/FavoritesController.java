package be.thomasmore.flippin.controllers;


import be.thomasmore.flippin.model.Ecommerce;
import be.thomasmore.flippin.repositories.EcommerceRepository;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpSession;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.stereotype.Controller;




import java.util.ArrayList;
import java.util.Optional;



@Controller
public class FavoritesController {

    private Logger logger = LoggerFactory.getLogger(FavoritesController.class);

    @Autowired
    private EcommerceRepository ecommerceRepository;

    @GetMapping("/favorites")
    public String showFavorites(Model model, HttpSession session) {
        ArrayList<Integer> ecommerceIds = (ArrayList<Integer>) session.getAttribute("favoriteEcommerces");
        if (ecommerceIds!=null && !ecommerceIds.isEmpty()) {
            ArrayList<Ecommerce> ecommerces = new ArrayList<>();
            ecommerceIds.forEach(id -> {
                Optional<Ecommerce> optionalEcommerce = ecommerceRepository.findById(id);
                if (optionalEcommerce.isPresent()) {
                    ecommerces.add(optionalEcommerce.get());
                }
            });
            model.addAttribute("ecommerces", ecommerces);
        }
        return "favorites";
    }

    @GetMapping({"/addfavoriteecommerce","/addfavoriteecommerce/{id}"})
    public String addFavoriteEcommerce(Model model, HttpSession session, HttpServletRequest request, @PathVariable(required = false) Integer id) {
        logger.info("add " + id + " to favorite ecommerces");
        if (id==null) return "favorites";
        ArrayList<Integer> ecommerceIds = (ArrayList<Integer>) session.getAttribute("favoriteEcommerces");
        if (ecommerceIds==null) ecommerceIds = new ArrayList<>();
        ecommerceIds.add(id);

        request.getSession().setAttribute("favoriteEcommerces", ecommerceIds);
        return "redirect:/favorites";
    }


    @GetMapping("/deletefavorites")
    public String deleteFavorites(HttpServletRequest request) {
        request.getSession().invalidate();
        return "redirect:/favorites";
    }


}
