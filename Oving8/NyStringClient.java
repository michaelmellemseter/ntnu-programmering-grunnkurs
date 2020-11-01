//Klientprogram for klassen NyString
import static javax.swing.JOptionPane.*;
class NyStringClient{
	public static void main(String[]args){
		String tekst = showInputDialog("Tekst:");
		NyString teksten = new NyString(tekst);

		String forkortelse = teksten.forkort();
		System.out.println("Forkortelsen blir " + forkortelse);

		String bokstav = showInputDialog("Bokstav du vil fjerne:");
		String fjernet = teksten.fjerne(bokstav);
		System.out.println("Teksten uten " + bokstav + " er " + fjernet);
	}
}