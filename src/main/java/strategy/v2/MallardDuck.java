package observer.v2;

public class MallardDuck extends Duck {
    public MallardDuck() {
        quarkBehavior = new Quark();
        flyBehavior = new FlyWithWings();
    }

    public void display() {
        System.out.println("I am a real Mallard duck");
    }
}
