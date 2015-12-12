package com.tw.oo.parkinglot;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by yunwang on 12/11/15.
 */
public abstract class ParkMan {
    protected List<ParkingLot> parkingLotList = new ArrayList<>();

    public void add(ParkingLot parkingLot) {
        parkingLotList.add(parkingLot);
    }

    public ParkingTicket parkCar(Car car) {
        sortParkingLot();

        for (ParkingLot p : parkingLotList) {
            ParkingTicket ticket = p.parkCar(car);
            if (ticket != null) {
                return ticket;
            }
        }
        return null;
    }

    protected abstract void sortParkingLot();

    public Car unparkCar(ParkingTicket ticket) {
        for (ParkingLot p : parkingLotList) {
            Car car = p.unPark(ticket);
            if (car != null) {
                return car;
            }
        }
        return null;
    }

}