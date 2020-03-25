package com.company;

public class FuelStation {
    String name;
    Fueltypes[] fueltypes;
    private int fuelcounter = 0;
    String position;

    public FuelStation(String name, String position;) {
        this.name = name;
        this.fueltypes = new Fueltypes[5];
        this.position = position;
    }

    public void addFuel(Fueltypes fuel) {
        fueltypes[fuelcounter] = fuel;
        fuelcounter++;
    }

}
