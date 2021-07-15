import java.util.ArrayList;
import java.util.List;

public class COMPX202Observable {
    List<COMPX202Observer> observers;   // List of observers

    public COMPX202Observable() {       // Constructor
        observers = new ArrayList<COMPX202Observer>();
    }

    public synchronized void addObserver(COMPX202Observer obs) {
        observers.add(obs);
    }

    public synchronized void deleteObserver(COMPX202Observer obs) {
        observers.remove(obs);
    }

    protected void notifyObservers(COMPX202Observable target) {
        for (COMPX202Observer obs : observers) {
            obs.update(target);
        }
    }
}
