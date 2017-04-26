package shop.controllers;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.ModelAndView;
import shop.models.impl.StoneSort;

/**
 * Created by Home on 20.04.2017.
 */
@Controller
@RequestMapping(value = "/inetshop")
public class ProductsController {

    @RequestMapping(value = "/",method = RequestMethod.GET)
    public String index() {
        return "index";
    }

    /**
     * This is a method for add to product
     * @return object ModelAndView
     */
    @RequestMapping(value = "/admin", method = RequestMethod.GET)
    public ModelAndView mainAdmin() {
        return new ModelAndView("admin","stone",new StoneSort());
    }

    /**
     * This is a test method for check connection
     * @return object ModelAndView
     */
    @RequestMapping(value = "/check-product", method = RequestMethod.POST)
    public ModelAndView checkProduct(@ModelAttribute("stone") StoneSort stone) {
        ModelAndView modelAndView = new ModelAndView();

        modelAndView.setViewName("check-product");
        modelAndView.addObject("stone", stone);

        return modelAndView;
    }
//    TODO append fields(characteristics) in admin.jsp

}
