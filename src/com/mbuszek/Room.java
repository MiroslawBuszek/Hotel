package com.mbuszek;

public class Room {

    private String number;
    private int floor;
    private TV tv;
    private AirConditioner airConditioner;

    public Room(String number, int floor, int TV) {
        this.number = number;
        this.floor = floor;
    }

    public String getNumber() {
        return number;
    }

    public void setNumber(String number) {
        this.number = number;
    }

    public int getFloor() {
        return floor;
    }

    public void setFloor(int floor) {
        this.floor = floor;
    }

    public TV getTV() {
        return tv;
    }

    public void setTV(TV tv) {
        this.tv = tv;
    }

    public AirConditioner getAirConditioner() {
        return airConditioner;
    }

    public void setAirConditioner(AirConditioner airConditioner) {
        this.airConditioner = airConditioner;
    }

    @Override
    public String toString() {
        return "Room number: " + number + ": " + tv + ", airConditioner=" + airConditioner;
    }

}
