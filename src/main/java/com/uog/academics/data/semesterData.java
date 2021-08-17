package com.uog.academics.data;

import com.uog.academics.model.Room;
import com.uog.academics.model.Semester;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

public class semesterData {

    public static List<Semester> getAll () {
        List<Semester> semesters = new ArrayList<>();
        String line;

        try {
            try (BufferedReader bReader = new BufferedReader(new FileReader( Semester.filePath) )) {
                while ( (line = bReader.readLine()) != null ){
                    Semester semester = new Semester();

                    String [] uniRow = line.split(",");

                    semester.setSEMESTER_ID(Long.parseLong(uniRow [0]));
                    semester.setACADEMICSYEAR_ID(Long.parseLong(uniRow [1]));
                    semester.setSEMESTER_DESC(uniRow [2]);
                    semester.setSEMESTER_STARTDATE(uniRow [3]);
                    semester.setSEMESTER_ENDDATE(uniRow [4]);
                    semester.setISACTIVE(uniRow [5]);
                    semester.setMODIFIED_BY(Long.parseLong(uniRow [6]));
                    semester.setMODIFIED_WHEN(uniRow [7]);
                    semester.setMODIFIED_WORKSTATION(uniRow [8]);

                    semesters.add(semester);
                }
            }
        } catch ( Exception e ) {
            System.out.println("Error Reading Rooms!");
        }

        return semesters;
    }

    public static Semester getOne (long SEMESTER_ID) {
        Semester semester = new Semester();
        String line;

        try {
            BufferedReader bReader = new BufferedReader(new FileReader(Semester.filePath));
            while ( (line = bReader.readLine()) != null){
                String [] uniRow = line.split(",");

                if ((Long.parseLong(uniRow[0])) == SEMESTER_ID){
                    semester.setSEMESTER_ID(Long.parseLong(uniRow [0]));
                    semester.setACADEMICSYEAR_ID(Long.parseLong(uniRow [1]));
                    semester.setSEMESTER_DESC(uniRow [2]);
                    semester.setSEMESTER_STARTDATE(uniRow [3]);
                    semester.setSEMESTER_ENDDATE(uniRow [4]);
                    semester.setISACTIVE(uniRow [5]);
                    semester.setMODIFIED_BY(Long.parseLong(uniRow [6]));
                    semester.setMODIFIED_WHEN(uniRow [7]);
                    semester.setMODIFIED_WORKSTATION(uniRow [8]);
                }
            }
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        }
        return semester;
    }

}
