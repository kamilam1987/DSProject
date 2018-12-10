package ie.gmit.ds.client.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping("/asd")
public class IndexController {

    @GetMapping("/")
    public String index() {
    	System.out.println("asd");
        return "index.html";
    }

}