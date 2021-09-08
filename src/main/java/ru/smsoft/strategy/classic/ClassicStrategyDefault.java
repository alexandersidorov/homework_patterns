package ru.smsoft.strategy.classic;

public class ClassicStrategyDefault implements BaseStrategy {
    @Override
    public void compute() {
        System.out.println("I'm default realization");
    }
}
