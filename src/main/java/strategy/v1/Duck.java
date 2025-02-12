package v1;

public abstract class Duck {
    public void quack() {
        System.out.println("i am is quacking");
    }

    public void swim() {
        System.out.println("i am is swimming");
    }

    public void fly() {
        System.out.println("i am is flying");
    }

    abstract public void display();

    public void presentyourself() {
        display();
        quack();
        swim();
        fly();
    }
}
