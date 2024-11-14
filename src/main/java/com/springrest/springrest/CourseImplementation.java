package com.springrest.springrest;

import entity.Course;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

@Service
public class CourseImplementation implements CourseService {

    List<Course> list;

    public CourseImplementation() {
        list = new ArrayList<>();
        list.add(new Course(1,"Java","This is Java course"));
        list.add(new Course(2,"C","This is C course"));
    }

    @Override
    public List<Course> getCourses() {
        return list;
    }
}
