package shop.controllers;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PathVariable;
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
    @RequestMapping(value = "/admin/add-product", method = RequestMethod.GET)
    public ModelAndView mainAdmin() {
        return new ModelAndView("add-product","stone",new StoneSort(map));
    }

    /**
     * This is a test method for check connection
     * @return object ModelAndView
     */
    @RequestMapping(value = "/admin", method = RequestMethod.GET)
    public ModelAndView checkProduct() {
        List<Product> list = prService.findAllProducts();
        ModelAndView modelAndView = new ModelAndView();
        modelAndView.setViewName("admin");
        modelAndView.addObject("list", list);

        return modelAndView;
    }
    @RequestMapping(value = "/admin/add-product/result", method = RequestMethod.POST)
    public ModelAndView saveProduct(@ModelAttribute("stone") StoneSort sort) {
        boolean result = prService.saveProduct(sort);
        String message = null;
        if(result) {
            message = "Product added";
        }
        return new ModelAndView("result","test",message);
    }

    @RequestMapping(value = "/admin/{id}/delete",method = RequestMethod.GET)
    public ModelAndView deleteProduct(@PathVariable("id") Long id) {
       boolean result = prService.deleteProduct(id);
        String message = null;
        if(result) {
            message = "Product is removed";
        }
        return new ModelAndView("result","test",message);
    }
    @RequestMapping(value = "/admin/{id}/edit", method = RequestMethod.GET)
    public ModelAndView editProduct(@PathVariable("id")Long id) {
        Product stoneSort = prService.findProductById(id);
        return new ModelAndView("edit-product","stone", stoneSort);
    }
    @RequestMapping(value = "/admin/save-product", method = RequestMethod.POST)
    public ModelAndView updateProduct(@ModelAttribute("stone") StoneSort stone) {
        boolean result = prService.updateProduct(stone);
        String message = null;
        if(result) {
            message = "Product is update";
        }
        return new ModelAndView("result","test",message);
    }
}
