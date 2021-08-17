package com.uog.academics.controller;

import com.uog.academics.data.academicsYearData;
import com.uog.academics.data.intakeCourseData;
import com.uog.academics.model.AcademicsYear;
import com.uog.academics.model.IntakeCourse;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import java.util.ArrayList;
import java.util.List;

@RestController
@CrossOrigin
@RequestMapping("/intakecourse")
public class intakeCourseController {

    @RequestMapping(method = RequestMethod.GET)
    public List<IntakeCourse> get() {
        List<IntakeCourse> intakeCourses = new ArrayList<>();
        intakeCourses = intakeCourseData.getAll();
        return intakeCourses;
    }

}
