package com.uog.academics.controller;

import com.uog.academics.data.semesterData;
import com.uog.academics.model.Semester;

import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import java.util.ArrayList;
import java.util.List;

@RestController
@CrossOrigin
@RequestMapping("/semester")
public class semesterController {

    @RequestMapping(method = RequestMethod.GET)
    public List<Semester> get() {
        List<Semester> semesters = new ArrayList<>();
        semesters = semesterData.getAll();
        return semesters;
    }

}
