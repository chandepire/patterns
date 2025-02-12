package observer.v1;

public class CurrentConditionDisplay {
    public void update(float temp,
                       float humidity,
                       float pressure) {
        System.out.println("CurrentConditionDisplay shows");
        System.out.println(String.format("temp: %f, humidity: %f," +
                "pressure: %f", temp, humidity, pressure));
    }
}
