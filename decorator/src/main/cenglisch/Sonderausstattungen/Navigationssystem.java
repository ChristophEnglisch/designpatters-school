package main.cenglisch.Sonderausstattungen;

import main.cenglisch.Komponenten.Komponente;

public class Navigationssystem extends Sonderausstattung{

    public Navigationssystem(Komponente komponente) {
        super(komponente);
    }

    public double getPreis() {
        return this.komponente.getPreis() + 700;
    }

    public String getBezeichnung() {
        return "Navigationssytem ist angebracht";
    }
}
