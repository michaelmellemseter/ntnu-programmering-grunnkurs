//Program som regner tommer om til cm//
import static javax.swing.JOptionPane.*;
class Tommer{
	public static void main (String[]args){;
		String tommerLest = showInputDialog("Tommer:");
		double tommer = Double.parseDouble(tommerLest);

		final double TommerFaktor = 2.54;

		double cm = tommer * TommerFaktor;
		String utskrift = tommer + " tommer er " + cm + " cm";
		showMessageDialog(null, utskrift);
	}
}