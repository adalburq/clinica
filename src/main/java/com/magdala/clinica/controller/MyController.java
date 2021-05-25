package com.magdala.clinica.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
//import org.springframework.web.bind.annotation.RestController;

//import java.time.LocalDate;

//@RestController
@Controller
public class MyController {

    //@Value("${application.message}")
    //private String message = "Hi there";

    /*
    @GetMapping("/")
    public String index(Model model) {

        model.addAttribute("now", LocalDate.now());
        model.addAttribute("message", this.message);

        return "index";
    }
    */
    
    
    //@GetMapping(value = "/clinica", produces = MediaType.TEXT_PLAIN_VALUE)
	@RequestMapping
	@ResponseBody
    public String index() {

        return "Wildfly 20 !";
    }
    
    
}
