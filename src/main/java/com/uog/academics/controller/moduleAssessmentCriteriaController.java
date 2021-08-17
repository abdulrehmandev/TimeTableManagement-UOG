package com.uog.academics.controller;

import com.uog.academics.data.moduleAssessmentCriteriaData;
import com.uog.course.ModuleAssessmentCriteria;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import java.util.ArrayList;
import java.util.List;

@RestController
@CrossOrigin
@RequestMapping("/moduleassessmentcriteria")
public class moduleAssessmentCriteriaController {

    @RequestMapping(method = RequestMethod.GET)
    public List<ModuleAssessmentCriteria> get() {
        List<ModuleAssessmentCriteria> moduleAssessmentCriteria = new ArrayList<>();
        moduleAssessmentCriteria = moduleAssessmentCriteriaData.getAll();
        return moduleAssessmentCriteria;
    }

}
