package com.uog.academics.controller;


import com.uog.academics.data.universityData;
import com.uog.academics.model.University;

import java.util.ArrayList;
import java.util.List;

import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

@RestController
@CrossOrigin
@RequestMapping("/university")
public class universityController {

//    @RequestMapping(method = RequestMethod.GET)
//    public List<University> get() {
//        List<University> universities = new ArrayList<>();
//        universities = universityData.getAll();
//        return universities;
//    }


    //Get One method
    @RequestMapping(method = RequestMethod.GET)
    public University get() {
        University universities = new University();
        universities = universityData.getByCode("CS");
        return universities;
    }

}
