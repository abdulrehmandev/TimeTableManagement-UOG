package com.uog.academics.data;

import com.uog.academics.model.University;

import java.io.*;
import java.util.ArrayList;
import java.util.List;

public class universityData {

    public static List<University> getAll () {
        List<University> universities = new ArrayList<>();
        String line;

        try {
            try (BufferedReader bReader = new BufferedReader(new FileReader ( University.filePath) )) {
                while ( (line = bReader.readLine()) != null ){
                    University uni = new University();

                    String [] uniRow = line.split(",");

                    uni.setUNIVERSITY_ID(Integer.parseInt(uniRow [0]));
                    uni.setUNIVERSITY_NAME(uniRow [1]);
                    uni.setUNIVERSITY_CODE(uniRow [2]);
                    uni.setUNIVERSITY_DESCRIPTION(uniRow [3]);
                    uni.setADDRESS_LINE1(uniRow [4]);
                    uni.setADDRESS_LINE2(uniRow [5]);
                    uni.setADDRESS_LINE3(uniRow [6]);
                    uni.setADDRESS_LINE4(uniRow [7]);
                    uni.setADDRESS_LINE5(uniRow [8]);
				    uni.setADDRESSCOUNTRY_ID(Integer.parseInt(uniRow [9]));
                    uni.setADDRESS_POSTCODE(uniRow [10]);
                    uni.setTELEPHONE(uniRow [11]);
                    uni.setFAXNO(uniRow [12]);
                    uni.setEMAIL(uniRow [13]);
                    uni.setLOGO_PATH(uniRow [14]);
                    uni.setICON_PATH(uniRow [15]);
                    uni.setISACTIVE(uniRow [16]);
				    uni.setMODIFIED_BY(Integer.parseInt(uniRow [17]));
                    uni.setMODIFIED_WHEN(uniRow [18]);
                    uni.setMODIFIED_WORKSTATION(uniRow [19]);

					if (uniRow.length>5) {
						universityData udata = new universityData();
					}

                    universities.add(uni);
                }
            }

        } catch ( Exception e ) {
            System.out.println("Error Reading University!");
        }

        return universities;
    }

    public static University getOne (long UNIVERSITY_ID) {
        University uni = new University();
        String line;

        try {
            BufferedReader bReader = new BufferedReader(new FileReader(University.filePath));
            while ( (line = bReader.readLine()) != null){
                String [] uniRow = line.split(",");

                if ((Long.parseLong(uniRow[0])) == UNIVERSITY_ID){
                    uni.setUNIVERSITY_ID(Integer.parseInt(uniRow [0]));
                    uni.setUNIVERSITY_NAME(uniRow [1]);
                    uni.setUNIVERSITY_CODE(uniRow [2]);
                    uni.setUNIVERSITY_DESCRIPTION(uniRow [3]);
                    uni.setADDRESS_LINE1(uniRow [4]);
                    uni.setADDRESS_LINE2(uniRow [5]);
                    uni.setADDRESS_LINE3(uniRow [6]);
                    uni.setADDRESS_LINE4(uniRow [7]);
                    uni.setADDRESS_LINE5(uniRow [8]);
                    uni.setADDRESSCOUNTRY_ID(Integer.parseInt(uniRow [9]));
                    uni.setADDRESS_POSTCODE(uniRow [10]);
                    uni.setTELEPHONE(uniRow [11]);
                    uni.setFAXNO(uniRow [12]);
                    uni.setEMAIL(uniRow [13]);
                    uni.setLOGO_PATH(uniRow [14]);
                    uni.setICON_PATH(uniRow [15]);
                    uni.setISACTIVE(uniRow [16]);
                    uni.setMODIFIED_BY(Integer.parseInt(uniRow [17]));
                    uni.setMODIFIED_WHEN(uniRow [18]);
                    uni.setMODIFIED_WORKSTATION(uniRow [19]);
                }
            }
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        }
        return uni;
    }
    public static University getByCode (String code) {
        University uni = new University();
        String line;

        try {
            BufferedReader bReader = new BufferedReader(new FileReader(University.filePath));
            while ( (line = bReader.readLine()) != null){
                String [] uniRow = line.split(",");

                if (uniRow[2] == code){
                    uni.setUNIVERSITY_ID(Integer.parseInt(uniRow [0]));
                    uni.setUNIVERSITY_NAME(uniRow [1]);
                    uni.setUNIVERSITY_CODE(uniRow [2]);
                    uni.setUNIVERSITY_DESCRIPTION(uniRow [3]);
                    uni.setADDRESS_LINE1(uniRow [4]);
                    uni.setADDRESS_LINE2(uniRow [5]);
                    uni.setADDRESS_LINE3(uniRow [6]);
                    uni.setADDRESS_LINE4(uniRow [7]);
                    uni.setADDRESS_LINE5(uniRow [8]);
                    uni.setADDRESSCOUNTRY_ID(Integer.parseInt(uniRow [9]));
                    uni.setADDRESS_POSTCODE(uniRow [10]);
                    uni.setTELEPHONE(uniRow [11]);
                    uni.setFAXNO(uniRow [12]);
                    uni.setEMAIL(uniRow [13]);
                    uni.setLOGO_PATH(uniRow [14]);
                    uni.setICON_PATH(uniRow [15]);
                    uni.setISACTIVE(uniRow [16]);
                    uni.setMODIFIED_BY(Integer.parseInt(uniRow [17]));
                    uni.setMODIFIED_WHEN(uniRow [18]);
                    uni.setMODIFIED_WORKSTATION(uniRow [19]);
                }
            }
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        }
        return uni;
    }

    public static void addOne ( University uni ) {
        try {
            File file = new File(University.filePath);

            FileWriter fWriter = new FileWriter(file);
            fWriter.write( uni.toString() );
            fWriter.close();

        } catch ( Exception e ) {
            System.out.println("Error Writing University!");
        }
    }

}
