package com.uog.academics.controller;

import com.uog.academics.data.semesterTimeSlotData;
import com.uog.academics.model.SemesterTimeSlot;

import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import java.util.ArrayList;
import java.util.List;

@RestController
@CrossOrigin
@RequestMapping("/semestertimeslot")
public class semesterTimeSlotController {

    @RequestMapping(method = RequestMethod.GET)
    public List<SemesterTimeSlot> get() {
        List<SemesterTimeSlot> timeSlots = new ArrayList<>();
        timeSlots = semesterTimeSlotData.getAll();
        return timeSlots;
    }

}
