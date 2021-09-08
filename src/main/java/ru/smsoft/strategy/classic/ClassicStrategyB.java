package ru.smsoft.strategy.classic;

public class ClassicStrategyB implements BaseStrategy {
    @Override
    public void compute() {
        System.out.println("I'm classic strategy B");
    }
}
