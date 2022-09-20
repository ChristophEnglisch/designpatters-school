package cenglisch.Responsibities;

import cenglisch.AbstractHandler;
import cenglisch.Einkauf;
import cenglisch.Ware;

public class BioHofladen extends AbstractHandler {
    public void verkaufen(Einkauf einkauf) {
        if (einkauf.getWare() != Ware.EIER || einkauf.getWare() != Ware.WURST || einkauf.getWare() != Ware.KAESE){
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
