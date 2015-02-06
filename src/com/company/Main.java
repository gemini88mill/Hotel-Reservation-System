package com.company;

import com.company.Structs.Guest;
import com.company.Structs.Room;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;
import java.util.Scanner;

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

    private static void selection(String userInput, Guest guest, int x) {
        if (userInput.equals("Y")){
            hotel.room[x].setVacant(false);
            hotel.room[x].setOccupiedBy(guest);
            System.out.println(hotel.room[x].toString());

        } else if (userInput.equals("N")) {
            System.exit(1);
        }
    }

    private static String userInput(){
        Scanner scan = new Scanner(System.in);
        return scan.nextLine();
    }

    private static void buildHotel(){
        hotel = new Hotel();
        Calendar cal = Calendar.getInstance();
        Date currentDate = cal.getTime();

        System.out.println("Today is: " + currentDate);

        //for (int x = 0; x < hotel.getRoom().length; x++) {
          //  System.out.println(hotel.room[x].getRoomPriceBase() + "\t" + hotel.room[x].getRoomType());
       // }
    }

    private static void addGuest(){
        SimpleDateFormat sdf = new SimpleDateFormat("DD/MM/yyyy");
        Guest guest = null;
        Room room;
        Room[] rooms = hotel.room;
        int count = 0;

        try {
            guest = new Guest("Raphael", "Miller", sdf.parse("02/02/2015"), sdf.parse("02/03/2015"), "suite");
            room = hotel.locateRoom(guest, rooms);
            System.out.println(room.getRoomPriceBase() + "\t" + room.getRoomType());
        } catch (ParseException e) {
            e.printStackTrace();
        }

        System.out.println("Accept? (y/n)");
        String userInput = userInput();
        selection(userInput.toUpperCase(), guest, hotel.getRoomNum());
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
