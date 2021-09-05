package com.company.section_1;

/**
 * Created by nhinty5 on 9/10/2021.
 */
public abstract class Duck {
    FlyBehavior flyBehavior;
    QuackBehavior quackBehavior;

    public Duck() {
    }

    public Duck(FlyBehavior flyBehavior, QuackBehavior quackBehavior) {
        this.flyBehavior = flyBehavior;
        this.quackBehavior = quackBehavior;
    }

    public void display(){
        System.out.println("I am " + this.getClass().getName());
        flyBehavior.fly();
        quackBehavior.quack();
    }

    public FlyBehavior getFlyBehavior(){
        return this.flyBehavior;
    }

    public void setFlyBehavior(FlyBehavior flyBehavior){
        this.flyBehavior = flyBehavior;
    }

    public QuackBehavior getQuackBehavior(){
        return this.quackBehavior;
    }

    public void setQuackBehavior(QuackBehavior quackBehavior){
        this.quackBehavior = quackBehavior;
    }
}

class YellowDuck extends Duck{

    public YellowDuck() {
    }

    public YellowDuck(FlyBehavior flyBehavior, QuackBehavior quackBehavior) {
        super(flyBehavior, quackBehavior);
    }
}

