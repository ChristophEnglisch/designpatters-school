package main.cenglisch.Sonderausstattungen;

import main.cenglisch.Komponenten.Komponente;

public class Klimanalage extends Sonderausstattung{

    public Klimanalage(Komponente komponente) {
        super(komponente);
    }

    public double getPreis() {
        return this.komponente.getPreis() + 500;
    }

    public String getBezeichnung() {
        return "Klimaanlage wurde eingebaut";
    }
}
