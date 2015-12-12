package com.tw.oo.parkinglot;

import org.junit.Before;
import org.junit.Test;

import static org.hamcrest.core.Is.is;
import static org.hamcrest.core.IsNull.nullValue;
import static org.junit.Assert.*;

/**
 * Created by yunwang on 12/11/15.
 */
public class StupidParkManTest extends ParkManTest {

    @Test
    public void 停车小弟会将车停到第一个没有停满的停车场() {
        assertThat(man.parkCar(Car.newCar("C1")).getParkingLotName(), is("P1"));
        assertThat(man.parkCar(Car.newCar("C2")).getParkingLotName(), is("P2"));
        assertThat(man.parkCar(Car.newCar("C3")).getParkingLotName(), is("P2"));
        assertThat(man.parkCar(Car.newCar("C4")).getParkingLotName(), is("P3"));
    }


    @Override
    protected ParkMan getSpecificParkMan() {
        return new StupidParkMan();
    }
}