package com.uog.academics.data;

import com.uog.course.CourseSubject;
import com.uog.course.ModuleAssessmentCriteria;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

public class moduleAssessmentCriteriaData {

    public static List<ModuleAssessmentCriteria> getAll() {
        List<ModuleAssessmentCriteria> moduleAssessmentCriteria = new ArrayList<>();
        String line;

        try {
            try (BufferedReader bReader = new BufferedReader(new FileReader(ModuleAssessmentCriteria.filePath))) {
                while ((line = bReader.readLine()) != null) {
                    ModuleAssessmentCriteria assessmentCriteria = new ModuleAssessmentCriteria();

                    String[] uniRow = line.split(",");

                    assessmentCriteria.setASSESSMENTCRITERIA_ID(Long.parseLong(uniRow[0]));
                    assessmentCriteria.setMODULE_ID(Long.parseLong(uniRow[1]));
                    assessmentCriteria.setLEARNINGOUTCOME_ID(Long.parseLong(uniRow[2]));
                    assessmentCriteria.setASSESSMENTCRITERIA_NO(Long.parseLong(uniRow[3]));
                    assessmentCriteria.setASSESSMENTCRITERIA_CODE(uniRow[4]);
                    assessmentCriteria.setASSESSMENTCRITERIA_DESC(uniRow[5]);
                    assessmentCriteria.setISACTIVE(uniRow[6]);
                    assessmentCriteria.setMODIFIED_BY(Long.parseLong(uniRow[7]));
                    assessmentCriteria.setMODIFIED_WHEN(uniRow[8]);
                    assessmentCriteria.setMODIFIED_WORKSTATION(uniRow[9]);

                    moduleAssessmentCriteria.add(assessmentCriteria);
                }
            } catch (FileNotFoundException e) {
                e.printStackTrace();
            }
        } catch (IOException e) {
            e.printStackTrace();
        }

        return moduleAssessmentCriteria;
    }

    public static ModuleAssessmentCriteria getOne (long MODULEASSESSMENTCRITERIA_ID) {
        ModuleAssessmentCriteria assessmentCriteria = new ModuleAssessmentCriteria();
        String line;

        try {
            BufferedReader bReader = new BufferedReader(new FileReader(ModuleAssessmentCriteria.filePath));
            while ( (line = bReader.readLine()) != null){
                String [] uniRow = line.split(",");

                if ((Long.parseLong(uniRow[0])) == MODULEASSESSMENTCRITERIA_ID){
                    assessmentCriteria.setASSESSMENTCRITERIA_ID(Long.parseLong(uniRow[0]));
                    assessmentCriteria.setMODULE_ID(Long.parseLong(uniRow[1]));
                    assessmentCriteria.setLEARNINGOUTCOME_ID(Long.parseLong(uniRow[2]));
                    assessmentCriteria.setASSESSMENTCRITERIA_NO(Long.parseLong(uniRow[3]));
                    assessmentCriteria.setASSESSMENTCRITERIA_CODE(uniRow[4]);
                    assessmentCriteria.setASSESSMENTCRITERIA_DESC(uniRow[5]);
                    assessmentCriteria.setISACTIVE(uniRow[6]);
                    assessmentCriteria.setMODIFIED_BY(Long.parseLong(uniRow[7]));
                    assessmentCriteria.setMODIFIED_WHEN(uniRow[8]);
                    assessmentCriteria.setMODIFIED_WORKSTATION(uniRow[9]);
                }
            }
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        }
        return assessmentCriteria;
    }
}
