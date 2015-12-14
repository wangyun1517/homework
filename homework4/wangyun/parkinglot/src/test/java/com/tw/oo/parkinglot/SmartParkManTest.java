package com.tw.oo.parkinglot;

import org.junit.Test;

import static org.hamcrest.core.AnyOf.anyOf;
import static org.hamcrest.core.Is.is;
import static org.junit.Assert.*;

/**
 * Created by yunwang on 12/12/15.
 */
public class SmartParkManTest extends ParkManTest {

    @Override
    protected ParkMan getSpecificParkMan() {
        return new SmartParkMan();
    }

    @Test
    public void 停车小弟会优先将车停到空置率最高的停车厂里(){
        man.parkCar(Car.newCar("C1"));
        man.parkCar(Car.newCar("C2"));
        man.parkCar(Car.newCar("C3"));
        assertThat(man.parkCar(Car.newCar("C4")).getParkingLotName(), is("P3"));
        assertThat(man.parkCar(Car.newCar("C5")).getParkingLotName(), is("P2"));
    }
}