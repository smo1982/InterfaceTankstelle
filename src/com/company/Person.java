package com.company;

public class Person implements ICheckFuelStation{
    private String name;
    FuelStation[] stations;
    private int stationsCounter = 0;
    Car car;
    String position;

    public Person(String name, String position) {
        this.name = name;
        this.stations = new FuelStation[4];
        this.position = position;
    }

    public void addStation(FuelStation fuelStation) {
        stations[stationsCounter] = fuelStation;
        stationsCounter++;
    }

    @Override
    public void checkFuelType() {
        for (int i = 0; i < stations.length; i++) {
            if (stations[i] != null) {
                for (int j = 0; j < stations[i].fueltypes.length; j++) {
                    if (this.car.fuel.equals(stations[i].fueltypes[j])) {
                        goRefuel(stations[i]);
                        break;
                    }
                }
            } else {
                break;
            }
        }
    }

    @Override
    public void goRefuel(FuelStation fuelStation) {
        String text = "";
        text += fuelStation.name + "\tfuel is full ;-)";
        System.out.println(text);

    }
}
