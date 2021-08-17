package com.uog.academics.data;

import com.uog.academics.model.Campus;
import com.uog.academics.model.College;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

public class collegeData {

    public static List<College> getAll () {
        List<College> colleges = new ArrayList<>();
        String line;

        try {
            try (BufferedReader bReader = new BufferedReader(new FileReader( College.filePath) )) {
                while ( (line = bReader.readLine()) != null ){
                    College college = new College();

                    String [] uniRow = line.split(",");

                    college.setCOLLEGE_ID(Long.parseLong(uniRow [0]));
                    college.setUNIVERSITY_ID(Long.parseLong(uniRow [1]));
                    college.setCOLLEGETYPE_ID(Long.parseLong(uniRow [2]));
                    college.setCOLLEGE_CODE(uniRow [3]);
                    college.setCOLLEGE_NAME(uniRow [4]);
                    college.setCOLLEGE_DESCRIPTION(uniRow [5]);
                    college.setADDRESS_LINE1(uniRow [6]);
                    college.setADDRESS_LINE2(uniRow [7]);
                    college.setADDRESS_LINE3(uniRow [8]);
                    college.setADDRESS_LINE4(uniRow [9]);
                    college.setADDRESS_LINE5(uniRow [10]);
                    college.setADDRESSCOUNTRY_ID(Integer.parseInt(uniRow [11]));
                    college.setADDRESS_POSTCODE(uniRow [12]);
                    college.setTELEPHONE(uniRow [13]);
                    college.setFAXNO(uniRow [14]);
                    college.setEMAIL(uniRow [15]);
                    college.setISACTIVE(uniRow [16]);
                    college.setMODIFIED_BY(Long.parseLong(uniRow [17]));
                    college.setMODIFIED_WHEN(uniRow [18]);
                    college.setMODIFIED_WORKSTATION(uniRow [19]);

                    colleges.add(college);
                }
            }
        } catch ( Exception e ) {
            System.out.println("Error Reading University!");
        }

        return colleges;
    }

    public static College getOne (long COLLEGE_ID) {
        College college = new College();
        String line;

        try {
            BufferedReader bReader = new BufferedReader(new FileReader(College.filePath));
            while ( (line = bReader.readLine()) != null){
                String [] uniRow = line.split(",");

                if ((Long.parseLong(uniRow[0])) == COLLEGE_ID){
                    college.setCOLLEGE_ID(Long.parseLong(uniRow [0]));
                    college.setUNIVERSITY_ID(Long.parseLong(uniRow [1]));
                    college.setCOLLEGETYPE_ID(Long.parseLong(uniRow [2]));
                    college.setCOLLEGE_CODE(uniRow [3]);
                    college.setCOLLEGE_NAME(uniRow [4]);
                    college.setCOLLEGE_DESCRIPTION(uniRow [5]);
                    college.setADDRESS_LINE1(uniRow [6]);
                    college.setADDRESS_LINE2(uniRow [7]);
                    college.setADDRESS_LINE3(uniRow [8]);
                    college.setADDRESS_LINE4(uniRow [9]);
                    college.setADDRESS_LINE5(uniRow [10]);
                    college.setADDRESSCOUNTRY_ID(Integer.parseInt(uniRow [11]));
                    college.setADDRESS_POSTCODE(uniRow [12]);
                    college.setTELEPHONE(uniRow [13]);
                    college.setFAXNO(uniRow [14]);
                    college.setEMAIL(uniRow [15]);
                    college.setISACTIVE(uniRow [16]);
                    college.setMODIFIED_BY(Long.parseLong(uniRow [17]));
                    college.setMODIFIED_WHEN(uniRow [18]);
                    college.setMODIFIED_WORKSTATION(uniRow [19]);
                }
            }
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        }
        return college;
    }

}
