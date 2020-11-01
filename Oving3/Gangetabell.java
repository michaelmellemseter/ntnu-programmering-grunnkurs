//Program som skriver ut en del av gangetabellen
import static javax.swing.JOptionPane.*;
class Gangetabell{
	public static void main(String[]args){
		int tall = Integer.parseInt(showInputDialog("Gangetabell fra:"));
		int tall2 = Integer.parseInt(showInputDialog("Gangetabell til:"));
		int teller = tall2- tall;
		int sum = 0;

		while(sum<=teller){


			int answer1 = tall * 1;
			int answer2 = tall * 2;
			int answer3 = tall * 3;
			int answer4 = tall * 4;
			int answer5 = tall * 5;
			int answer6 = tall * 6;
			int answer7 = tall * 7;
			int answer8 = tall * 8;
			int answer9 = tall * 9;
			int answer10 = tall * 10;


			System.out.println(tall + "-gangen:");
			System.out.println(tall + " x 1 = " + answer1);
			System.out.println(tall + " x 2 = " + answer2);
			System.out.println(tall + " x 3 = " + answer3);
			System.out.println(tall + " x 4 = " + answer4);
			System.out.println(tall + " x 5 = " + answer5);
			System.out.println(tall + " x 6 = " + answer6);
			System.out.println(tall + " x 7 = " + answer7);
			System.out.println(tall + " x 8 = " + answer8);
			System.out.println(tall + " x 9 = " + answer9);
			System.out.println(tall + " x 10 = " + answer10);

			tall++;
			sum++;


		}
	}
}