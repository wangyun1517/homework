package com.tw.oo.parkinglot.parker;

import com.tw.oo.parkinglot.ParkingLot;
import com.tw.oo.parkinglot.parker.ParkMan;

import java.util.List;
import java.util.Optional;

/**
 * Created by yunwang on 12/11/15.
 */
public class StupidParkMan extends ParkMan {

    public StupidParkMan(List<ParkingLot> list) {
        super(list);
    }

    @Override
    protected Optional<ParkingLot> findAvailableParkingLot(List<ParkingLot> parkingLotList) {
        for (ParkingLot p : parkingLotList) {
            if (!p.isFull()) {
                return Optional.of(p);
            }
        }
        return Optional.empty();
    }
}
