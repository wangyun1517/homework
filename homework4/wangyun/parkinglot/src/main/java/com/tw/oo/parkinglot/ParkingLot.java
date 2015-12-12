package com.tw.oo.parkinglot;

import java.util.HashMap;
import java.util.Map;

/**
 * Created by yunwang on 12/7/15.
 */
public class ParkingLot {
    private String name;
    private final int capabilities;
    private final Map<ParkingTicket, Car> carMap = new HashMap<>();

    public ParkingLot(String name, int capabilities) {
        this.name = name;
        this.capabilities = capabilities;
    }

    public ParkingTicket parkCar(Car car) {

        if (isFull()) {
            return null;
        }
        ParkingTicket ticket = ParkingTicket.newInstance(name);
        carMap.put(ticket, car);
        return ticket;
    }

    private boolean isFull() {
        return carMap.size() == capabilities;
    }

    public Car unPark(ParkingTicket ticket) {

        return carMap.remove(ticket);
    }

    public int getRestParkNum() {
        return capabilities - carMap.size();
    }

    public int getRestParkPercent() {
        return getRestParkNum() * 100 / capabilities;
    }
}
