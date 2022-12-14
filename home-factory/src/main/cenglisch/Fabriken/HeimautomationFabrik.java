package main.cenglisch.Fabriken;

import main.cenglisch.Produkte.*;

public abstract class HeimautomationFabrik 
{
	private static HeimautomationFabrik instanz;
	
	public abstract TemperaturSensor erzeugeTemperaturSensor();
	public abstract JalousieAktor erzeugeJalousieAktor();
	
	public static void initialisiere(HeimautomationFabrik fabrik)
	{
		instanz = fabrik;
	}
	
	public static HeimautomationFabrik getInstanz()
	{
		if (instanz != null)
			return instanz;
		else
			throw new RuntimeException("Bitte zuerst Fabrik initialisieren");
	}
}
