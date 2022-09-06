package main.Produkte;

public class HomebusTemperaturSensor extends TemperaturSensor 
{
	@Override
	public float holeTemperatur() 
	{
		//Mit Hardware kommunizieren, Wert abrufen und zurückgeben
		float temperatur = 42;
		setAktuelleTemperatur(temperatur);
		return 42;
	}
}
