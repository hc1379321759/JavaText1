package com.hc.Test2_2_1;

public class AudiCarFactory implements CarFactory {
    @Override
    public Car createCar() {
        return new Audi();
    }
}
