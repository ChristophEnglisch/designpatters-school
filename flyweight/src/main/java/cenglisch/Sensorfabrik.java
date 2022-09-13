package cenglisch;

import java.util.HashMap;

public class Sensorfabrik {
    private HashMap<String, Sensor> sensoren;

    public Sensor gibSensor(String id){
        return this.sensoren.get(id);
    }
}
