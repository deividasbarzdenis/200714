package com.company.uzd2;

import java.util.Arrays;
import java.util.List;

public class Driver {
    private String name;
    private String car;
    private String plate;
    private int millage;

    public Driver(String name, String car, String plate, int millage) {
        this.name = name;
        this.car = car;
        this.plate = plate;
        this.millage = millage;
    }
    public String toLine(){
        return String.format("%s, %s, %s, %d", this.name, this.car, this.plate, this.millage);
    }
    public static List<Driver> divers(){
        return Arrays.asList(
                new Driver("John", "Mersedes Benz", "HPL479", 130000),
                new Driver("Jane", "Lexus", "KPL469", 100000),
                new Driver("Jacob", "Toyota", "ZPL379", 110000)
        );
    }
}
