package com.spring.todoProject.controller;

import com.spring.todoProject.service.AuntihenticationService;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.*;

@Controller
@SessionAttributes("name")
public class LoginController {

    private AuntihenticationService authenticationService;

    public LoginController(AuntihenticationService authenticationService) {
        this.authenticationService = authenticationService;
    }

    @RequestMapping(value = "login", method = RequestMethod.GET)
    public String gotoLogin(){
        return "login";
    }

    @RequestMapping(value = "login", method = RequestMethod.POST)
    public String gotoWelcome(@RequestParam String name, @RequestParam String password, ModelMap model){

        if (authenticationService.authenticate(name,password)){
            model.put("name", name);
            return "welcome";
        }
        model.put("errorMessage","Invalid UserName or Password. Please try again!");
        return "login";

    }
}
