package observer.v1;

public class StatisticsDisplay {
    public void update(float temp,
                       float humidity,
                       float pressure) {
        System.out.println("StatisticsDisplay shows");
        System.out.println(String.format("temp: %f, humidity: %f," +
                "pressure: %f", temp, humidity, pressure));
    }
}
