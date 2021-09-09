package com.company.section_3;

public interface Beverage {
    double getCost();

    String getDescription();
}

abstract class CondimentDecorator implements Beverage{
    protected Beverage beverage;

    public CondimentDecorator(Beverage beverage) {
        this.beverage = beverage;
    }
}

class MochaDecorator extends CondimentDecorator{

    public MochaDecorator(Beverage beverage) {
        super(beverage);
    }

    @Override
    public double getCost() {
        return 1 + beverage.getCost();
    }

    @Override
    public String getDescription() {
        return beverage.getDescription() + " , mocha";
    }
}


class MilkDecorator extends CondimentDecorator{

    public MilkDecorator(Beverage beverage) {
        super(beverage);
    }

    @Override
    public double getCost() {
        return 1.2 + beverage.getCost();
    }

    @Override
    public String getDescription() {
        return beverage.getDescription() + " , milk";
    }
}

class HouseBlend implements Beverage{

    @Override
    public double getCost() {
        return 1;
    }

    @Override
    public String getDescription() {
        return "House blend";
    }
}

class Main{
    public static void main(String[] args) {
        Beverage beverage = new HouseBlend();
        beverage = new MilkDecorator(beverage);
        beverage = new MochaDecorator(beverage);
        beverage = new MilkDecorator(beverage);
        System.out.println("Price: " + beverage.getCost() + " usd "+ beverage.getDescription());
    }
}
