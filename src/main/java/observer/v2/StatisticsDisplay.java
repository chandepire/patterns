package observer.v2;

public class StatisticsDisplay implements Observer, DisplayElement {
    private float temp;
    private float humidity;
    private Subject subject;

    public StatisticsDisplay(Subject subject) {
        this.subject = subject;
        subject.registerOberver(this);
    }

    public void display() {
        System.out.println("Statistic conditions: " + temp
                + "F degrees and " + humidity + "% humidity");
    }

    public void update(float temp, float humidity, float pressure) {
        this.temp = temp;
        this.humidity = humidity;
        display();
    }
}
