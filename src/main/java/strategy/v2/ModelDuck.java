package observer.v2;

public class ModelDuck extends Duck {
    public ModelDuck() {
        flyBehavior = new FlyNoWay();
        quarkBehavior = new Quark();
    }

    public void display() {
        System.out.println("I am a model duck");
    }
}
