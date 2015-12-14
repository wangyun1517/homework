package com.tw.oo.parkinglot;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

/**
 * Created by yunwang on 12/11/15.
 */
public abstract class ParkMan {
    private final List<ParkingLot> parkingLotList = new ArrayList<>();

    public void add(ParkingLot parkingLot) {
        parkingLotList.add(parkingLot);
    }

    public ParkingTicket parkCar(Car car) {
        Optional<ParkingLot> p = findAvailableParkingLot(parkingLotList);
        return p.isPresent() ? p.get().parkCar(car) : null;
    }

    protected abstract Optional<ParkingLot> findAvailableParkingLot(List<ParkingLot> parkingLotList);


    public Car unparkCar(ParkingTicket ticket) {
        Optional<ParkingLot> parkingLot = parkingLotList.stream().filter(p -> p.getName().equals(ticket.getParkingLotName())).findFirst();
        return parkingLot.isPresent() ? parkingLot.get().unPark(ticket) : null;
    }

}