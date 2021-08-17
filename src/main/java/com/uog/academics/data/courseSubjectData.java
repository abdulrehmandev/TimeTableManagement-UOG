package com.uog.academics.data;

import com.uog.course.CourseModule;
import com.uog.course.CourseSubject;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

public class courseSubjectData {

    public static List<CourseSubject> getAll() {
        List<CourseSubject> courseSubjects = new ArrayList<>();
        String line;

        try {
            try (BufferedReader bReader = new BufferedReader(new FileReader(CourseSubject.filePath))) {
                while ((line = bReader.readLine()) != null) {
                    CourseSubject courseSubject = new CourseSubject();

                    String[] uniRow = line.split(",");

                    courseSubject.setCOURSESUBJECT_ID(Long.parseLong(uniRow[0]));
                    courseSubject.setCOURSE_ID(Long.parseLong(uniRow[1]));
                    courseSubject.setSUBJECT_ID(Long.parseLong(uniRow[2]));
                    courseSubject.setSUBJECT_PERCENTAGE(Long.parseLong(uniRow[3]));
                    courseSubject.setISACTIVE(uniRow[4]);
                    courseSubject.setMODIFIED_BY(Long.parseLong(uniRow[5]));
                    courseSubject.setMODIFIED_WHEN(uniRow[6]);
                    courseSubject.setMODIFIED_WORKSTATION(uniRow[7]);

                    courseSubjects.add(courseSubject);
                }
            } catch (FileNotFoundException e) {
                e.printStackTrace();
            }
        } catch (IOException e) {
            e.printStackTrace();
        }

        return courseSubjects;
    }
    public static CourseSubject getOne (long COURSESUBJECT) {
        CourseSubject courseSubject = new CourseSubject();
        String line;

        try {
            BufferedReader bReader = new BufferedReader(new FileReader(CourseSubject.filePath));
            while ( (line = bReader.readLine()) != null){
                String [] uniRow = line.split(",");

                if ((Long.parseLong(uniRow[0])) == COURSESUBJECT){
                    courseSubject.setCOURSESUBJECT_ID(Long.parseLong(uniRow[0]));
                    courseSubject.setCOURSE_ID(Long.parseLong(uniRow[1]));
                    courseSubject.setSUBJECT_ID(Long.parseLong(uniRow[2]));
                    courseSubject.setSUBJECT_PERCENTAGE(Long.parseLong(uniRow[3]));
                    courseSubject.setISACTIVE(uniRow[4]);
                    courseSubject.setMODIFIED_BY(Long.parseLong(uniRow[5]));
                    courseSubject.setMODIFIED_WHEN(uniRow[6]);
                    courseSubject.setMODIFIED_WORKSTATION(uniRow[7]);
                }
            }
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        }
        return courseSubject;
    }

}
