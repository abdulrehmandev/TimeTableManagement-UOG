package com.uog.academics.controller;

import com.uog.academics.data.departmentData;
import com.uog.academics.model.Department;

import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import java.util.ArrayList;
import java.util.List;

@RestController
@CrossOrigin
@RequestMapping("/department")
public class departmentController {

    @RequestMapping(method = RequestMethod.GET)
    public List<Department> get() {
        List<Department> departments = new ArrayList<>();
        departments = departmentData.getAll();
        return departments;
    }

}
