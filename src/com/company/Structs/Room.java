package com.company.Structs;

/**
 * Created by raphael on 2/3/15.
 */
public class Room {

    String roomType = null;
    double roomPriceBase = 0.0;

    public Room(String roomType, double roomPriceBase) {
        this.roomType = roomType;
        this.roomPriceBase = roomPriceBase;
    }



    public String getRoomType() {
        return roomType;
    }

    public void setRoomType(String roomType) {
        this.roomType = roomType;
    }

    public double getRoomPriceBase() {
        return roomPriceBase;
    }

    public void setRoomPriceBase(double roomPriceBase) {
        this.roomPriceBase = roomPriceBase;
    }
}
