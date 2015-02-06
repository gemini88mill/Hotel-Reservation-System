package com.company.Structs;

import java.util.Date;

/**
 * Created by raphael on 2/3/15.
 */
public class Guest {

    private String firstName;
    private String lastName;
    private Date arrivalDate;
    private Date departureDate;
    private String roomChoice;

    public Guest(String firstName, String lastName, Date arrivalDate, Date departureDate, String roomChoice) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.arrivalDate = arrivalDate;
        this.departureDate = departureDate;
        this.roomChoice = roomChoice;
    }

    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public Date getArrivalDate() {
        return arrivalDate;
    }

    public void setArrivalDate(Date arrivalDate) {
        this.arrivalDate = arrivalDate;
    }

    public Date getDepartureDate() {
        return departureDate;
    }

    public void setDepartureDate(Date departureDate) {
        this.departureDate = departureDate;
    }

    public String getRoomChoice() {
        return roomChoice;
    }

    public void setRoomChoice(String roomChoice) {
        this.roomChoice = roomChoice;
    }

    public String toString(){
        return getFirstName() + "\t" + getLastName();
    }
}
