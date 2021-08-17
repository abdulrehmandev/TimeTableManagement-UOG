package com.uog.academics.data;

import com.uog.academics.model.Semester;
import com.uog.academics.model.SemesterTimeSlot;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

public class semesterTimeSlotData {

    public static List<SemesterTimeSlot> getAll () {
        List<SemesterTimeSlot> timeSlots = new ArrayList<>();
        String line;

        try {
            try (BufferedReader bReader = new BufferedReader(new FileReader( SemesterTimeSlot.filePath) )) {
                while ( (line = bReader.readLine()) != null ){
                    SemesterTimeSlot timeSlot = new SemesterTimeSlot();

                    String [] uniRow = line.split(",");

                    timeSlot.setTIMESLOT_ID(Long.parseLong(uniRow [0]));
                    timeSlot.setCAMPUS_ID(Long.parseLong(uniRow [1]));
                    timeSlot.setSEMESTER_ID(Long.parseLong(uniRow [2]));
                    timeSlot.setWEEKDAY_ID(Long.parseLong(uniRow [3]));
                    timeSlot.setTIMESLOT_START(uniRow [4]);
                    timeSlot.setTIMESLOT_END(uniRow [5]);
                    timeSlot.setISACTIVE(uniRow [6]);
                    timeSlot.setMODIFIED_BY(Long.parseLong(uniRow [7]));
                    timeSlot.setMODIFIED_WHEN(uniRow [8]);
                    timeSlot.setMODIFIED_WORKSTATION(uniRow [9]);

                    timeSlots.add(timeSlot);
                }
            }
        } catch ( Exception e ) {
            System.out.println("Error Reading Rooms!");
        }

        return timeSlots;
    }

    public static SemesterTimeSlot getOne (long SEMESTERTIMESLOT_ID) {
        SemesterTimeSlot timeSlot = new SemesterTimeSlot();
        String line;

        try {
            BufferedReader bReader = new BufferedReader(new FileReader(SemesterTimeSlot.filePath));
            while ( (line = bReader.readLine()) != null){
                String [] uniRow = line.split(",");

                if ((Long.parseLong(uniRow[0])) == SEMESTERTIMESLOT_ID){
                    timeSlot.setTIMESLOT_ID(Long.parseLong(uniRow [0]));
                    timeSlot.setCAMPUS_ID(Long.parseLong(uniRow [1]));
                    timeSlot.setSEMESTER_ID(Long.parseLong(uniRow [2]));
                    timeSlot.setWEEKDAY_ID(Long.parseLong(uniRow [3]));
                    timeSlot.setTIMESLOT_START(uniRow [4]);
                    timeSlot.setTIMESLOT_END(uniRow [5]);
                    timeSlot.setISACTIVE(uniRow [6]);
                    timeSlot.setMODIFIED_BY(Long.parseLong(uniRow [7]));
                    timeSlot.setMODIFIED_WHEN(uniRow [8]);
                    timeSlot.setMODIFIED_WORKSTATION(uniRow [9]);
                }
            }
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        }
        return timeSlot;
    }

}
