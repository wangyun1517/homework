package com.tw.oo.parkinglot;

import com.tw.oo.parkinglot.parker.Parker;
import com.tw.oo.parkinglot.parker.StupidParkMan;
import org.junit.Test;

import java.util.ArrayList;
import java.util.List;

import static org.hamcrest.core.Is.is;
import static org.hamcrest.core.IsNull.nullValue;
import static org.junit.Assert.*;

/**
 * Created by yunwang on 12/11/15.
 */
public class StupidParkerTest extends ParkerTest {

    @Test
    public void 停车小弟会将车停到第一个没有停满的停车场() {
        assertThat(man.parkCar(Car.newCar("C1")).getParkingLotName(), is("P1"));
        assertThat(man.parkCar(Car.newCar("C2")).getParkingLotName(), is("P2"));
    }


    @Override
    protected Parker getSpecificParker() {
        List<ParkingLot> list = new ArrayList<>();
        list.add(new ParkingLot("P1",1));
        list.add(new ParkingLot("P2",2));
        list.add(new ParkingLot("P3",3));
        return new StupidParkMan(list);
    }
}