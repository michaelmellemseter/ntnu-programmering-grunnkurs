//Program som gjør timer, minutter og sekunder om til sekunder//
import static javax.swing.JOptionPane.*;
class Klokke{
	public static void main (String[]args){
		String timerLest = showInputDialog("Timer:");
		String minutterLest = showInputDialog("Minutter:");
		String sekunderLest = showInputDialog("Sekunder:");
		final int SekunderPrTime = 3600;
		final int SekunderPrMinutter = 60;
		double timer = Double.parseDouble(timerLest);
		double minutter = Double.parseDouble(minutterLest);
		double sekunder = Double.parseDouble(sekunderLest);
		double svar = timer*SekunderPrTime + minutter*SekunderPrMinutter + sekunder;
		String utskrift = timer + " timer, " + minutter + " minutter og " + sekunder + " sekunder er " + svar + " sekunder ";
		showMessageDialog(null, utskrift);
	}
}

