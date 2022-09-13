package main.cenglisch.Fabriken;

import main.cenglisch.Produkte.*;

public class HomebusFabrik extends HeimautomationFabrik
{
	@Override
	public TemperaturSensor erzeugeTemperaturSensor() 
	{
		return new HomebusTemperaturSensor();
	}

	@Override
	public JalousieAktor erzeugeJalousieAktor() 
	{
		return new HomebusJalousieAktor();
	}
}
