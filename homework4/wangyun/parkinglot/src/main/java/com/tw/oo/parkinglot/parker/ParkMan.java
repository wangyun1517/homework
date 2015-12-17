package com.tw.oo.parkinglot.parker;

import com.tw.oo.parkinglot.Car;
import com.tw.oo.parkinglot.ParkingLot;
import com.tw.oo.parkinglot.ParkingTicket;

import java.util.List;
import java.util.Optional;

/**
 * Created by yunwang on 12/11/15.
 */
public abstract class ParkMan implements Parker {
    private List<ParkingLot> parkingLotList;

    protected ParkMan(List<ParkingLot> parkingLotList) {
        this.parkingLotList = parkingLotList;
    }

    @Override
    public ParkingTicket parkCar(Car car) {
        Optional<ParkingLot> p = findAvailableParkingLot(parkingLotList);
        return p.isPresent() ? p.get().parkCar(car) : null;
    }

    protected abstract Optional<ParkingLot> findAvailableParkingLot(List<ParkingLot> parkingLotList);


    @Override
    public Car unparkCar(ParkingTicket ticket) {
        Optional<ParkingLot> parkingLot = parkingLotList.stream().filter(p -> p.getName().equals(ticket.getParkingLotName())).findFirst();
        return parkingLot.isPresent() ? parkingLot.get().unPark(ticket) : null;
    }

}