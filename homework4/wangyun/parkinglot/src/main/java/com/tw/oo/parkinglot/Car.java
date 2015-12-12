package com.tw.oo.parkinglot;

/**
 * Created by yunwang on 12/10/15.
 */
public class Car {
    private String id;

    private Car(String id) {
        this.id = id;
    }

    public String getId() {
        return id;
    }

    public static Car newCar(String id){
        return new Car(id);
    }
}
