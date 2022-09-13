package main.cenglisch.Sonderausstattungen;

import main.cenglisch.Komponenten.Komponente;

public abstract class Sonderausstattung implements Komponente {
    protected final Komponente komponente;

    public Sonderausstattung(Komponente komponente) {
        this.komponente = komponente;
    }


}
