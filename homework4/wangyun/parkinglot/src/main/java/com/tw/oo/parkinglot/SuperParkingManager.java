package com.tw.oo.parkinglot;

import com.tw.oo.parkinglot.parker.Parker;
import com.tw.oo.parkinglot.parker.ParkingManager;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by yunwang on 12/14/15.
 */
public class SuperParkingManager extends ParkingManager {
    public SuperParkingManager(List<Parker> parkers) {
        super(parkers);
    }
}
