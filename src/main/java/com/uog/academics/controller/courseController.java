package com.uog.academics.controller;

import com.uog.academics.data.courseData;
import com.uog.course.Course;

import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import java.util.ArrayList;
import java.util.List;

@RestController
@CrossOrigin
@RequestMapping("/course")
public class courseController {

    @RequestMapping(method = RequestMethod.GET)
    public List<Course> get() {
        List<Course> courses = new ArrayList<>();
        courses = courseData.getAll();
        return courses;
    }

}
