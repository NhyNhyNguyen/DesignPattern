package com.company.section_3;

public abstract class OldBeverage {
    private boolean soy;
    private boolean milk;
    private boolean mocha;

    public boolean isSoy() {
        return soy;
    }

    public void setSoy(boolean soy) {
        this.soy = soy;
    }

    public boolean isMilk() {
        return milk;
    }

    public void setMilk(boolean milk) {
        this.milk = milk;
    }

    public boolean isMocha() {
        return mocha;
    }

    public void setMocha(boolean mocha) {
        this.mocha = mocha;
    }

    public double getCost() {
        return (isSoy() ? 1 : 0) + (isMilk() ? 2 : 0) + (isMocha() ? 3 : 0);
    }

    public String getDescription() {
        return (isSoy() ? ", soy" : "") + (isMilk() ? ", milk" : "") + (isMocha() ? ", mocha" : "");
    }
}

class OldHouseBlend extends OldBeverage {
    @Override
    public double getCost() {
        return 1.5 + super.getCost();
    }

    @Override
    public String getDescription() {
        return this.getClass().getName() + super.getDescription();
    }
}

class Test {
    public static void main(String[] args) {
        OldBeverage beverage = new OldHouseBlend();
        System.out.println(beverage.getCost() + " " + beverage.getDescription());
        beverage.setMilk(true);
        beverage.setMocha(true);
        System.out.println(beverage.getCost() + " " + beverage.getDescription());
    }

}
