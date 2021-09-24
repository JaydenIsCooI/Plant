package com.company;

public class Main {

    public static void main(String[] args) {

        Plant Plant = new Plant("Jerry", 5.0, 10);

        Plant.showPlant();

        Plant.growPlant(10);

        Plant.showPlant();

        Plant.showFruit();

        Plant.growFruit(20);

        Plant.showFruit();

        Plant.showPlant();

    }
}
