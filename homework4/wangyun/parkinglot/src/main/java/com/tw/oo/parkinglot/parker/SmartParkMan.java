package com.tw.oo.parkinglot.parker;

import com.tw.oo.parkinglot.ParkingLot;
import com.tw.oo.parkinglot.parker.ParkMan;

import java.util.Collections;
import java.util.List;
import java.util.Optional;

/**
 * Created by yunwang on 12/11/15.
 */
public class SmartParkMan extends ParkMan {


    public SmartParkMan(List<ParkingLot> list) {
        super(list);
    }

    @Override
    protected Optional<ParkingLot> findAvailableParkingLot(List<ParkingLot> parkingLotList) {

        Collections.sort(parkingLotList, (p1, p2) -> p2.getRestParkPercent().compareTo(p1.getRestParkPercent()));
        return Optional.of(parkingLotList.get(0));
    }
}
