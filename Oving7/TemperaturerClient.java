//Klientprogram for klassen Temperaturer
import static javax.swing.JOptionPane.*;
import java.util.*;
class TemperaturerClient{
	public static void main(String[]args){
		int antTimer = Integer.parseInt(showInputDialog("Antall timer:"));
		int antDager = Integer.parseInt(showInputDialog("Antall dager:"));

		Temperaturer temp = new Temperaturer(antDager, antTimer);

		temp.initialisere();

		double[] gjennomsnittDag = temp.gjennomsnittDag();
		System.out.println("Middeltemperaturen for hver dag: \n");
		System.out.println(Arrays.toString(gjennomsnittDag));

		double[] gjennomsnittTime = temp.gjennomsnittTime();
		System.out.println("\nMiddeltemperaturen for hver enkel time: \n");
		System.out.println(Arrays.toString(gjennomsnittTime));

		double gjennomsnittManed = temp.gjennomsnittManed();
		System.out.println("\nMiddeltemperaturen for hele måneden: \n" + gjennomsnittManed);

		int[] antall = temp.antall();
		System.out.println("\nTall 1 = Antall dager mindre enn -5, Tall 2 = Antall dager mellom -5 og 0, Tall 3 = Antall dager mellom 0 og 5, Tall 3 = Antall dager mellom 5 og 10, Tall 4 = Antall dager over 10");
		System.out.println(Arrays.toString(antall));
	}
}