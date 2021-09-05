package com.company.session_2;

/**
 * Created by nhinty5 on 9/5/2021.
 */
public class StatisticWeatherDisplay implements Observer, Display{
    private int temperature;
    private int pressure;

    private WeatherData weatherData;

    public StatisticWeatherDisplay(WeatherData weatherData) {
        this.weatherData = weatherData;
    }

    @Override
    public void display() {
        System.out.println(this.getClass().getName() + ": temperature = " + this.temperature + " pressure: " + this.pressure);
    }

    @Override
    public void update() {
        this.pressure = weatherData.getPressure();
        this.temperature = this.weatherData.getTemperature();
        display();
    }

    @Override
    public Subject getSubject() {
        return weatherData;
    }
}

