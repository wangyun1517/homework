package com.tw.oo.parkinglot;

import java.util.UUID;

/**
 * Created by yunwang on 12/11/15.
 */
public class ParkingTicket {

    private String name;
    private String uuid;

    private ParkingTicket(String name) {
        this.name = name;
        this.uuid = UUID.randomUUID().toString();
    }

    @Override
    public boolean equals(Object o) {
        if (o instanceof ParkingTicket) {
            ParkingTicket that = (ParkingTicket) o;
            return uuid.equals(that.uuid);
        }
        return false;
    }

    @Override
    public int hashCode() {
        return uuid.hashCode();
    }

    public static ParkingTicket newInstance(String name) {
        return new ParkingTicket(name);
    }

    public String getParkingLotName() {
        return name;
    }
}
