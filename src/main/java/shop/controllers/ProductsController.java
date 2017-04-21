package shop.controllers;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

/**
 * Created by Home on 20.04.2017.
 */
@Controller
public class ProductsController {
    @RequestMapping(value = "/",method = RequestMethod.GET)
    public String index() {
        return "index";
    }

}
