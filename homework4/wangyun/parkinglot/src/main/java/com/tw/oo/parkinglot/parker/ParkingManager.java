package com.tw.oo.parkinglot.parker;

import com.tw.oo.parkinglot.Car;
import com.tw.oo.parkinglot.ParkingTicket;

import java.util.List;

/**
 * Created by yunwang on 12/14/15.
 */
public class ParkingManager implements Parker {

    private List<Parker> parkers;

    public ParkingManager(List<Parker> parkers) {
        this.parkers = parkers;
    }

    @Override
    public ParkingTicket parkCar(Car car) {
        for (Parker p : parkers) {
            ParkingTicket ticket = p.parkCar(car);
            if (ticket != null) {
                return ticket;
            }
        }
        return null;
    }

    @Override
    public Car unparkCar(ParkingTicket ticket) {
        for (Parker p : parkers) {
            Car car = p.unparkCar(ticket);
            if (car != null) {
                return car;
            }
        }
        return null;
    }
}
