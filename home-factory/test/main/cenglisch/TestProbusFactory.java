package main.cenglisch;

import junit.framework.TestCase;
import main.cenglisch.Fabriken.HeimautomationFabrik;
import main.cenglisch.Fabriken.ProbusFabrik;
import main.cenglisch.Produkte.HomebusTemperaturSensor;
import main.cenglisch.Produkte.ProbusTemperaturSensor;
import org.junit.Test;

public class TestProbusFactory extends TestCase {
    @Test
    public void testFactory() {
        HeimautomationFabrik.initialisiere(new ProbusFabrik());
        var controller = new HeimController(HeimautomationFabrik.getInstanz());
        assertSame(ProbusTemperaturSensor.class.getName(), controller.temperaturSensor.getClass().getName());
        assertEquals((float) 24.0, controller.temperaturSensor.holeTemperatur());
    }
}
