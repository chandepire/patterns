package observer.v1;

public class WeatherData {

    private float temperature;
    private float humidity;
    private float pressure;

    public void setTemperature(float temperature) {
        this.temperature = temperature;
    }

    public void setHumidity(float humidity) {
        this.humidity = humidity;
    }

    public void setPressure(float pressure) {
        this.pressure = pressure;
    }

    public float getTemperature() {
        return temperature;
    }

    public float getHumidity() {
        return humidity;
    }

    public float getPressure() {
        return pressure;
    }

    private CurrentConditionDisplay currentConditionDisplay;
    private ForecastDisplay forecastDisplay;
    private StatisticsDisplay statisticsDisplay;

    public WeatherData(CurrentConditionDisplay currentConditionDisplay, ForecastDisplay forecastDisplay, StatisticsDisplay statisticsDisplay) {
        this.currentConditionDisplay = currentConditionDisplay;
        this.forecastDisplay = forecastDisplay;
        this.statisticsDisplay = statisticsDisplay;
    }

    public void measurementsChanged() {
        float temp = getTemperature();
        float humidity = getHumidity();
        float pressure = getPressure();

        currentConditionDisplay.update(temp, humidity, pressure);
        statisticsDisplay.update(temp, humidity, pressure);
        forecastDisplay.update(temp, humidity, pressure);
    }
}
