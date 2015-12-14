package com.tw.oo.parkinglot;

import java.util.HashMap;
import java.util.Map;

/**
 * Created by yunwang on 12/7/15.
 */
public class ParkingLot {
    private final String name;
    private final int capacity;
    private final Map<ParkingTicket, Car> carMap = new HashMap<>();

    public ParkingLot(String name, int capacity) {
        this.name = name;
        this.capacity = capacity;
    }

    public ParkingTicket parkCar(Car car) {

        if (isFull()) {
            return null;
        }
        ParkingTicket ticket = ParkingTicket.newInstance(name);
        carMap.put(ticket, car);
        return ticket;
    }

    public boolean isFull() {
        return carMap.size() == capacity;
    }

    public Car unPark(ParkingTicket ticket) {

        return carMap.remove(ticket);
    }

    public int getRestParkNum() {
        return capacity - carMap.size();
    }

    public Double getRestParkPercent() {
        return (double) getRestParkNum() / capacity;
    }


    public String getName() {
        return name;
    }
}
