package ru.smsoft.strategy.classic;

public class Client {

    private BaseStrategy strategy;

    private Client(){}
    private Client(BaseStrategy strategy){
        this.strategy = strategy;
    }

    public static Client createInstance(){
        return new Client(new ClassicStrategyDefault());
    }

    public void setStrategy(BaseStrategy strategy){
        this.strategy = strategy;
    }

    public void compute(){
        strategy.compute();
    }

}
