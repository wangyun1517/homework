package com.tw.oo.parkinglot;

import org.junit.Before;
import org.junit.Test;

import static org.hamcrest.MatcherAssert.*;
import static org.hamcrest.core.Is.is;
import static org.hamcrest.core.IsNull.notNullValue;
import static org.hamcrest.core.IsNull.nullValue;

/**
 * Created by yunwang on 12/7/15.
 */
public class ParkingLotTest {

    private ParkingLot parkingLot;

    @Before
    public void setup() {
        parkingLot = new ParkingLot("P1", 1);
    }


    @Test
    public void testParkOneCarSuccess() {

        ParkingTicket ticket = parkingLot.parkCar(Car.newCar("陕A123"));
        assertThat(ticket, notNullValue());
    }

    @Test
    public void testParkOneCarFailed() {
        parkingLot.parkCar(Car.newCar("陕A1"));
        ParkingTicket ticket = parkingLot.parkCar(Car.newCar("陕A2"));
        assertThat(ticket, nullValue());
    }

    @Test
    public void testGetOneCarSuccess() {
        ParkingTicket ticket = parkingLot.parkCar(Car.newCar("陕A123"));
        Car car = parkingLot.unPark(ticket);
        assertThat(car.getId(), is("陕A123"));
    }


    @Test
    public void testGetOneCarFailed() {
        parkingLot.parkCar(Car.newCar("陕A123"));
        Car car = parkingLot.unPark(ParkingTicket.newInstance("p1"));
        assertThat(car, nullValue());
    }
}
