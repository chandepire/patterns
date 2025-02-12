package observer.v2;


public class Main {
    public static void main(String[] args) {
        Duck duck = new MallardDuck();
        duck.performFly();
        duck.performQuark();

        Duck duck2 = new ModelDuck();
        duck2.performFly();
        duck2.performQuark();
        duck2.setFlyBehavior(new FlyRocketPowered());
        duck2.performFly();
    }
}
