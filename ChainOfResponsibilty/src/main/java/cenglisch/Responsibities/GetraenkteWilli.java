package cenglisch.Responsibities;

import cenglisch.AbstractHandler;
import cenglisch.Einkauf;
import cenglisch.Ware;

public class GetraenkteWilli extends AbstractHandler {
    public void verkaufen(Einkauf einkauf) {
        if (einkauf.getWare() != Ware.BIER){
            return;
        }
        if (!wareIstVorraetig()){
            return;
        }
        einkauf.verkaufeWaren();
        if(einkauf.willNochMehr()) {
            this.verkaufen(einkauf);
        }
        this.weiterleiten(einkauf);
    }

    private boolean wareIstVorraetig(){
        double zahl = Math.random() * 10;
        return zahl >= 4;
    }
}
