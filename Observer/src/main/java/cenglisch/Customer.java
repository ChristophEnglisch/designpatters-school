package cenglisch;

import java.util.ArrayList;

public class Customer implements Observer {
    private final String name;

    public Customer(String name){
        this.name = name;
    }
    private ArrayList<Subject> warteAufWare = new ArrayList<Subject>();
    public void aktualisiere() {
        this.statusBegehrteWare();
    }

    private void statusBegehrteWare(){
        for (Subject ware:warteAufWare) {
            if(ware.isVerfuegbar()){
                System.out.println("Ware "+ this.name + " " +ware.name  +" ab sofort im Online-Shop verfügbar.");
            }
        }
    }

    public Customer aufWunschliste(Subject subject) {
        if (this.warteAufWare.contains(subject)) {
            return this;
        }
        this.warteAufWare.add(subject);
        return this;
    }

    public Customer runterVonWunschliste(Subject subject) {
        if (!this.warteAufWare.contains(subject)) {
            return this;
        }
        this.warteAufWare.remove(subject);
        return this;
    }
}
