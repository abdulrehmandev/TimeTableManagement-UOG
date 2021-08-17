package com.uog.academics.data;

import com.uog.academics.model.Campus;
import com.uog.course.Course;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

public class courseData {

    public static List<Course> getAll() {
        List<Course> courses = new ArrayList<>();
        String line;

        try {
            try (BufferedReader bReader = new BufferedReader(new FileReader(Course.filePath))) {
                while ((line = bReader.readLine()) != null) {
                    Course course = new Course();

                    String[] uniRow = line.split(",");

                    course.setCOURSE_ID(Long.parseLong(uniRow[0]));
                    course.setCOURSE_CODE(uniRow[1]);
                    course.setCOURSE_TITLE(uniRow[2]);
                    course.setCOURSE_SHORTTITLE(uniRow[3]);
                    course.setCOURSE_INTRODUCTION(uniRow[4]);
                    course.setCOURSE_LEVEL(Long.parseLong(uniRow[5]));
                    course.setMINIMUM_DURATION(Double.parseDouble(uniRow[6]));
                    course.setMAXIMUM_DURATION(Double.parseDouble(uniRow[7]));
                    course.setMINIMUM_CREDITHOURS(Double.parseDouble(uniRow[8]));
                    course.setMAXIMUM_CREDITHOURS(Double.parseDouble(uniRow[9]));
                    course.setPATHWAY(uniRow[10]);
                    course.setSLC_COURSECODE(uniRow[11]);
                    course.setLARA_CODE(uniRow[12]);
                    course.setQUALIFICATIONTYPE_ID(Long.parseLong(uniRow[13]));
                    course.setPROVISIONTYPE_ID(Long.parseLong(uniRow[14]));
                    course.setREGULATORYBODY_ID(Long.parseLong(uniRow[15]));
                    course.setTEACHERTRAININGCOURSE_ID(Long.parseLong(uniRow[16]));
                    course.setMANDATORY_MODULES(Long.parseLong(uniRow[17]));
                    course.setOPTIONAL_MODULES(Long.parseLong(uniRow[18]));
                    course.setSTUDYSKILL_MODULES(Long.parseLong(uniRow[19]));
                    course.setISACTIVE(uniRow[20]);
                    course.setMODIFIED_BY(Long.parseLong(uniRow[21]));
                    course.setMODIFIED_WHEN(uniRow[22]);
                    course.setMODIFIED_WORKSTATION(uniRow[23]);

                    courses.add(course);
                }
            } catch (FileNotFoundException e) {
                e.printStackTrace();
            }
        } catch (IOException e) {
            e.printStackTrace();
        }

        return courses;
    }

    public static Course getOne (long COURSE_ID) {
        Course course = new Course();
        String line;

        try {
            BufferedReader bReader = new BufferedReader(new FileReader(Course.filePath));
            while ( (line = bReader.readLine()) != null){
                String [] uniRow = line.split(",");

                if ((Long.parseLong(uniRow[0])) == COURSE_ID){
                    course.setCOURSE_ID(Long.parseLong(uniRow[0]));
                    course.setCOURSE_CODE(uniRow[1]);
                    course.setCOURSE_TITLE(uniRow[2]);
                    course.setCOURSE_SHORTTITLE(uniRow[3]);
                    course.setCOURSE_INTRODUCTION(uniRow[4]);
                    course.setCOURSE_LEVEL(Long.parseLong(uniRow[5]));
                    course.setMINIMUM_DURATION(Double.parseDouble(uniRow[6]));
                    course.setMAXIMUM_DURATION(Double.parseDouble(uniRow[7]));
                    course.setMINIMUM_CREDITHOURS(Double.parseDouble(uniRow[8]));
                    course.setMAXIMUM_CREDITHOURS(Double.parseDouble(uniRow[9]));
                    course.setPATHWAY(uniRow[10]);
                    course.setSLC_COURSECODE(uniRow[11]);
                    course.setLARA_CODE(uniRow[12]);
                    course.setQUALIFICATIONTYPE_ID(Long.parseLong(uniRow[13]));
                    course.setPROVISIONTYPE_ID(Long.parseLong(uniRow[14]));
                    course.setREGULATORYBODY_ID(Long.parseLong(uniRow[15]));
                    course.setTEACHERTRAININGCOURSE_ID(Long.parseLong(uniRow[16]));
                    course.setMANDATORY_MODULES(Long.parseLong(uniRow[17]));
                    course.setOPTIONAL_MODULES(Long.parseLong(uniRow[18]));
                    course.setSTUDYSKILL_MODULES(Long.parseLong(uniRow[19]));
                    course.setISACTIVE(uniRow[20]);
                    course.setMODIFIED_BY(Long.parseLong(uniRow[21]));
                    course.setMODIFIED_WHEN(uniRow[22]);
                    course.setMODIFIED_WORKSTATION(uniRow[23]);
                }
            }
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        }
        return course;
    }

}