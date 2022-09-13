package main.cenglisch.Sonderausstattungen;

import main.cenglisch.Komponenten.Komponente;

public class Lederausstattung extends Sonderausstattung{

    public Lederausstattung(Komponente komponente) {
        super(komponente);
    }

    public double getPreis() {
        return this.komponente.getPreis() + 1000;
    }

    public String getBezeichnung() {
        return "Lederausstattung in enthalten";
    }
}
