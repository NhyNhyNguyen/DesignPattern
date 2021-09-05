package com.company.session_2;

/**
 * Created by nhinty5 on 9/5/2021.
 */
public class CurrentConditionDisplay implements Observer, Display{
    private int temperature;
    private int humidity;

    private WeatherData weatherData;

    public CurrentConditionDisplay(WeatherData weatherData) {
        this.weatherData = weatherData;
    }

    @Override
    public void display() {
        System.out.println(this.getClass().getName() + ": temperature = " + this.temperature + " humidity: " + this.humidity);
    }

    @Override
    public void update() {
        this.humidity = weatherData.getHumidity();
        this.temperature = this.weatherData.getTemperature();
        display();
    }

    @Override
    public Subject getSubject() {
        return weatherData;
    }
}

