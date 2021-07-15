import java.util.ArrayList;
import java.util.List;

public class Observable {
    List<Observer> observers;   // List of observers

    public Observable() {       // Constructor
        observers = new ArrayList<Observer>();
    }

    public synchronized void addObserver(Observer obs) {
        observers.add(obs);
    }

    public synchronized void deleteObserver(Observer obs) {
        observers.remove(obs);
    }

    protected void notifyObservers(Observable target) {
        for (Observer obs : observers) {
            obs.update(target);
        }
    }
}
