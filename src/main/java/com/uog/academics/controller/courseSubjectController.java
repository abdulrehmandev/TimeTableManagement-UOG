package com.uog.academics.controller;

import com.uog.academics.data.courseSubjectData;
import com.uog.course.CourseSubject;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import java.util.ArrayList;
import java.util.List;

@RestController
@CrossOrigin
@RequestMapping("/coursesubject")
public class courseSubjectController {

    @RequestMapping(method = RequestMethod.GET)
    public List<CourseSubject> get() {
        List<CourseSubject> courseSubject = new ArrayList<>();
        courseSubject = courseSubjectData.getAll();
        return courseSubject;
    }

}
