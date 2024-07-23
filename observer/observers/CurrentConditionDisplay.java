package observer.observers;

import observer.interfaces.DisplayElement;
import observer.interfaces.Observer;
import observer.subject.WeatherData;

/** CurrentConditionDisplay */
public class CurrentConditionDisplay implements Observer, DisplayElement {
  private float temperature;
  private float humidity;
  private float pressure;
  private WeatherData weatherData;

  public CurrentConditionDisplay(WeatherData weatherData) {
    this.weatherData = weatherData;
    weatherData.registerObserver(this);
  }

  @Override
  public void display() {
    System.out.println(
        "Current conditons: "
            + temperature
            + "F degrees and "
            + humidity
            + "% humidity"
            + " pressure is "
            + this.pressure);
  }

  @Override
  public void update() {
    this.temperature = weatherData.getTemperature();
    this.humidity = weatherData.getHumidity();
    this.pressure = weatherData.getPressure();
    display();
  }
}
