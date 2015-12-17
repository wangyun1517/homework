package com.tw.oo.parkinglot.parker;

import com.tw.oo.parkinglot.Car;
import com.tw.oo.parkinglot.ParkingTicket;

/**
 * Created by yunwang on 12/14/15.
 */
public interface Parker {
    ParkingTicket parkCar(Car car);

    Car unparkCar(ParkingTicket ticket);
}
