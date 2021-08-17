package com.uog.academics.controller;

import com.uog.academics.data.academicsYearData;
import com.uog.academics.data.intakeData;
import com.uog.academics.model.AcademicsYear;
import com.uog.academics.model.Intake;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import java.util.ArrayList;
import java.util.List;

@RestController
@CrossOrigin
@RequestMapping("/intake")
public class intakeController {

    @RequestMapping(method = RequestMethod.GET)
    public List<Intake> get() {
        List<Intake> intakes = new ArrayList<>();
        intakes = intakeData.getAll();
        return intakes;
    }

}
