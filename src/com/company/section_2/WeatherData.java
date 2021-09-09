package com.company.section_2;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by nhinty5 on 9/5/2021.
 */
public class WeatherData implements Subject{
    private int temperature;
    private int humidity;
    private int pressure;
    private List<Observer> observerList;

    public WeatherData() {
        observerList = new ArrayList<>();
    }

    @Override
    public void addObserver(Observer o) {
        observerList.add(o);
    }

    @Override
    public void removeObserver(Observer o) {
        observerList.remove(o);
    }

    @Override
    public void notifyObserver() {
        for(Observer observer: observerList){
            observer.update();
        }
    }

    public void setTemperature(int temperature) {
        this.temperature = temperature;
        notifyObserver();
    }

    public void setHumidity(int humidity) {
        this.humidity = humidity;
        notifyObserver();
    }

    public void setPressure(int pressure) {
        this.pressure = pressure;
        notifyObserver();
    }

    public void setObserverList(List<Observer> observerList) {
        this.observerList = observerList;
    }

    public void setData(int temperature, int humidity, int pressure){
        this.temperature = temperature;
        this.humidity = humidity;
        this.pressure = pressure;
        notifyObserver();
    }

    public int getTemperature() {
        return temperature;
    }

    public int getHumidity() {
        return humidity;
    }

    public int getPressure() {
        return pressure;
    }

    public List<Observer> getObserverList() {
        return observerList;
    }
}

