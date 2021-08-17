package com.uog.academics.data;

import com.uog.academics.model.Building;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

public class buildingData {

    public static List<Building> getAll () {
        List<Building> buildings = new ArrayList<>();
        String line;

        try {
            try (BufferedReader bReader = new BufferedReader(new FileReader( Building.filePath) )) {
                while ( (line = bReader.readLine()) != null ){
                    Building building = new Building();

                    String [] uniRow = line.split(",");

                    building.setBUILDING_ID(Long.parseLong(uniRow [0]));
                    building.setCAMPUS_ID(Long.parseLong(uniRow [1]));
                    building.setBUILDING_CODE(uniRow [2]);
                    building.setBUILDING_NAME(uniRow [3]);
                    building.setISACTIVE(uniRow [4]);
                    building.setMODIFIED_BY(Long.parseLong(uniRow [5]));
                    building.setMODIFIED_WHEN(uniRow [6]);
                    building.setMODIFIED_WORKSTATION(uniRow [7]);

                    buildings.add(building);
                }
            }
        } catch ( Exception e ) {
            System.out.println("Error Reading University!");
        }

        return buildings;
    }

    public static Building getOne (long BUILDING_ID) {
        Building building = new Building();
        String line;

        try {
            BufferedReader bReader = new BufferedReader(new FileReader(Building.filePath));
            while ( (line = bReader.readLine()) != null){
                String [] uniRow = line.split(",");

                if ((Long.parseLong(uniRow[0])) == BUILDING_ID){
                    building.setBUILDING_ID(Long.parseLong(uniRow [0]));
                    building.setCAMPUS_ID(Long.parseLong(uniRow [1]));
                    building.setBUILDING_CODE(uniRow [2]);
                    building.setBUILDING_NAME(uniRow [3]);
                    building.setISACTIVE(uniRow [4]);
                    building.setMODIFIED_BY(Long.parseLong(uniRow [5]));
                    building.setMODIFIED_WHEN(uniRow [6]);
                    building.setMODIFIED_WORKSTATION(uniRow [7]);
                }
            }
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        }
        return building;
    }


}
