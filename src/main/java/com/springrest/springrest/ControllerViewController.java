package com.springrest.springrest;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.ui.Model;

@Controller
public class ControllerViewController {

    @Autowired
    private UserRepository userRepository;

    @RequestMapping("/contact")
    public String showForm()
    {
        return "contact";
    }

    @RequestMapping(path = "/processForm",method = RequestMethod.POST)
    public String handleForm(@RequestParam("email") String userEmail,
                             @RequestParam("password") String userPassword,
                             Model model)
    {

        // Save to the database
        User user = new User();
        user.setEmail(userEmail);
        user.setPassword(userPassword);

        // Save the data now to the database
        System.out.println("Saving now to the DB................");
        userRepository.save(user);
        System.out.println("Saved now to the DB................");
        //userRepository.deleteAl-l();
       // userRepository.deleteAll();
        System.out.println("Delete the Saved data from the DB................");

        model.addAttribute("email",userEmail);
        model.addAttribute("password",userPassword);
        System.out.println("user email " + userEmail);
        System.out.println("user password " + userPassword);

        return "success";
    }
}
