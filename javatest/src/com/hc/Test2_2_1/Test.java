package com.hc.Test2_2_1;

public class Test {
    public static void main(String[] args) {
        Car c1 = new AudiCarFactory().createCar();
        Car c2 = new BenzCarFactory().createCar();
        System.out.println(c1);
        System.out.println(c2);
        c1.run();
        c2.run();
    }
}
