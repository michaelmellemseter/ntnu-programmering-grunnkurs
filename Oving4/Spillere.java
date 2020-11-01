//Spillere til et terningspill
import static javax.swing.JOptionPane.*;
class Spillere{
	public static void main(String[]args){
		Spiller A = new Spiller(0, "A");
		Spiller B = new Spiller(0, "B");

		int i = 1;

		while(A.getSumPoeng() <= 100 && B.getSumPoeng() <= 100){
			int terningkastA = A.kastTerningen();
			int terningkastB = B.kastTerningen();
			System.out.println("Terningen til A viser " + terningkastA + " og summen til spiller A er " + A.getSumPoeng() + " rundenummer: " + i);
			System.out.println("Terningen til B viser " + terningkastB + " og summen til spiller B er " + B.getSumPoeng() + " rundenummer: " + i);
			i ++;
		}


		if(A.getSumPoeng() >= 100 && B.getSumPoeng() >= 100){
			System.out.println("Uavgjort");
		}
		else if(B.getSumPoeng() >= 100){
			System.out.println("Spiller B vinner");
		}
		else if(A.getSumPoeng() >= 100){
			System.out.println("Spiller A vinner");
		}
	}
}