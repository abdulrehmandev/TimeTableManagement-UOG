package com.uog.academics.controller;

import com.uog.academics.data.courseBooksData;
import com.uog.course.CourseBooks;

import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import java.util.ArrayList;
import java.util.List;

@RestController
@CrossOrigin
@RequestMapping("/coursebooks")
public class courseBookController {

    @RequestMapping(method = RequestMethod.GET)
    public List<CourseBooks> get() {
        List<CourseBooks> courseBooks = new ArrayList<>();
        courseBooks = courseBooksData.getAll();
        return courseBooks;
    }

}
