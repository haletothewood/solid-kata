package com.codurance.lsp;

import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class FillingStationShould {

    private static final int FULL = 100;
    private final FillingStation fillingStation = new FillingStation();

    @Test
    public void refuel_a_petrol_car() {
        PetrolCar car = new PetrolCar();

        fillingStation.fill(car);

        assertEquals(FULL, car.fuelTankLevel());
    }

    @Test
    public void recharge_an_electric_car() {
        ElectricCar car = new ElectricCar();

        fillingStation.fill(car);

        assertEquals(FULL, car.batteryLevel());
    }
}
