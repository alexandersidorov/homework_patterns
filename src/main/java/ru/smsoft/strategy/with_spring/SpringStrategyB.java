package ru.smsoft.strategy.with_spring;

import org.springframework.stereotype.Component;
import ru.smsoft.strategy.classic.BaseStrategy;

@Component
public class SpringStrategyB implements BaseStrategy {
    @Override
    public void compute() {
        System.out.println("I'm spring strategy B!");
    }
}
