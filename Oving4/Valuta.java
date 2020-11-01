//Klasse for å regne om valuta
public class Valuta{
	private final double kurs;
	private final String navn;

	public Valuta(double kurs, String navn){
		this.kurs = kurs;
		this.navn = navn;
	}

	public double tilNorskeKroner(double valuta){
		return valuta/kurs;
	}

	public double fraNorskeKroner(double norsk){
		return norsk*kurs;
	}
}