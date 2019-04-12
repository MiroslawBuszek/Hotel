package com.mbuszek;

public class Main {

    public static void main(String[] args) {
        Hotel hotel = new Hotel("Sheraton", "ul. Polska 22");

        Room room1 = new Room("15", 5, 332);
        Room room2 = new Room("16", 5, 333);
        Room room3 = new Room("27", 6, 441);
        Room room4 = new Room("28", 6, 442);

        TV tv1 = new TV("X-259", "Panasonic", "3K", 55);
        TV tv2 = new TV("D-881", "Sony", "4K", 80);


        AirConditioner airConditioner1 = new AirConditioner("151AAA", "LP-558", 4500, 85);
        AirConditioner airConditioner2 = new AirConditioner("153-DDD", "KK-255", 4000, 68);

        Restaurant restaurant = new Restaurant("Wawelska", "15-22");

        room1.setTV(tv1);
        room2.setAirConditioner(airConditioner1);

        room2.setTV(tv2);
        room2.setAirConditioner(airConditioner2);

        hotel.setRoom(new Room[]{room1, room2, room3, room4});
        hotel.setRestaurant(restaurant);

        restaurant.setHotel(hotel);

        System.out.println(hotel);
    }
}
