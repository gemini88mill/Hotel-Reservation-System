package com.company;

import com.company.Structs.Guest;
import com.company.Structs.Room;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;

public class Main {

    static Hotel hotel = null;
    Date currentDate;

    public static void main(String[] args) {
	// write your code here
        Calendar cal = Calendar.getInstance();

        System.out.println("Building Hotel...");
        buildHotel();

        System.out.println("entering guest...");
        addGuest();


    }

    private static void buildHotel(){
        hotel = new Hotel();
        Calendar cal = Calendar.getInstance();
        Date currentDate = cal.getTime();

        System.out.println("Today is:" + cal.getTime());

        //for (int x = 0; x < hotel.getRoom().length; x++) {
          //  System.out.println(hotel.room[x].getRoomPriceBase() + "\t" + hotel.room[x].getRoomType());
       // }
    }

    private static void addGuest(){
        SimpleDateFormat sdf = new SimpleDateFormat("DD/MM/yyyy");
        Guest guest;
        try {
            guest = new Guest("Raphael", "Miller", sdf.parse("02/02/2015"), sdf.parse("02/03/2015"), "suite");
            Room room = hotel.locateRoom(guest, hotel.room);
            System.out.println(room.getRoomPriceBase() + "\t" + room.getRoomType());
        } catch (ParseException e) {
            e.printStackTrace();
        }
    }

    public Main(Hotel hotel) {
        this.hotel = hotel;
    }

    public Hotel getHotel() {
        return hotel;
    }

    public void setHotel(Hotel hotel) {
        this.hotel = hotel;
    }

    public Date getCurrentDate() {
        return currentDate;
    }

    public void setCurrentDate(Date currentDate) {
        this.currentDate = currentDate;
    }
}
