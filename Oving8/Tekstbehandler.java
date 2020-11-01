//En enkel tekstbehandler
class Tekstbehandler{
	private final String tekst;

	public Tekstbehandler(String tekst){
		this.tekst = tekst;
	}

	public int antallOrd(){
		String[] ord = tekst.split(" ");
		int antallOrd = ord.length;
		return antallOrd;
	}

	public double gjennomsnitt(){
		String[] ord = tekst.split(" ");
		double sum = 0;
		for(int i = 0; i<ord.length; i++){
			sum += ord[i].length();
		}
		double gjennomsnitt = sum/ord.length;
		return gjennomsnitt;
	}

	public double gjennomsnittOrd(){
		String[] periode = tekst.split("[.!:?]");
		int antallPeriode = periode.length;

		String[] ord = tekst.split(" ");
		int antallOrd = ord.length;

		double gjennomsnittOrd = antallOrd/antallPeriode;
		return gjennomsnittOrd;
	}

	public String utbytte(String tekst1, String tekst2){
		String nytekst = tekst.replace(tekst2, tekst1);
		return nytekst;
	}

	public String teksten(){
		return tekst;
	}

	public String storeBokstaver(){
		String store = tekst.toUpperCase();
		return store;
	}
}