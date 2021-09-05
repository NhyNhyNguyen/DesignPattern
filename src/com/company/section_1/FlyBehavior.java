package com.company.section_1;

/**
 * Created by nhinty5 on 9/10/2021.
 */
public interface FlyBehavior {
    public void fly();
}

class FlyWithWings implements FlyBehavior{
    @Override
    public void fly() {
        System.out.println("I can fly");
    }
}

class FlyNoWay implements FlyBehavior{

    @Override
    public void fly() {
        System.out.println("I can't fly");
    }
}

