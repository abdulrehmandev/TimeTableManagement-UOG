package com.uog.academics.data;

import com.uog.academics.model.Department;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

public class departmentData {

    public static List<Department> getAll () {
        List<Department> departments = new ArrayList<>();
        String line;

        try {
            try (BufferedReader bReader = new BufferedReader(new FileReader( Department.filePath) )) {
                while ( (line = bReader.readLine()) != null ){
                    Department department = new Department();

                    String [] uniRow = line.split(",");

                    department.setDEPARTMENT_ID(Long.parseLong(uniRow [0]));
                    department.setCOLLEGE_ID(Long.parseLong(uniRow [1]));
                    department.setDEPARTMENT_CODE(uniRow [2]);
                    department.setDEPARTMENT_NAME(uniRow [3]);
                    department.setDEPARTMENT_DESCRIPTION(uniRow [4]);
                    department.setISACTIVE(uniRow [5]);
                    department.setMODIFIED_BY(Long.parseLong(uniRow [6]));
                    department.setMODIFIED_WHEN(uniRow [7]);
                    department.setMODIFIED_WORKSTATION(uniRow [8]);

                    departments.add(department);
                }
            }
        } catch ( Exception e ) {
            System.out.println("Error Reading University!");
        }

        return departments;
    }

    public static Department getOne (long DEPARTMENT_ID) {
        Department department = new Department();
        String line;

        try {
            BufferedReader bReader = new BufferedReader(new FileReader(Department.filePath));
            while ( (line = bReader.readLine()) != null){
                String [] uniRow = line.split(",");

                if ((Long.parseLong(uniRow[0])) == DEPARTMENT_ID){
                    department.setDEPARTMENT_ID(Long.parseLong(uniRow [0]));
                    department.setCOLLEGE_ID(Long.parseLong(uniRow [1]));
                    department.setDEPARTMENT_CODE(uniRow [2]);
                    department.setDEPARTMENT_NAME(uniRow [3]);
                    department.setDEPARTMENT_DESCRIPTION(uniRow [4]);
                    department.setISACTIVE(uniRow [5]);
                    department.setMODIFIED_BY(Long.parseLong(uniRow [6]));
                    department.setMODIFIED_WHEN(uniRow [7]);
                    department.setMODIFIED_WORKSTATION(uniRow [8]);
                }
            }
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        }
        return department;
    }

}
