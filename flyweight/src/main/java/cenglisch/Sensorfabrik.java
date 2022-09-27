package cenglisch;

import java.util.HashMap;

public class Sensorfabrik {
    private HashMap<String, Sensor> sensoren;

    public Sensor gibSensor(String id){
        Sensor sensor = this.sensoren.get(id);
        if (sensor == null){
            sensor = new
        }
        return sensor;
    }
}
