package com.example.studentmanagement.web;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class MainController {
	
	
	  @GetMapping("/")
	    public String home() {
	    	return "index";
	    }
    
    @GetMapping("/login")
    public String login() {
        return "login"; // Adjust to match your view name
    }
    
   

}
