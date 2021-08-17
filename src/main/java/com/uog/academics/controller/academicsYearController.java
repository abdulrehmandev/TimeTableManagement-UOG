package com.uog.academics.controller;

import com.uog.academics.data.academicsYearData;
import com.uog.academics.model.AcademicsYear;

import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import java.util.ArrayList;
import java.util.List;

@RestController
@CrossOrigin
@RequestMapping("/academicsyear")
public class academicsYearController {

    @RequestMapping(method = RequestMethod.GET)
    public List<AcademicsYear> get() {
        List<AcademicsYear> academicsYears = new ArrayList<>();
        academicsYears = academicsYearData.getAll();
        return academicsYears;
    }

}
