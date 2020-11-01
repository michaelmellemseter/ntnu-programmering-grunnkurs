//Klientprogram for klassen Tekstbehandler
import static javax.swing.JOptionPane.*;
class TekstbehandlerClient{
	public static void main(String[]args){
		String tekst = showInputDialog("Tekst:");

		Tekstbehandler teksten = new Tekstbehandler(tekst);

		int lengde = teksten.antallOrd();
		System.out.println("Antall ord:" + lengde);

		double gjennomsnitt = teksten.gjennomsnitt();
		System.out.println("Gjennomsnitt ordlengde:" + gjennomsnitt);

		double gjennomsnittOrd = teksten.gjennomsnittOrd();
		System.out.println("Gjennomsnitt ord pr periode:" + gjennomsnittOrd);

		String tekst1 = showInputDialog("Tekst du vil sette inn:");
		String tekst2 = showInputDialog("Tekst du vil bytte ut:");
		String nytekst = teksten.utbytte(tekst1, tekst2);
		System.out.println("Nye teksten er:" + nytekst);

		String opprinnelig = teksten.teksten();
		System.out.println(opprinnelig);

		String storeBokstaver = teksten.storeBokstaver();
		System.out.println(storeBokstaver);
	}
}