package cenglisch;

public enum Ware {

    KAESE("Käse"),
    WURST("Wurst"),
    EIER("Eier"),
    BIER("Bier"),
    BROT("Brot");

    private final String beschreibung;

    Ware(String beschreibung) {
        this.beschreibung = beschreibung;
    }

    @Override
    public String toString() {
        return this.beschreibung;
    }
}
