package com.codurance.lsp;

import org.junit.Test;

import static org.junit.Assert.*;

public class VehicleShould {
  @Test
  public void start_engine() {
    Vehicle vehicle = new TestableVehicle();

    vehicle.startEngine();

    assertTrue(vehicle.engineIsStarted());
  }

  @Test
  public void stop_engine() {
    Vehicle vehicle = new TestableVehicle();

    vehicle.startEngine();
    vehicle.stopEngine();

    assertFalse(vehicle.engineIsStarted());
  }

  public static class TestableVehicle extends Vehicle {
    public void fill() {
    }
  }
}