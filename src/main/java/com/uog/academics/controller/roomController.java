package com.uog.academics.controller;

import com.uog.academics.data.buildingData;
import com.uog.academics.model.Building;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import java.util.ArrayList;
import java.util.List;

@RestController
@CrossOrigin
@RequestMapping("/room")
public class roomController {

    @RequestMapping(method = RequestMethod.GET)
    public List<Building> get() {
        List<Building> buildings = new ArrayList<>();
        buildings = buildingData.getAll();
        return buildings;
    }

}
