package cenglisch;

public abstract class Sensor {
    private final double kalibrierfaktor;

    public Sensor(double kalibrierFaktor){
        this.kalibrierfaktor = kalibrierFaktor;
    }

    protected double rechneUm(double messwert){
        return messwert - 273.15;
    }
}
