package com.uog.academics.data;

import com.uog.academics.model.Campus;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

public class campusData {

    public static List<Campus> getAll () {
        List<Campus> campuses = new ArrayList<>();
        String line;

        try {
            try (BufferedReader bReader = new BufferedReader(new FileReader( Campus.filePath) )) {
                while ( (line = bReader.readLine()) != null ){
                    Campus campus = new Campus();

                    String [] uniRow = line.split(",");

                    campus.setCAMPUS_ID(Long.parseLong(uniRow [0]));
                    campus.setUNIVERSITY_ID(Long.parseLong(uniRow [1]));
                    campus.setCAMPUS_CODE(uniRow [2]);
                    campus.setCAMPUS_NAME(uniRow [3]);
                    campus.setCAMPUS_DESCRIPTION(uniRow [4]);
                    campus.setADDRESS_LINE1(uniRow [5]);
                    campus.setADDRESS_LINE2(uniRow [6]);
                    campus.setADDRESS_LINE3(uniRow [7]);
                    campus.setADDRESS_LINE4(uniRow [8]);
                    campus.setADDRESS_LINE5(uniRow [9]);
                    campus.setADDRESSCOUNTRY_ID(Integer.parseInt(uniRow [10]));
                    campus.setADDRESS_POSTCODE(uniRow [11]);
                    campus.setTELEPHONE(uniRow [12]);
                    campus.setFAXNO(uniRow [13]);
                    campus.setEMAIL(uniRow [14]);
                    campus.setISACTIVE(uniRow [15]);
                    campus.setMODIFIED_BY(Long.parseLong(uniRow [16]));
                    campus.setMODIFIED_WHEN(uniRow [17]);
                    campus.setMODIFIED_WORKSTATION(uniRow [18]);

                    campuses.add(campus);
                }
            }
        } catch ( Exception e ) {
            System.out.println("Error Reading University!");
        }

        return campuses;
    }

    public static Campus getOne (long CAMPUS_ID) {
        Campus campus = new Campus();
        String line;

        try {
            BufferedReader bReader = new BufferedReader(new FileReader(Campus.filePath));
            while ( (line = bReader.readLine()) != null){
                String [] uniRow = line.split(",");

                if ((Long.parseLong(uniRow[0])) == CAMPUS_ID){
                    campus.setCAMPUS_ID(Long.parseLong(uniRow [0]));
                    campus.setUNIVERSITY_ID(Long.parseLong(uniRow [1]));
                    campus.setCAMPUS_CODE(uniRow [2]);
                    campus.setCAMPUS_NAME(uniRow [3]);
                    campus.setCAMPUS_DESCRIPTION(uniRow [4]);
                    campus.setADDRESS_LINE1(uniRow [5]);
                    campus.setADDRESS_LINE2(uniRow [6]);
                    campus.setADDRESS_LINE3(uniRow [7]);
                    campus.setADDRESS_LINE4(uniRow [8]);
                    campus.setADDRESS_LINE5(uniRow [9]);
                    campus.setADDRESSCOUNTRY_ID(Integer.parseInt(uniRow [10]));
                    campus.setADDRESS_POSTCODE(uniRow [11]);
                    campus.setTELEPHONE(uniRow [12]);
                    campus.setFAXNO(uniRow [13]);
                    campus.setEMAIL(uniRow [14]);
                    campus.setISACTIVE(uniRow [15]);
                    campus.setMODIFIED_BY(Long.parseLong(uniRow [16]));
                    campus.setMODIFIED_WHEN(uniRow [17]);
                    campus.setMODIFIED_WORKSTATION(uniRow [18]);
                }
            }
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        }
        return campus;
    }

}
