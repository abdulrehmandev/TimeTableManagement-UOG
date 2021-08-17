package com.uog.academics.data;

import com.uog.academics.model.Room;
import com.uog.course.ModuleLearningOutcome;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

public class roomData {

    public static List<Room> getAll () {
        List<Room> rooms = new ArrayList<>();
        String line;

        try {
            try (BufferedReader bReader = new BufferedReader(new FileReader( Room.filePath) )) {
                while ( (line = bReader.readLine()) != null ){
                    Room room = new Room();

                    String [] uniRow = line.split(",");

                    room.setBUILDING_ID(Long.parseLong(uniRow [0]));
                    room.setROOM_ID(Long.parseLong(uniRow [1]));
                    room.setROOM_CODE(uniRow [2]);
                    room.setROOM_NAME(uniRow [3]);
                    room.setROOM_FLOOR(Long.parseLong(uniRow [4]));
                    room.setROOM_CAPACITY(Long.parseLong(uniRow [5]));
                    room.setISACTIVE(uniRow [6]);
                    room.setMODIFIED_BY(Long.parseLong(uniRow [7]));
                    room.setMODIFIED_WHEN(uniRow [8]);
                    room.setMODIFIED_WORKSTATION(uniRow [9]);

                    rooms.add(room);
                }
            }
        } catch ( Exception e ) {
            System.out.println("Error Reading Rooms!");
        }

        return rooms;
    }

    public static Room getOne (long ROOM_ID) {
        Room room = new Room();
        String line;

        try {
            BufferedReader bReader = new BufferedReader(new FileReader(Room.filePath));
            while ( (line = bReader.readLine()) != null){
                String [] uniRow = line.split(",");

                if ((Long.parseLong(uniRow[0])) == ROOM_ID){
                    room.setBUILDING_ID(Long.parseLong(uniRow [0]));
                    room.setROOM_ID(Long.parseLong(uniRow [1]));
                    room.setROOM_CODE(uniRow [2]);
                    room.setROOM_NAME(uniRow [3]);
                    room.setROOM_FLOOR(Long.parseLong(uniRow [4]));
                    room.setROOM_CAPACITY(Long.parseLong(uniRow [5]));
                    room.setISACTIVE(uniRow [6]);
                    room.setMODIFIED_BY(Long.parseLong(uniRow [7]));
                    room.setMODIFIED_WHEN(uniRow [8]);
                    room.setMODIFIED_WORKSTATION(uniRow [9]);
                }
            }
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        }
        return room;
    }

}
