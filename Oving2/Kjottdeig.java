//Program som regner ut hvilken kj�ttdeig som er billigst
import static javax.swing.JOptionPane.*;
class Kjottdeig{
	public static void main(String[]args){
		double gram1 = Double.parseDouble(showInputDialog("Gram (Merke A):"));
		double pris1 = Double.parseDouble(showInputDialog("Pris (Merke A):"));
		double gram2 = Double.parseDouble(showInputDialog("Gram (Merke B):"));
		double pris2 = Double.parseDouble(showInputDialog("Pris (Merke B):"));
		double a = pris1/gram1;
		double b = pris2/gram2;

		String melding;
		if(a>b){
			melding = "Kj�ttdeig av merke B er billigst";
		}else if (a==b){
			melding = "Kj�ttdeig av merke A og merke B er like billig";
		}else{
			melding = "Kj�ttdeig av merke A er billigst";
		}
		showMessageDialog(null, melding);
	}
}