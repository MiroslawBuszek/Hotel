package com.mbuszek;

import java.util.Arrays;

public class Hotel {

    private String name;
    private String address;
    private Room[] room;
    private Restaurant restaurant;

    public Hotel(String name, String address) {
        this.name = name;
        this.address = address;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public Room[] getRoom() {
        return room;
    }

    public void setRoom(Room[] room) {
        this.room = room;
    }

    public Restaurant getRestaurant() {
        return restaurant;
    }

    public void setRestaurant(Restaurant restaurant) {
        this.restaurant = restaurant;
    }

    @Override
     public String toString(){
        return "Hotel " + name + ", rooms" + Arrays.toString(room) + ", connected with restaurant = " + restaurant;
    }
}
