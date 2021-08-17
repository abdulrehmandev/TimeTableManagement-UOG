package com.uog.academics.data;

import com.uog.academics.model.AcademicsYear;
import com.uog.academics.model.Intake;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

public class intakeData {

    public static List<Intake> getAll () {
        List<Intake> intakes = new ArrayList<>();
        String line;

        try {
            try (BufferedReader bReader = new BufferedReader(new FileReader( Intake.filePath) )) {
                while ( (line = bReader.readLine()) != null ){
                    Intake intake = new Intake();

                    String [] uniRow = line.split(",");

                    intake.setINTAKE_ID(Long.parseLong(uniRow [0]));
                    intake.setACADEMICSYEAR_ID(Long.parseLong(uniRow [1]));
                    intake.setINTAKE_DESC(uniRow [2]);
                    intake.setISADMISSIONOPEN(uniRow [3]);
                    intake.setISACTIVE(uniRow [4]);
                    intake.setMODIFIED_BY(Long.parseLong(uniRow [5]));
                    intake.setMODIFIED_WHEN(uniRow [6]);
                    intake.setMODIFIED_WORKSTATION(uniRow [7]);

                    intakes.add(intake);
                }
            }
        } catch ( Exception e ) {
            System.out.println("Error Reading Intake!");
        }

        return intakes;
    }


    public static Intake getOne (long INTAKE_ID) {
        Intake intake = new Intake();
        String line;

        try {
            BufferedReader bReader = new BufferedReader(new FileReader(Intake.filePath));
            while ( (line = bReader.readLine()) != null){
                String [] uniRow = line.split(",");

                if ((Long.parseLong(uniRow[0])) == INTAKE_ID){
                    intake.setINTAKE_ID(Long.parseLong(uniRow [0]));
                    intake.setACADEMICSYEAR_ID(Long.parseLong(uniRow [1]));
                    intake.setINTAKE_DESC(uniRow [2]);
                    intake.setISADMISSIONOPEN(uniRow [3]);
                    intake.setISACTIVE(uniRow [4]);
                    intake.setMODIFIED_BY(Long.parseLong(uniRow [5]));
                    intake.setMODIFIED_WHEN(uniRow [6]);
                    intake.setMODIFIED_WORKSTATION(uniRow [7]);
                }
            }
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        }
        return intake;
    }

}
