package com.uog.academics.data;

import com.uog.course.Module;
import com.uog.course.ModuleAssessmentCriteria;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

public class moduleData {

    public static List<Module> getAll() {
        List<Module> modules = new ArrayList<>();
        String line;

        try {
            try (BufferedReader bReader = new BufferedReader(new FileReader(Module.filePath))) {
                while ((line = bReader.readLine()) != null) {
                    Module module = new Module();

                    String[] uniRow = line.split(",");

                    module.setMODULE_ID(Long.parseLong(uniRow[0]));
                    module.setDEPARTMENT_ID(Long.parseLong(uniRow[1]));
                    module.setMODULE_NO(Long.parseLong(uniRow[2]));
                    module.setMODULE_CODE(uniRow[3]);
                    module.setMODULE_TITLE(uniRow[4]);
                    module.setMODULE_INTRODUCTION(uniRow[5]);
                    module.setMODULE_LEVEL(Long.parseLong(uniRow[6]));
                    module.setCREDIT_HOURS(Long.parseLong(uniRow[7]));
                    module.setGUIDEDLEARNING_HOURS(Long.parseLong(uniRow[8]));
                    module.setISACTIVE(uniRow[9]);
                    module.setMODIFIED_BY(Long.parseLong(uniRow[10]));
                    module.setMODIFIED_WHEN(uniRow[11]);
                    module.setMODIFIED_WORKSTATION(uniRow[12]);

                    modules.add(module);
                }
            } catch (FileNotFoundException e) {
                e.printStackTrace();
            }
        } catch (IOException e) {
            e.printStackTrace();
        }

        return modules;
    }

    public static Module getOne (long MODULE_ID) {
        Module module = new Module();
        String line;

        try {
            BufferedReader bReader = new BufferedReader(new FileReader(Module.filePath));
            while ( (line = bReader.readLine()) != null){
                String [] uniRow = line.split(",");

                if ((Long.parseLong(uniRow[0])) == MODULE_ID){
                    module.setMODULE_ID(Long.parseLong(uniRow[0]));
                    module.setDEPARTMENT_ID(Long.parseLong(uniRow[1]));
                    module.setMODULE_NO(Long.parseLong(uniRow[2]));
                    module.setMODULE_CODE(uniRow[3]);
                    module.setMODULE_TITLE(uniRow[4]);
                    module.setMODULE_INTRODUCTION(uniRow[5]);
                    module.setMODULE_LEVEL(Long.parseLong(uniRow[6]));
                    module.setCREDIT_HOURS(Long.parseLong(uniRow[7]));
                    module.setGUIDEDLEARNING_HOURS(Long.parseLong(uniRow[8]));
                    module.setISACTIVE(uniRow[9]);
                    module.setMODIFIED_BY(Long.parseLong(uniRow[10]));
                    module.setMODIFIED_WHEN(uniRow[11]);
                    module.setMODIFIED_WORKSTATION(uniRow[12]);
                }
            }
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        }
        return module;
    }
}
