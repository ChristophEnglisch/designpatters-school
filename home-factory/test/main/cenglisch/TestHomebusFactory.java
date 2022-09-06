package main.cenglisch;

import junit.framework.TestCase;
import main.cenglisch.Fabriken.HeimautomationFabrik;
import main.cenglisch.Fabriken.HomebusFabrik;
import main.cenglisch.Produkte.HomebusTemperaturSensor;
import org.junit.Test;

public class TestHomebusFactory extends TestCase {

    @Test
    public void testFactory() {
        HeimautomationFabrik.initialisiere(new HomebusFabrik());
        var controller = new HeimController(HeimautomationFabrik.getInstanz());
        assertSame(HomebusTemperaturSensor.class.getName(), controller.temperaturSensor.getClass().getName());
        assertEquals((float) 42.0, controller.temperaturSensor.holeTemperatur());
    }
}
