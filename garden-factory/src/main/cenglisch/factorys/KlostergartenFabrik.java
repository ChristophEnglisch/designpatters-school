package main.cenglisch.factorys;

import main.cenglisch.GartenFabrik;
import main.cenglisch.elemente.Einfriedung;
import main.cenglisch.elemente.EinfriedungsArten;
import main.cenglisch.elemente.Hecke;
import main.cenglisch.elemente.Steinmauer;
import main.cenglisch.pflanzen.Heilkraut;
import main.cenglisch.pflanzen.Pflanze;
import main.cenglisch.pflanzen.PflanzenArten;
import main.cenglisch.pflanzen.Rose;

public class KlostergartenFabrik implements GartenFabrik {
    public static Einfriedung createEinfriedung(EinfriedungsArten einfriedungsArten) {
        switch (einfriedungsArten){
            case Hecke:
                return new Hecke();
            case Steinmauer:
                return new Steinmauer();
        }
        throw new RuntimeException("Objekt konnte nicht erzeugt werden");
    }

    public static Pflanze createPflanzen(PflanzenArten pflanzenArten) {
        switch (pflanzenArten){
            case Rose:
                return new Rose();
            case Heilkraut:
                return new Heilkraut();
        }
        throw new RuntimeException("Objekt konnte nicht erzeugt werden");
    }
}
