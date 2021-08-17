package com.uog.academics.data;

import com.uog.academics.model.AcademicsYear;
import com.uog.course.CourseModule;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

public class courseModuleData {

    public static List<CourseModule> getAll() {
        List<CourseModule> courseModules = new ArrayList<>();
        String line;

        try {
            try (BufferedReader bReader = new BufferedReader(new FileReader(CourseModule.filePath))) {
                while ((line = bReader.readLine()) != null) {
                    CourseModule courseModule = new CourseModule();

                    String[] uniRow = line.split(",");

                    courseModule.setCOURSEMODULE_ID(Long.parseLong(uniRow[0]));
                    courseModule.setCOURSE_ID(Long.parseLong(uniRow[1]));
                    courseModule.setMODULE_ID(Long.parseLong(uniRow[2]));
                    courseModule.setISACTIVE(uniRow[3]);
                    courseModule.setMODIFIED_BY(Long.parseLong(uniRow[4]));
                    courseModule.setMODIFIED_WHEN(uniRow[5]);
                    courseModule.setMODIFIED_WORKSTATION(uniRow[6]);

                    courseModules.add(courseModule);
                }
            } catch (FileNotFoundException e) {
                e.printStackTrace();
            }
        } catch (IOException e) {
            e.printStackTrace();
        }

        return courseModules;
    }

    public static CourseModule getOne (long COURSEMODULE_ID) {
        CourseModule courseModule = new CourseModule();
        String line;

        try {
            BufferedReader bReader = new BufferedReader(new FileReader(CourseModule.filePath));
            while ( (line = bReader.readLine()) != null){
                String [] uniRow = line.split(",");

                if ((Long.parseLong(uniRow[0])) == COURSEMODULE_ID){
                    courseModule.setCOURSEMODULE_ID(Long.parseLong(uniRow[0]));
                    courseModule.setCOURSE_ID(Long.parseLong(uniRow[1]));
                    courseModule.setMODULE_ID(Long.parseLong(uniRow[2]));
                    courseModule.setISACTIVE(uniRow[3]);
                    courseModule.setMODIFIED_BY(Long.parseLong(uniRow[4]));
                    courseModule.setMODIFIED_WHEN(uniRow[5]);
                    courseModule.setMODIFIED_WORKSTATION(uniRow[6]);
                }
            }
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        }
        return courseModule;
    }

}
