//Program som finner ut om et �r er skudd�r eller ikke
import static javax.swing.JOptionPane.*;
class Skuddar{
	public static void main(String[]args){
		int ar = Integer.parseInt(showInputDialog("�r:"));

		String svar;
		if(ar % 4 == 0){
			if(ar % 100 == 0){
				if(ar % 400 == 0){
					svar = ar + " er et skudd�r";
				}else{
					svar = ar + " er ikke et skudd�r";
				}
			}else{
				svar = ar + " er et skudd�r";
			}
		}else{
			svar = ar + " er ikke et skudd�r";
		}


		showMessageDialog(null, svar);
	}
}