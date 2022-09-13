package cenglisch;

public class TemperaturSensor extends Sensor{
    public TemperaturSensor(double kalibrierFaktor) {
        super(kalibrierFaktor);
    }

    public double rechneUm(double messwert){
        return messwert - 273.15;
    }
}
