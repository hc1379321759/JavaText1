package com.hc.Test2_2_1;

public class BenzCarFactory implements CarFactory {
    @Override
    public Car createCar() {
        return new Benz();
    }
}
