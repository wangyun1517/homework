package com.tw.oo.parkinglot;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

/**
 * Created by yunwang on 12/11/15.
 */
public class StupidParkMan extends ParkMan {

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
