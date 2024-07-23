package observer;

import observer.observers.CurrentConditionDisplay;
import observer.subject.WeatherData;

public class WeatherStation {
  public static void main(String[] args) {
    WeatherData weatherData = new WeatherData();

    CurrentConditionDisplay currentDisplay = new CurrentConditionDisplay(weatherData);
    weatherData.setMeasurements(89, 34, 43.3f);
    weatherData.setMeasurements(90, 36, 42.6f);
    weatherData.setMeasurements(70, 38, 42.1f);
  }
}
