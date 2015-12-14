package com.tw.oo.parkinglot;

import org.junit.Test;

import static org.hamcrest.core.Is.is;
import static org.hamcrest.core.AnyOf.*;
import static org.junit.Assert.*;

/**
 * Created by yunwang on 12/11/15.
 */
public class NormalParkManTest extends ParkManTest {

    @Override
    protected ParkMan getSpecificParkMan() {
        return new NormalParkMan();
    }

    @Test
    public void 停车小弟会将车优先停到空位最多的停车场里(){
        assertThat(man.parkCar(Car.newCar("C1")).getParkingLotName(), is("P3"));
    }
}