package v2;

public abstract class Duck {
    FlyBehavior flyBehavior;
    QuarkBehavior quarkBehavior;

    public void Duck(){}

    public abstract void display();

    public void performFly() {
        flyBehavior.fly();
    }

    public void performQuark() {
        quarkBehavior.quark();
    }

    public void swim() {
        System.out.println("All ducks float, even decoys");
    }

    public void setFlyBehavior(FlyBehavior fb) {
        flyBehavior = fb;
    }

    public void setQuarkBehavior(QuarkBehavior qb) {
        quarkBehavior = qb;
    }
}
