package observer.v2;

public interface Subject {
    public void registerOberver(Observer o);
    public void removeObserver(Observer o);
    public void notifyObservers();
}
