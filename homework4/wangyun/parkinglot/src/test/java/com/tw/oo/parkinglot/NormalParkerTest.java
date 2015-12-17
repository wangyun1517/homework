package com.tw.oo.parkinglot;

import com.tw.oo.parkinglot.parker.NormalParkMan;
import com.tw.oo.parkinglot.parker.Parker;
import org.junit.Test;

import java.util.ArrayList;
import java.util.List;

import static org.hamcrest.core.Is.is;
import static org.junit.Assert.*;

/**
 * Created by yunwang on 12/11/15.
 */
public class NormalParkerTest extends ParkerTest {

    @Override
    protected Parker getSpecificParker() {
        List<ParkingLot> list = new ArrayList<>();
        list.add(new ParkingLot("P1",1));
        list.add(new ParkingLot("P2",2));
        list.add(new ParkingLot("P3",3));
        return new NormalParkMan(list);
    }

    @Test
    public void 停车小弟会将车优先停到空位最多的停车场里(){
        assertThat(man.parkCar(Car.newCar("C1")).getParkingLotName(), is("P3"));
    }
}