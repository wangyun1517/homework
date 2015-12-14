package com.tw.oo.parkinglot;

import java.util.EnumSet;
import java.util.HashMap;
import java.util.Map;

/**
 * Created by yunwang on 12/10/15.
 */
public class Car {
    private static Map<String, Car> cache = new HashMap<>();

    private final String id;

    private Car(String id) {
        this.id = id;
    }

    public String getId() {
        return id;
    }

    public static Car newCar(String id) {
        Car car = cache.get(id);
        if (car == null) {
            car = new Car(id);
            cache.put(id, car);
        }
        return car;
    }
}
