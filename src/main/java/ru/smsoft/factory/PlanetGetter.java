package ru.smsoft.factory;

import ru.smsoft.factory.planets.*;

import java.util.Optional;

public class PlanetGetter {
    public static Optional<Planet> getPlanet(int orderFromSun) {
        Optional<Planet> planet;
        switch (orderFromSun) {
            case 1 -> planet = Optional.of(new Mercury());
            case 2 -> planet = Optional.of(new Venera());
            case 3 -> planet = Optional.of(new Earth());
            case 4 -> planet = Optional.of(new Mars());
            case 5 -> planet = Optional.of(new Jupiter());
            case 6 -> planet = Optional.of(new Saturn());
            case 7 -> planet = Optional.of(new Uran());
            case 8 -> planet = Optional.of(new Neptune());
            case 9 -> planet = Optional.of(new Pluton());
            default -> planet = Optional.empty();
        }
        return planet;
    }
}
