package main.cenglisch.Produkte;

public abstract class JalousieAktor 
{
	private float aktuelleStellung;
	
	public float getAktuelleStellung()
	{
		return aktuelleStellung;
	}
	
	public void auf(float wert)
	{
		float zielWert = aktuelleStellung - wert;
		if (zielWert < 0)
			aktuelleStellung = 0;
		else aktuelleStellung=zielWert;
		//interne Methode aufrufen
	}
	
	public void ab(float wert)
	{
		float zielWert = aktuelleStellung + wert;
		if (zielWert > 100)
			aktuelleStellung = 100;
		else aktuelleStellung=zielWert;
		//Interne Methode aufrufen
	}
}
