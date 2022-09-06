package main.cenglisch;

import main.cenglisch.Fabriken.HeimautomationFabrik;
import main.cenglisch.Fabriken.HomebusFabrik;
import main.cenglisch.Fabriken.ProbusFabrik;

public class MainHeimController {
    public void create() {
        HeimautomationFabrik.initialisiere(new ProbusFabrik());
        var controller = new HeimController(HeimautomationFabrik.getInstanz());
        float temperatur = controller.temperaturSensor.holeTemperatur();

        HeimautomationFabrik.initialisiere(new HomebusFabrik());
        var controller2 = new HeimController(HeimautomationFabrik.getInstanz());
        float temperatur2 = controller2.temperaturSensor.holeTemperatur();

        System.out.println(temperatur);
        System.out.println(temperatur2);
    }
}
