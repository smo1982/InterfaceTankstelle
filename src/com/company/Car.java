package com.company;

public class Car {
    String name;
    Person driver;
    Fueltypes fuel;

    public Car(String name, Person driver, Fueltypes fuel) {
        this.name = name;
        this.driver = driver;
        this.fuel = fuel;
       driver.car = this;
    }

}
