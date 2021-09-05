package com.company.section_1;

/**
 * Created by nhinty5 on 9/10/2021.
 */
public interface QuackBehavior {
    public void quack();
}

class Quack implements QuackBehavior{

    @Override
    public void quack() {
        System.out.println("Quack quack");
    }
}

class MuteQuack implements QuackBehavior{

    @Override
    public void quack() {
        System.out.println("nothing");
    }
}

