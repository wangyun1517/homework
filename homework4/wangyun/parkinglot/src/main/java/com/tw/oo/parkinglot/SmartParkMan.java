package com.tw.oo.parkinglot;

import java.util.Collections;

/**
 * Created by yunwang on 12/11/15.
 */
public class SmartParkMan extends ParkMan {

    @Override
    protected void sortParkingLot() {
        Collections.sort(parkingLotList, (p1, p2) -> {
            return p2.getRestParkPercent() - p1.getRestParkPercent();
        });
    }
}
