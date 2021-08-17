package com.uog.academics.controller;

import com.uog.academics.data.courseModuleData;
import com.uog.course.CourseModule;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import java.util.ArrayList;
import java.util.List;

@RestController
@CrossOrigin
@RequestMapping("/coursemodule")
public class courseModuleController {

    @RequestMapping(method = RequestMethod.GET)
    public List<CourseModule> get() {
        List<CourseModule> courseModules = new ArrayList<>();
        courseModules = courseModuleData.getAll();
        return courseModules;
    }

}
