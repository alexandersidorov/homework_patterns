package ru.smsoft.strategy.classic;

public class ClassicStrategyA implements BaseStrategy {
    @Override
    public void compute() {
        System.out.println("I'm classic strategy A");
    }
}
