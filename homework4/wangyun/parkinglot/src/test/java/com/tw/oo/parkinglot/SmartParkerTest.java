package com.tw.oo.parkinglot;

import com.tw.oo.parkinglot.parker.Parker;
import com.tw.oo.parkinglot.parker.SmartParkMan;
import org.junit.Test;

import java.util.ArrayList;
import java.util.List;

import static org.hamcrest.core.AnyOf.anyOf;
import static org.hamcrest.core.Is.is;
import static org.junit.Assert.*;

/**
 * Created by yunwang on 12/12/15.
 */
public class SmartParkerTest extends ParkerTest {

    @Override
    protected Parker getSpecificParker() {
        List<ParkingLot> list = new ArrayList<>();
        list.add(new ParkingLot("P1",1));
        list.add(new ParkingLot("P2",2));
        list.add(new ParkingLot("P3",3));
        return new SmartParkMan(list);
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