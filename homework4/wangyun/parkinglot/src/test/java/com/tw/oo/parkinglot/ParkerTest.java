package com.tw.oo.parkinglot;

import com.tw.oo.parkinglot.parker.Parker;
import org.junit.Before;
import org.junit.Test;

import static org.hamcrest.core.Is.is;
import static org.hamcrest.core.IsNull.notNullValue;
import static org.hamcrest.core.IsNull.nullValue;
import static org.junit.Assert.*;

/**
 * Created by yunwang on 12/11/15.
 */
public abstract class ParkerTest {

    protected Parker man;


    @Before
    public void setUp() throws Exception {
        man = getSpecificParker();
    }

    protected abstract Parker getSpecificParker();

    @Test
    public void parker在停车场都是空的时候可以将车停成功() {
        assertThat(man.parkCar(Car.newCar("C1")), notNullValue());
    }

    @Test
    public void parker在停车场都是满的时候会停车失败() {
        man.parkCar(Car.newCar("C1"));
        man.parkCar(Car.newCar("C2"));
        man.parkCar(Car.newCar("C3"));
        man.parkCar(Car.newCar("C4"));
        man.parkCar(Car.newCar("C5"));
        man.parkCar(Car.newCar("C6"));
        assertThat(man.parkCar(Car.newCar("C7")), nullValue());
    }

    @Test
    public void parker可以根据正确的凭证取车成功() {
        Car newCar = Car.newCar("C1");
        ParkingTicket ticket = man.parkCar(newCar);
        assertThat(man.unparkCar(ticket), is(newCar));
    }

    @Test
    public void parker可以根据错误凭证取车失败() {
        Car newCar = Car.newCar("C1");
        man.parkCar(newCar);
        assertThat(man.unparkCar(ParkingTicket.newInstance("test")), nullValue());
    }

}