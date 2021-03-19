package com.company;

import java.util.Arrays;

public class Dog {
    private String name;
    private Owner owner;
    private boolean isHungry = true;
    private OffSpring[] offSpring;
    private int maxOffspring = 6;

    public Dog(String name, boolean isHungry) {
        this.name = name;
        this.owner = new Owner();
        this.isHungry = isHungry;
        offSpring = new OffSpring[maxOffspring];
        for (int i = 0; i < offSpring.length; i++) {
            offSpring[i] = new OffSpring("FREE");
        }
    }

    public String getOwner() {
        return owner.getName();
    }

    public void setOwner(String owner) {
        this.owner.setName(owner);
    }


    public String feedDog() {
        isHungry = false;
        return name + " has been feeded by " + owner.getName();
    }

    public OffSpring[] getOffSpring() {
        return offSpring;
    }

    public void setOffSpring(String name) {
        for (int i = 0; i < offSpring.length; i++) {
            if (offSpring[i].getName().equals("FREE")) {
                offSpring[i].setName(name);
                break;
            }
        }
    }


}
