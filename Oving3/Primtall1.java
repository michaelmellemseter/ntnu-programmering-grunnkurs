//Program som finner ut om et tall er primtall
import static javax.swing.JOptionPane.*;
class Primtall1{
	public static void main(String[]args){
		String tallLest = showInputDialog("Tall:");
		while(tallLest!=null){
			int tall = Integer.parseInt(tallLest);
			String svar;

			boolean erPrimtall = true;
			for(int teller=2; teller<tall; teller++){
				if(tall % teller == 0){
					erPrimtall= false;
					break;
				}else{
					erPrimtall= true;
				}
			}


			if(erPrimtall){
				svar = tall + " er et primtall";
			}else{
				svar = tall + " er ikke et primtall";
			}
			if(tall==1){
				svar = tall + " er ikke et primtall";
			}
			showMessageDialog(null, svar);
			tallLest = showInputDialog("Tall:");

		}
	}
}
