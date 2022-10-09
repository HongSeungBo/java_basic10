package com.spring.oop.poly;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class DriverTest {

    @Test
    void dTest() {

        Driver d = new Driver();
        Car car = d.buyCar(3000);

        System.out.println("car = " + car);
        System.out.println(car instanceof  Avante);

        car.run();
    }
}