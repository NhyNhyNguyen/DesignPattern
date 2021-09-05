package com.company.session_2;

/**
 * Created by nhinty5 on 9/5/2021.
 */
public interface Subject {

    void addObserver(Observer o);
    void removeObserver(Observer o);
    void notifyObserver();
}

