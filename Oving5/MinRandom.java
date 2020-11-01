import static javax.swing.JOptionPane.*;
class MinRandom{
	java.util.Random random = new java.util.Random();

	private double ovre;
	private double nedre;
	private int ovre1;
	private int nedre1;

	public MinRandom(double ovre, double nedre){
		this.ovre = ovre;
		this.nedre = nedre;
	}

	public MinRandom(int ovre1, int nedre1){
		this.ovre1 = ovre1;
		this.nedre1 = nedre1;
	}

	public int nesteHeltall(){
		return(random.nextInt(ovre1+1 - nedre1) + nedre1);
	}

	public double nesteDesimal(){
		return(random.nextDouble() * (ovre - nedre) + nedre);
	}


	public static void main(String[]args){


		int tallLest = 0;
		while(tallLest != 3){
			tallLest = Integer.parseInt(showInputDialog("1. Heltall \n2. Desimaltall \n3. Avslutt"));

			if(tallLest == 1){
				MinRandom tilfeldigTall = new MinRandom(4, 2);
				for (int i = 0; i < 20; i++) {
					int tall = tilfeldigTall.nesteHeltall();
					System.out.println("Tilfeldig tall: " + tall);
				}
			}else if(tallLest == 2){
				MinRandom tilfeldigTall = new MinRandom(14.8, 2.4);
				double tall = tilfeldigTall.nesteDesimal();
				System.out.println("Tilfeldig tall: " + tall);
			}
		}
	}
}