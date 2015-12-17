package com.tw.oo.parkinglot;

import com.tw.oo.parkinglot.parker.*;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by yunwang on 12/14/15.
 */
public class SuperParkingManagerTest extends ParkerTest {


    @Override
    protected Parker getSpecificParker() {

        ArrayList<Parker> parkers = new ArrayList<>();
        List<ParkingLot> list = new ArrayList<>();

        list.add(new ParkingLot("P1",1));
        list.add(new ParkingLot("P2",2));
        list.add(new ParkingLot("P3",3));
        parkers.add(new StupidParkMan(list));
        parkers.add(new SmartParkMan(list));
        parkers.add(new NormalParkMan(list));

        List<Parker> parkerManagers = new ArrayList<>();
        parkerManagers.add(new ParkingManager(parkers));
        parkerManagers.add(new ParkingManager(parkers));
        return new SuperParkingManager(parkerManagers);
    }
}