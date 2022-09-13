package test;

import junit.framework.TestCase;
import main.cenglisch.Komponenten.GehobeneklasseWagen;
import main.cenglisch.Komponenten.Komponente;
import main.cenglisch.Sonderausstattungen.Klimanalage;
import main.cenglisch.Sonderausstattungen.Lederausstattung;

public class KomponentenTest extends TestCase {

    public void testDecorator() {
        Komponente wagen = new Lederausstattung(new Klimanalage(new GehobeneklasseWagen()));
        assertEquals(51500.0, wagen.getPreis());
    }
}
