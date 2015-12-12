package com.tw.oo.parkinglot;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

/**
 * Created by yunwang on 12/11/15.
 */
public class NormalParkMan extends ParkMan {

    @Override
    protected void sortParkingLot() {
        Collections.sort(parkingLotList, (p1, p2) -> {
            return p2.getRestParkNum() - p1.getRestParkNum();
        });
    }
}
