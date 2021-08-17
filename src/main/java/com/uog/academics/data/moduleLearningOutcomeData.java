package com.uog.academics.data;

import com.uog.course.Module;
import com.uog.course.ModuleLearningOutcome;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

public class moduleLearningOutcomeData {

    public static List<ModuleLearningOutcome> getAll() {
        List<ModuleLearningOutcome> moduleLearningOutcomes = new ArrayList<>();
        String line;

        try {
            try (BufferedReader bReader = new BufferedReader(new FileReader(ModuleLearningOutcome.filePath))) {
                while ((line = bReader.readLine()) != null) {
                    ModuleLearningOutcome learningOutcome = new ModuleLearningOutcome();

                    String[] uniRow = line.split(",");

                    learningOutcome.setLEARNINGOUTCOME_ID(Long.parseLong(uniRow[0]));
                    learningOutcome.setMODULE_ID(Long.parseLong(uniRow[1]));
                    learningOutcome.setLEARNINGOUTCOME_NO(Long.parseLong(uniRow[2]));
                    learningOutcome.setLEARNINGOUTCOME_CODE(uniRow[3]);
                    learningOutcome.setLEARNINGOUTCOME_DESC(uniRow[4]);
                    learningOutcome.setLEARNINGOUTCOME_INTRODUCTION(uniRow[5]);
                    learningOutcome.setLEARNINGOUTCOME_CONTENTLINK(uniRow[6]);
                    learningOutcome.setISACTIVE(uniRow[7]);
                    learningOutcome.setMODIFIED_BY(Long.parseLong(uniRow[8]));
                    learningOutcome.setMODIFIED_WHEN(uniRow[9]);
                    learningOutcome.setMODIFIED_WORKSTATION(uniRow[10]);

                    moduleLearningOutcomes.add(learningOutcome);
                }
            } catch (FileNotFoundException e) {
                e.printStackTrace();
            }
        } catch (IOException e) {
            e.printStackTrace();
        }

        return moduleLearningOutcomes;
    }

    public static ModuleLearningOutcome getOne (long MODULELEARNINGOUTCOME_ID) {
        ModuleLearningOutcome learningOutcome = new ModuleLearningOutcome();
        String line;

        try {
            BufferedReader bReader = new BufferedReader(new FileReader(ModuleLearningOutcome.filePath));
            while ( (line = bReader.readLine()) != null){
                String [] uniRow = line.split(",");

                if ((Long.parseLong(uniRow[0])) == MODULELEARNINGOUTCOME_ID){
                    learningOutcome.setLEARNINGOUTCOME_ID(Long.parseLong(uniRow[0]));
                    learningOutcome.setMODULE_ID(Long.parseLong(uniRow[1]));
                    learningOutcome.setLEARNINGOUTCOME_NO(Long.parseLong(uniRow[2]));
                    learningOutcome.setLEARNINGOUTCOME_CODE(uniRow[3]);
                    learningOutcome.setLEARNINGOUTCOME_DESC(uniRow[4]);
                    learningOutcome.setLEARNINGOUTCOME_INTRODUCTION(uniRow[5]);
                    learningOutcome.setLEARNINGOUTCOME_CONTENTLINK(uniRow[6]);
                    learningOutcome.setISACTIVE(uniRow[7]);
                    learningOutcome.setMODIFIED_BY(Long.parseLong(uniRow[8]));
                    learningOutcome.setMODIFIED_WHEN(uniRow[9]);
                    learningOutcome.setMODIFIED_WORKSTATION(uniRow[10]);
                }
            }
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        }
        return learningOutcome;
    }

}
