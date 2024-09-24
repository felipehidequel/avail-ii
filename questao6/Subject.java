import java.util.ArrayList;

public class Subject {
    private ArrayList<Observer> observers;

    public Subject(){
        observers = new ArrayList<>();
    }

    public void action(){
        System.out.println("Ação qualquer");
        this.notifyObservers();
    }

    public void addObserver(Observer o){
        observers.add(o);
    }

    public void notifyObservers(){
        for (Observer o : observers) {
            o.update(this);
        }
    }
}
