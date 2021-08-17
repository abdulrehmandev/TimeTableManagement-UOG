package com.uog.academics.controller;

import com.uog.academics.data.qualificationData;
import com.uog.academics.model.Qualification;

import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import java.util.ArrayList;
import java.util.List;

@RestController
@CrossOrigin
@RequestMapping("/qualification")
public class qualificationController {

    @RequestMapping(method = RequestMethod.GET)
    public List<Qualification> get() {
        List<Qualification> qualifications = new ArrayList<>();
        qualifications = qualificationData.getAll();
        return qualifications;
    }

}
