package com.uog.academics.data;

import com.uog.academics.model.AcademicsYear;
import com.uog.academics.model.Building;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

public class academicsYearData {

    public static List<AcademicsYear> getAll () {
        List<AcademicsYear> academicsYears = new ArrayList<>();
        String line;

        try {
            try (BufferedReader bReader = new BufferedReader(new FileReader( AcademicsYear.filePath) )) {
                while ( (line = bReader.readLine()) != null ){
                    AcademicsYear academicsYear = new AcademicsYear();

                    String [] uniRow = line.split(",");

                    academicsYear.setACADEMICSYEAR_ID(Long.parseLong(uniRow [0]));
                    academicsYear.setUNIVERSITY_ID(Long.parseLong(uniRow [1]));
                    academicsYear.setACADEMICSYEAR_DESC(uniRow [2]);
                    academicsYear.setACADEMICSYEAR_STARTDATE(uniRow [3]);
                    academicsYear.setACADEMICSYEAR_ENDDATE(uniRow [4]);
                    academicsYear.setISACTIVE(uniRow [5]);
                    academicsYear.setMODIFIED_BY(Long.parseLong(uniRow [6]));
                    academicsYear.setMODIFIED_WHEN(uniRow [7]);
                    academicsYear.setMODIFIED_WORKSTATION(uniRow [8]);

                    academicsYears.add(academicsYear);
                }
            }
        } catch ( Exception e ) {
            System.out.println("Error Reading University!");
        }

        return academicsYears;
    }


    public static AcademicsYear getOne (long ACADEMICSYEAR_ID) {
        AcademicsYear academicsYear = new AcademicsYear();
        String line;

        try {
            BufferedReader bReader = new BufferedReader(new FileReader(AcademicsYear.filePath));
            while ( (line = bReader.readLine()) != null){
                String [] uniRow = line.split(",");

                if ((Long.parseLong(uniRow[0])) == ACADEMICSYEAR_ID){
                    academicsYear.setACADEMICSYEAR_ID(Long.parseLong(uniRow [0]));
                    academicsYear.setUNIVERSITY_ID(Long.parseLong(uniRow [1]));
                    academicsYear.setACADEMICSYEAR_DESC(uniRow [2]);
                    academicsYear.setACADEMICSYEAR_STARTDATE(uniRow [3]);
                    academicsYear.setACADEMICSYEAR_ENDDATE(uniRow [4]);
                    academicsYear.setISACTIVE(uniRow [5]);
                    academicsYear.setMODIFIED_BY(Long.parseLong(uniRow [6]));
                    academicsYear.setMODIFIED_WHEN(uniRow [7]);
                    academicsYear.setMODIFIED_WORKSTATION(uniRow [8]);
                }
            }
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        }
        return academicsYear;
    }
}
