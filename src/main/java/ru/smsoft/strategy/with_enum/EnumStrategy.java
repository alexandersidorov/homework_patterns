package ru.smsoft.strategy.with_enum;

public enum EnumStrategy {
    STRATEGY_A{
        @Override
        public void strategy() {
            System.out.println("Algorithm from STRATEGY_A");
        }
    },

    STRATEGY_B{
        @Override
        public void strategy() {
            System.out.println("Algorithm from STRATEGY_B");
        }
    },

    STRATEGY_C{
        @Override
        public void strategy() {
            System.out.println("Algorithm from STRATEGY_C");
        }
    };

    abstract public void strategy();
}
