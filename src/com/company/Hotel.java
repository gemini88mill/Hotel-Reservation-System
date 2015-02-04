package com.company;

import com.company.Structs.Guest;
import com.company.Structs.Room;

/**
 * Created by raphael on 2/3/15.
 */
public class Hotel {

    Room[] room = null;
    Guest[] guest = null;
    int floor = 0;

    //---------------------------------------------------------------
    public Hotel() {
        room = new Room[10];

        for (int x = 0; x < room.length; x++){
            if (x < 5) {
                room[x] = new Room("single", 100.00);
            } else if(x >= 5 && x < 8){
                room[x] = new Room("double", 200.00);
            } else if (x >= 8){
                room[x] = new Room("suite", 300.00);
            }
        }
    }

    public Room locateRoom(Guest guest, Room[] rooms){
        int length = Main.hotel.room.length;
        String choice = guest.getRoomChoice();
        String[] roomType = new String[10];

        for (int x = 0; x < length; x++){
            roomType[x] = rooms[x].getRoomType();
            if (choice == roomType[x] && rooms[x].isVacant() == true){
                System.out.println("found room... ");
                return rooms[x];
            }
        }

        System.out.println("room not found");
        return room[0];
    }

    public Room[] getRoom() {
        return room;
    }

    public void setRoom(Room[] room) {
        this.room = room;
    }

    public Guest[] getGuest() {
        return guest;
    }

    public void setGuest(Guest[] guest) {
        this.guest = guest;
    }
}
