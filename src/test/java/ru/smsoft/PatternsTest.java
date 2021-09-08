package ru.smsoft;

import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import ru.smsoft.factory.PlanetGetter;
import ru.smsoft.factory.planets.Planet;
import ru.smsoft.singleton_multithread.MySingleton;
import ru.smsoft.strategy.classic.*;
import ru.smsoft.strategy.with_enum.EnumStrategy;
import ru.smsoft.strategy.with_spring.StrategyService;

import java.util.Optional;
import java.util.stream.IntStream;

import static org.junit.jupiter.api.Assertions.assertSame;

@SpringBootTest
class PatternsTest {

    @Autowired
    StrategyService service;

    @Test
    void singletonTest() {
        MySingleton obj1 = MySingleton.getInstance();
        MySingleton obj2 = MySingleton.getInstance();
        assertSame(obj1, obj2);
    }

    @Test
    void factoryTest() {
        IntStream.range(1,10).forEach(i->{
            Optional<Planet> planet = PlanetGetter.getPlanet(i);
            planet.ifPresent(Planet::printPlanetName);
        });
    }

    @Test
    void enumStrategyTest() {
        EnumStrategy.STRATEGY_A.strategy();
        EnumStrategy.STRATEGY_B.strategy();
        EnumStrategy.STRATEGY_C.strategy();
    }

    @Test
    void classicStrategyTest() {
        Client client = Client.createInstance();
        client.compute();

        BaseStrategy strategyA = new ClassicStrategyA();
        client.setStrategy(strategyA);
        client.compute();

        BaseStrategy strategyB = new ClassicStrategyB();
        client.setStrategy(strategyB);
        client.compute();

        BaseStrategy strategyC = new ClassicStrategyC();
        client.setStrategy(strategyC);
        client.compute();
    }

    @Test
    void springStrategyTest() {
        service.compute("springStrategyA");
        service.compute("springStrategyB");
        service.compute("springStrategyC");
        service.compute("noNameSpringStrategy");
    }
}


