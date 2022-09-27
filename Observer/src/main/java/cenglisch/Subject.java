package cenglisch;

import java.util.ArrayList;

abstract public class Subject {
    protected ArrayList<Observer> beobachter = new ArrayList<Observer>();

    protected boolean verfuegbar;

    protected String name;

    protected Subject meldeAn(Observer observer) {
        if (this.beobachter.contains(observer)) {
            return this;
        }
        this.beobachter.add(observer);
        return this;
    }

    protected Subject meldeAb(Observer observer) {
        if (!this.beobachter.contains(observer)) {
            return this;
        }
        this.beobachter.remove(observer);
        return this;
    }

    private void benachrichtigeAlle() {
        for (Observer observer : beobachter) {
            observer.aktualisiere();
        }
    }

    protected void setVerfuegbarkeit(boolean verfuegbar){
        this.verfuegbar = verfuegbar;
    }

    public abstract boolean isVerfuegbar();
}
