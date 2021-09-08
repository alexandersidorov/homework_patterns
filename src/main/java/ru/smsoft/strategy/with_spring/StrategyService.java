package ru.smsoft.strategy.with_spring;

import lombok.AllArgsConstructor;
import org.springframework.stereotype.Service;
import ru.smsoft.strategy.classic.BaseStrategy;

import java.util.Map;

@Service
@AllArgsConstructor
public class StrategyService {

    private final Map<String, BaseStrategy> strategies;

    public void compute(String strategyName){
        if(strategies.containsKey(strategyName))
            strategies.get(strategyName).compute();
        else System.out.println(strategyName+" not found !");
    }
}
