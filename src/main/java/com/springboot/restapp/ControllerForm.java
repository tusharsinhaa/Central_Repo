package com.springboot.restapp;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;

@Controller
public class ControllerForm {

    @Autowired
    private FormRepo formRepo ;

    @RequestMapping("/contactForm")
    public String UserForm()
    {
        return "UserContactForm";
    }

    @RequestMapping(path = "/formProcess",method = RequestMethod.POST)
    public String postData(@RequestParam("email") String userEmail,
                           @RequestParam("password") String userPassword,
                           Model model)
    {
        FormEntity formEntity = new FormEntity();
        formEntity.setEmail(userEmail);
        formEntity.setPassword(userPassword);
        // Save the data now to the database
        System.out.println("Saving now to the DB................");
        formRepo.save(formEntity);
        System.out.println("Saved now to the DB................");

        model.addAttribute("email",userEmail);
        model.addAttribute("password",userPassword);
        System.out.println("user email " + userEmail);
        System.out.println("user password " + userPassword);

        return "success";
    }
}
