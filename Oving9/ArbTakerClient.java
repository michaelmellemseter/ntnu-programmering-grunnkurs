import static javax.swing.JOptionPane.*;
class ArbTakerClient{
	public static void main(String[]args){
		Person albert1 = new Person("Albert", "Knudsen", 2000);
		ArbTaker albert= new ArbTaker(albert1, 1001, 2007, 20000, 0.3);

		int arbtakernr = albert.getArbtakernr();
		System.out.println("Arbtakernr:" + arbtakernr);

		int ansettelsesar = albert.getAnsettelsesar();
		System.out.println("Ansettelses�r:" + ansettelsesar);

		double manedslonn = albert.getManedslonn();
		System.out.println("M�nedsl�nn:" + manedslonn);

		double skatteprosent = albert.getSkatteprosent();
		System.out.println("Skatteprosent:" + skatteprosent);

		double bruttolonn = albert.bruttolonn();
		System.out.println("Bruttol�nn:" + bruttolonn);

		double skattetrekkPrAr = albert.skattetrekkPrAr();
		System.out.println("Skattetrekk pr �r:" + skattetrekkPrAr);

		String navn = albert.getFormen();
		System.out.println("Navn:" + navn);

		int alder = albert.alder();
		System.out.println("Alder:" + alder);

		int �rAnsatt = albert.�rAnsatt();
		System.out.println("�r ansatt:" + �rAnsatt);

		int �r = Integer.parseInt(showInputDialog("�r:"));
		String merEnnGittAr = albert.merEnnGittAr(�r);
		System.out.println("Har han jobbet mer enn " + �r + " �r:" + merEnnGittAr);

		boolean fortsett = true;
		while(fortsett != false){
			String[] ALTERNATIVER = {"M�nedsl�nn", "Skatteprosent", "Cancel"};
			int valg = showOptionDialog(null, "Velg hva du vil endre p�:", "Valg", DEFAULT_OPTION, PLAIN_MESSAGE, null, ALTERNATIVER, ALTERNATIVER[0]);

			switch(valg){
			case 0:
				double nyManedslonn = Double.parseDouble(showInputDialog("Ny m�nedsl�nn:"));
				albert.setManedslonn(nyManedslonn);
				break;
			case 1:
				double nySkatteprosent = Double.parseDouble(showInputDialog("Ny skatteprosent:"));
				albert.setSkatteprosent(nySkatteprosent);
				break;
			case 2:
				fortsett = false;
			}
			System.out.println(albert.toString());
		}
	}
}
