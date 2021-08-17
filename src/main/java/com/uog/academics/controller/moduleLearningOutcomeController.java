package com.uog.academics.controller;

import com.uog.academics.data.moduleLearningOutcomeData;
import com.uog.course.ModuleLearningOutcome;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import java.util.ArrayList;
import java.util.List;

@RestController
@CrossOrigin
@RequestMapping("/modulelearningoutcome")
public class moduleLearningOutcomeController {

    @RequestMapping(method = RequestMethod.GET)
    public List<ModuleLearningOutcome> get() {
        List<ModuleLearningOutcome> moduleLearningOutcomes = new ArrayList<>();
        moduleLearningOutcomes = moduleLearningOutcomeData.getAll();
        return moduleLearningOutcomes;
    }

}
