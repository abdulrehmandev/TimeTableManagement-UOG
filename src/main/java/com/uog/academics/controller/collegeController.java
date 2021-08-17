package com.uog.academics.controller;

import com.uog.academics.data.collegeData;
import com.uog.academics.data.universityData;
import com.uog.academics.model.College;
import com.uog.academics.model.University;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import java.util.ArrayList;
import java.util.List;

@RestController
@CrossOrigin
@RequestMapping("/college")
public class collegeController {

    @RequestMapping(method = RequestMethod.GET)
    public List<College> get() {
        List<College> colleges = new ArrayList<>();
        colleges = collegeData.getAll();
        return colleges;
    }
}