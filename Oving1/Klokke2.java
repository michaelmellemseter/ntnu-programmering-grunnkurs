//Program som gjør sekunder om til timer, minutter og sekunder
import static javax.swing.JOptionPane.*;
class Klokke2{
	public static void main (String[]args){
		String sekunderLest = showInputDialog("Sekunder:");
		int sekunderOrginalt = Integer.parseInt(sekunderLest);

		final int SekunderPrTime = 3600;
		final int SekunderPrMinutter = 60;

		int timerRest = sekunderOrginalt % SekunderPrTime;
		int timer = sekunderOrginalt/SekunderPrTime;

		int minutterRest = timerRest % SekunderPrMinutter;
		int minutter = timerRest/SekunderPrMinutter;

		int sekunder = minutterRest;


		String utskrift = sekunderOrginalt + " sekunder er " + timer + " timer, " + minutter + " minutter og " + sekunder + " sekunder";
		showMessageDialog(null, utskrift);
	}
}

