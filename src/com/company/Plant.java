package com.company;

public class Plant {

    //Grow using the days in the ground to change the height: height += days / 2

    int apples;
    int bananas;
    int grapes;
    int cherries;
    int watermelon;
    String name;
    Double height;
    int spacing;
    int numFruits;

    public Plant(String n, Double h, int s) {

    name = n;
    height = h;
    spacing = s;
    }

    int day;

    public void growPlant(int d) {

    day = d;
    height += day * 0.25;
    }

    //Produce using the height to change the number of fruits: fruits += height * 2

    public void growFruit(int d) {

        day = d;
        apples += day/2;
        bananas += day/2;
        cherries += day * 4;
        grapes += day * 3;
        watermelon = day/4;
    }

    //Harvest return the number of fruits and set the number of fruits to zero

    public void showFruit() {

        System.out.println("---------------");
        System.out.println("Fruit Status");
        System.out.println("---------------");
        System.out.println("Apples: " + apples);
        System.out.println("Bananas: " + bananas);
        System.out.println("Cherries: " + cherries);
        System.out.println("Grapes: " + grapes);
        System.out.println("Watermelon: " + watermelon);
        System.out.println("");

    }

    public void showPlant() {

        numFruits = apples+bananas+cherries+grapes+watermelon;

        System.out.println("---------------");
        System.out.println("Plant Status");
        System.out.println("---------------");
        System.out.println("Name: " + name);
        System.out.println("Height: " + height + " ft");
        System.out.println("Spacing: " + spacing + " in");
        System.out.println("Number of Fruits: " + numFruits);
        System.out.println("");

    }

}
