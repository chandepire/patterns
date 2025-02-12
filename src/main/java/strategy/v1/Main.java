package v1;

public class Main {
    public static void main(String[] args) {
        Duck duck1 = new MallardDuck();
        Duck duck2 = new RedheadDuck();
        Duck duck3 = new RubberDuck();
        duck1.presentyourself();
        duck2.presentyourself();
        duck3.presentyourself();
    }
}
