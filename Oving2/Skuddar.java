//Program som finner ut om et år er skuddår eller ikke
import static javax.swing.JOptionPane.*;
class Skuddar{
	public static void main(String[]args){
		int ar = Integer.parseInt(showInputDialog("År:"));

		String svar;
		if(ar % 4 == 0){
			if(ar % 100 == 0){
				if(ar % 400 == 0){
					svar = ar + " er et skuddår";
				}else{
					svar = ar + " er ikke et skuddår";
				}
			}else{
				svar = ar + " er et skuddår";
			}
		}else{
			svar = ar + " er ikke et skuddår";
		}


		showMessageDialog(null, svar);
	}
}