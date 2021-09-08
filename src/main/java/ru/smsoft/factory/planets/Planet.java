package ru.smsoft.factory.planets;

public abstract class Planet {

    public void printPlanetName(){
        System.out.println(getPlanetName());
    }
    public abstract String getPlanetName();
}
