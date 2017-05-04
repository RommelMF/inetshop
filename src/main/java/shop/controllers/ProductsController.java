package shop.controllers;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.ModelAndView;
import shop.models.Product;
import shop.models.impl.StoneSort;
import shop.services.ProductService;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * Created by Home on 20.04.2017.
 */
@Controller
@RequestMapping(value = "/inetshop")
public class ProductsController {

    @Autowired
    private ProductService prService;

    private Map<String, String> map = new HashMap<>();
    {
        map.put("Size","30x25x70");
        map.put("Colour","red");
        map.put("Composition", "gravel");
    }

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
        return new ModelAndView("admin","stone",new StoneSort(map));
    }

    /**
     * This is a test method for check connection
     * @return object ModelAndView
     */
    @RequestMapping(value = "/check-product", method = RequestMethod.POST)
    public ModelAndView checkProduct(@ModelAttribute("stone") StoneSort stone) {
        prService.saveProduct(stone);
        List<Product> list = prService.findAllProducts();
        ModelAndView modelAndView = new ModelAndView();
        modelAndView.setViewName("check-product");
        modelAndView.addObject("list", list);

        return modelAndView;
    }

}
