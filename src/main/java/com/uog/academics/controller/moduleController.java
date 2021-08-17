package com.uog.academics.controller;

import com.uog.academics.data.moduleData;

import com.uog.course.Module;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import java.util.ArrayList;
import java.util.List;

@RestController
@CrossOrigin
@RequestMapping("/module")
public class moduleController {

    @RequestMapping(method = RequestMethod.GET)
    public List<Module> get() {
        List<Module> modules = new ArrayList<>();
        modules = moduleData.getAll();
        return modules;
    }

}
