package cenglisch.Responsibities;

import cenglisch.AbstractHandler;
import cenglisch.Einkauf;
import cenglisch.Ware;

public class Baeker extends AbstractHandler {

    @Override
    public void verkaufen(Einkauf einkauf) {
        if (einkauf.getWare() != Ware.BROT) {
            return;
        }
        if (!wareIstVorraetig()) {
            return;
        }
        einkauf.verkaufeWaren();
        if (einkauf.willNochMehr()) {
            this.verkaufen(einkauf);
        }
        this.weiterleiten(einkauf);
    }

    private boolean wareIstVorraetig() {
        double zahl = Math.random() * 10;
        return zahl >= 4;
    }
}
