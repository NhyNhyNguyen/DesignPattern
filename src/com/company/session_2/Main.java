package com.company.session_2;

/**
 * Created by nhinty5 on 9/5/2021.
 */
public class Main {
    public static void main(String[] args) {
        WeatherData weatherData = new WeatherData();
        Observer conditionDisplay = new CurrentConditionDisplay(weatherData);
        Observer statisticWeatherDisplay = new StatisticWeatherDisplay(weatherData);
        weatherData.setData(11,1,12);
        weatherData.addObserver(conditionDisplay);
        weatherData.addObserver(statisticWeatherDisplay);
        weatherData.setData(12,1,112);
        conditionDisplay.getSubject().removeObserver(conditionDisplay);
        weatherData.setData(1,1,1);

    }
}

