package com.uog.academics.data;

import com.uog.academics.model.AcademicsYear;
import com.uog.academics.model.IntakeCourse;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

public class intakeCourseData {

    public static List<IntakeCourse> getAll () {
        List<IntakeCourse> intakeCourses = new ArrayList<>();
        String line;

        try {
            try (BufferedReader bReader = new BufferedReader(new FileReader( IntakeCourse.filePath) )) {
                while ( (line = bReader.readLine()) != null ){
                    IntakeCourse intakeCourse = new IntakeCourse();

                    String [] uniRow = line.split(",");

                    intakeCourse.setINTAKECOURSE_ID(Long.parseLong(uniRow [0]));
                    intakeCourse.setINTAKE_ID(Long.parseLong(uniRow [1]));
                    intakeCourse.setCOURSE_ID(Long.parseLong(uniRow [2]));
                    intakeCourse.setCOURSEMODE_ID(Long.parseLong(uniRow [3]));
                    intakeCourse.setCAMPUS_ID(Long.parseLong(uniRow [4]));
                    intakeCourse.setLOCATIONSTUDY_ID(Long.parseLong(uniRow [5]));
                    intakeCourse.setINTAKECOURSE_STARTDATE(uniRow [6]);
                    intakeCourse.setINTAKECOURSE_ENDDATE(uniRow [7]);
                    intakeCourse.setCOURSEFEEPLAN_ID(Long.parseLong(uniRow [8]));
                    intakeCourse.setNET_FEE(Long.parseLong(uniRow [9]));
                    intakeCourse.setGROSS_FEE(Long.parseLong(uniRow [10]));
                    intakeCourse.setSELFFINANCE_FEE(Long.parseLong(uniRow [11]));
                    intakeCourse.setHOURS_PERWEEK(Long.parseLong(uniRow [12]));
                    intakeCourse.setWEEKS_PERYEAR(Long.parseLong(uniRow [13]));
                    intakeCourse.setINTAKESTATUS_ID(Long.parseLong(uniRow [14]));
                    intakeCourse.setAGE_LIMIT(Long.parseLong(uniRow [15]));
                    intakeCourse.setISACTIVE(uniRow [16]);
                    intakeCourse.setMODIFIED_BY(Long.parseLong(uniRow [17]));
                    intakeCourse.setMODIFIED_WHEN(uniRow [18]);
                    intakeCourse.setMODIFIED_WORKSTATION(uniRow [19]);

                    intakeCourses.add(intakeCourse);
                }
            }
        } catch ( Exception e ) {
            System.out.println("Error Reading University!");
        }

        return intakeCourses;
    }


    public static IntakeCourse getOne (long INTAKECOURSE_ID) {
        IntakeCourse intakeCourse = new IntakeCourse();
        String line;

        try {
            BufferedReader bReader = new BufferedReader(new FileReader(IntakeCourse.filePath));
            while ( (line = bReader.readLine()) != null){
                String [] uniRow = line.split(",");

                if ((Long.parseLong(uniRow[0])) == INTAKECOURSE_ID){
                    intakeCourse.setINTAKECOURSE_ID(Long.parseLong(uniRow [0]));
                    intakeCourse.setINTAKE_ID(Long.parseLong(uniRow [1]));
                    intakeCourse.setCOURSE_ID(Long.parseLong(uniRow [2]));
                    intakeCourse.setCOURSEMODE_ID(Long.parseLong(uniRow [3]));
                    intakeCourse.setCAMPUS_ID(Long.parseLong(uniRow [4]));
                    intakeCourse.setLOCATIONSTUDY_ID(Long.parseLong(uniRow [5]));
                    intakeCourse.setINTAKECOURSE_STARTDATE(uniRow [6]);
                    intakeCourse.setINTAKECOURSE_ENDDATE(uniRow [7]);
                    intakeCourse.setCOURSEFEEPLAN_ID(Long.parseLong(uniRow [8]));
                    intakeCourse.setNET_FEE(Long.parseLong(uniRow [9]));
                    intakeCourse.setGROSS_FEE(Long.parseLong(uniRow [10]));
                    intakeCourse.setSELFFINANCE_FEE(Long.parseLong(uniRow [11]));
                    intakeCourse.setHOURS_PERWEEK(Long.parseLong(uniRow [12]));
                    intakeCourse.setWEEKS_PERYEAR(Long.parseLong(uniRow [13]));
                    intakeCourse.setINTAKESTATUS_ID(Long.parseLong(uniRow [14]));
                    intakeCourse.setAGE_LIMIT(Long.parseLong(uniRow [15]));
                    intakeCourse.setISACTIVE(uniRow [16]);
                    intakeCourse.setMODIFIED_BY(Long.parseLong(uniRow [17]));
                    intakeCourse.setMODIFIED_WHEN(uniRow [18]);
                    intakeCourse.setMODIFIED_WORKSTATION(uniRow [19]);
                }
            }
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        }
        return intakeCourse;
    }

}
