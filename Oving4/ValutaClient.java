//Klientprogram for å regne om valuta
import static javax.swing.JOptionPane.*;
class ValutaClient{
	public static void main(String[]args){

		int tallLest = 0;

		while(tallLest != 4){

			tallLest = Integer.parseInt(showInputDialog("1. dollar \n2. euro \n3. svenske kroner \n4. avslutt"));

			if(tallLest == 1){
				Valuta dollar = new Valuta(7.86, "dollar");
				double valuta = Double.parseDouble(showInputDialog("Dollar:"));
				double belop = dollar.tilNorskeKroner(valuta);
				showMessageDialog(null, valuta + " dollar er " + belop + " norske kroner");

			}else if(tallLest == 2){
				Valuta euro = new Valuta(10.78, "euro");
				double valuta = Double.parseDouble(showInputDialog("Euro:"));
				double belop = euro.tilNorskeKroner(valuta);
				showMessageDialog(null, valuta + " euro er " + belop + " norske kroner");

			}else if(tallLest == 3){
				Valuta svensk = new Valuta(0.97, "svenskekroner");
				double valuta = Double.parseDouble(showInputDialog("Svenske kroner:"));
				double belop = svensk.tilNorskeKroner(valuta);
				showMessageDialog(null, valuta + " svenske kroner er " + belop + " norske kroner");
			}
		}
	}
}