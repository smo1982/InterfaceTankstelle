package com.company;

public class Main {

    public static void main(String[] args) {
	    Person driver = new Person("Hans", "Feldkirch");
	    Car ecar = new Car("Tesla", driver, Fueltypes.POWER);

	   	FuelStation agip = new FuelStation("Agip", "Dornbirn");
	    agip.addFuel(Fueltypes.PETROL);
	   	driver.addStation(agip);

	    FuelStation shell = new FuelStation("Shell", "Feldkirch");
	    shell.addFuel(Fueltypes.DIESEL);
	    driver.addStation(shell);

	    FuelStation vkw = new FuelStation("VKW", "Bregenz");
	    vkw.addFuel(Fueltypes.POWER);
	    driver.addStation(vkw);

	    FuelStation omv = new FuelStation("OMV", "Bludenz");
	    omv.addFuel(Fueltypes.GAS);
	    driver.addStation(omv);

	    driver.checkFuelType();

		Car car = new Car("Audi", driver, Fueltypes.DIESEL);

		driver.checkFuelType();

		Car gascar = new Car("Opel", driver, Fueltypes.GAS);

		driver.checkFuelType();









    }
}
