package observer.v1;

public class ForecastDisplay {
    public void update(float temp,
                       float humidity,
                       float pressure) {
        System.out.println("ForecastDisplay shows");
        System.out.println(String.format("temp: %f, humidity: %f," +
                "pressure: %f", temp, humidity, pressure));
    }
}
