package com.uog.academics.data;

import com.uog.academics.model.Campus;
import com.uog.course.CourseBooks;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

public class courseBooksData {

    public static List<CourseBooks> getAll() {
        List<CourseBooks> courseBooks = new ArrayList<>();
        String line;

        try {
            try (BufferedReader bReader = new BufferedReader(new FileReader(CourseBooks.filePath))) {
                while ((line = bReader.readLine()) != null) {
                    CourseBooks courseBook = new CourseBooks();

                    String[] uniRow = line.split(",");

                    courseBook.setCOURSEBOOK_ID(Long.parseLong(uniRow[0]));
                    courseBook.setCOURSE_ID(Long.parseLong(uniRow[1]));
                    courseBook.setCOURSEBOOK_NAME(uniRow[2]);
                    courseBook.setCOURSEBOOK_CATAGORY(uniRow[3]);
                    courseBook.setCOURSEBOOK_PRICE(Long.parseLong(uniRow[4]));
                    courseBook.setCOURSEBOOK_QUANTITY(Long.parseLong(uniRow[5]));
                    courseBook.setISACTIVE(uniRow[6]);
                    courseBook.setMODIFIED_BY(Long.parseLong(uniRow[7]));
                    courseBook.setMODIFIED_WHEN(uniRow[8]);
                    courseBook.setMODIFIED_WORKSTATION(uniRow[9]);

                    courseBooks.add(courseBook);
                }
            } catch (FileNotFoundException e) {
                e.printStackTrace();
            }
        } catch (IOException e) {
            e.printStackTrace();
        }

        return courseBooks;
    }

    public static CourseBooks getOne (long COURSEBOOKS_ID) {
        CourseBooks courseBook = new CourseBooks();
        String line;

        try {
            BufferedReader bReader = new BufferedReader(new FileReader(CourseBooks.filePath));
            while ( (line = bReader.readLine()) != null){
                String [] uniRow = line.split(",");

                if ((Long.parseLong(uniRow[0])) == COURSEBOOKS_ID){
                    courseBook.setCOURSEBOOK_ID(Long.parseLong(uniRow[0]));
                    courseBook.setCOURSE_ID(Long.parseLong(uniRow[1]));
                    courseBook.setCOURSEBOOK_NAME(uniRow[2]);
                    courseBook.setCOURSEBOOK_CATAGORY(uniRow[3]);
                    courseBook.setCOURSEBOOK_PRICE(Long.parseLong(uniRow[4]));
                    courseBook.setCOURSEBOOK_QUANTITY(Long.parseLong(uniRow[5]));
                    courseBook.setISACTIVE(uniRow[6]);
                    courseBook.setMODIFIED_BY(Long.parseLong(uniRow[7]));
                    courseBook.setMODIFIED_WHEN(uniRow[8]);
                    courseBook.setMODIFIED_WORKSTATION(uniRow[9]);
                }
            }
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        }
        return courseBook;
    }

}
