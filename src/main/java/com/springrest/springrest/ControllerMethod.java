package com.springrest.springrest;

import entity.Course;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

import java.util.List;

@Controller
public class ControllerMethod {

    @Autowired
    private CourseService courseService;

    @GetMapping("/home")
    public String home(Model model)
    {
        System.out.println("This is home URL");
        model.addAttribute("name","Spring Boot");
        model.addAttribute("id",12345);

        return "index";
    }

    @GetMapping("/course")
    public List<Course> getCourse()
    {
        return this.courseService.getCourses();
    }
}
