package cenglisch;

public class Einkauf {
    protected final Ware WARE;

    private int menge;

    public Einkauf(Ware ware, int menge){
        this.WARE = ware;
        this.menge = menge;
    }

    public void verkaufeWaren(){
        this.menge--;
    }

    public boolean willNochMehr(){
        return menge > 0;
    }

    public String toString() {
        return super.toString();
    }

    public Ware getWare() {
        return this.WARE;
    }
}
