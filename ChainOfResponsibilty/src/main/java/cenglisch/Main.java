package cenglisch;

import cenglisch.Responsibities.Baeker;
import cenglisch.Responsibities.BierBrunnen;
import cenglisch.Responsibities.GetraenkteWilli;

public class Main {
    public static void main(String[] args){
        Einkauf einkauf = new Einkauf(Ware.BIER, 4);

        Baeker baeker = new Baeker();
        BierBrunnen bierBrunnen = new BierBrunnen();
        GetraenkteWilli getraenkteWilli = new GetraenkteWilli();

        baeker.setNext(
                bierBrunnen.setNext(
                        getraenkteWilli
                )
        );

        baeker.verkaufen(einkauf);
    }
}
