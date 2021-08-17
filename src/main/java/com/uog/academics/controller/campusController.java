package com.uog.academics.controller;

import com.uog.academics.model.Campus;
import com.uog.academics.data.campusData;

import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import java.util.ArrayList;
import java.util.List;

@RestController
@CrossOrigin
@RequestMapping("/campus")
public class campusController {

    @RequestMapping(method = RequestMethod.GET)
    public List<Campus> get() {
        List<Campus> campuses = new ArrayList<>();
        campuses = campusData.getAll();
        return campuses;
    }

}
