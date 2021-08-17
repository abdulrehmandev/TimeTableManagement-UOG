package com.uog.academics.data;

import com.uog.academics.model.AcademicsYear;
import com.uog.academics.model.Qualification;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

public class qualificationData {

    public static List<Qualification> getAll () {
        List<Qualification> qualifications = new ArrayList<>();
        String line;

        try {
            try (BufferedReader bReader = new BufferedReader(new FileReader( Qualification.filePath) )) {
                while ( (line = bReader.readLine()) != null ){
                    Qualification qualification = new Qualification();

                    String [] uniRow = line.split(",");

                    qualification.setQUALIFICATION_ID(Long.parseLong(uniRow [0]));
                    qualification.setUNIVERSITY_ID(Long.parseLong(uniRow [1]));
                    qualification.setQUALIFICATION_CODE(uniRow [2]);
                    qualification.setQUALIFICATION_NAME(uniRow [3]);
                    qualification.setQUALIFICATION_DESCRIPTION(uniRow [4]);
                    qualification.setISACTIVE(uniRow [5]);
                    qualification.setMODIFIED_BY(Long.parseLong(uniRow [6]));
                    qualification.setMODIFIED_WHEN(uniRow [7]);
                    qualification.setMODIFIED_WORKSTATION(uniRow [8]);

                    qualifications.add(qualification);
                }
            }
        } catch ( Exception e ) {
            System.out.println("Error Reading Qualification!");
        }

        return qualifications;
    }


    public static Qualification getOne (long QUALIFICATION_ID) {
        Qualification qualification = new Qualification();
        String line;

        try {
            BufferedReader bReader = new BufferedReader(new FileReader(AcademicsYear.filePath));
            while ( (line = bReader.readLine()) != null){
                String [] uniRow = line.split(",");

                if ((Long.parseLong(uniRow[0])) == QUALIFICATION_ID){
                    qualification.setQUALIFICATION_ID(Long.parseLong(uniRow [0]));
                    qualification.setUNIVERSITY_ID(Long.parseLong(uniRow [1]));
                    qualification.setQUALIFICATION_CODE(uniRow [2]);
                    qualification.setQUALIFICATION_NAME(uniRow [3]);
                    qualification.setQUALIFICATION_DESCRIPTION(uniRow [4]);
                    qualification.setISACTIVE(uniRow [5]);
                    qualification.setMODIFIED_BY(Long.parseLong(uniRow [6]));
                    qualification.setMODIFIED_WHEN(uniRow [7]);
                    qualification.setMODIFIED_WORKSTATION(uniRow [8]);
                }
            }
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        }
        return qualification;
    }

}
