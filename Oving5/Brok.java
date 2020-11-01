//Klasse som regner med brøk, med klientprogram
import static javax.swing.JOptionPane.*;
class Brok{
	private int teller;
	private int nevner;

	public Brok(int teller, int nevner){
		if(nevner == 0){
			throw new IllegalArgumentException("Går ikke å dele på 0");
		}
		this.teller = teller;
		this.nevner = nevner;
	}

	public Brok(int teller){
		this.teller = teller;
		this.nevner = 1;
	}


	public void getSum(Brok brok){
		int nevnerBackup = this.nevner;
		this.teller *= brok.getNevner();
		this.nevner *= brok.getNevner();
		this.teller += brok.getTeller() * nevnerBackup;
	}

	public void getDifferanse(Brok brok){
		int nevnerBackup = this.nevner;
		this.teller *= brok.getNevner();
		this.nevner *= brok.getNevner();
		this.teller -= brok.getTeller() * nevnerBackup;
	}

	public void getProdukt(Brok brok){
		this.teller *= brok.getTeller();
		this.nevner *= brok.getNevner();
	}

	public void getKvotient(Brok brok){
		this.teller *= brok.getNevner();
		this.nevner *= brok.getTeller();
	}

	public int getTeller(){
		return this.teller;
	}

	public int getNevner(){
		return this.nevner;
	}

	public String toString(){
		return ("Telleren er " + this.teller + " og nevneren er " + this.nevner);
	}

	public static void main(String[]args){
		Brok brok1 = new Brok(1,2);
		Brok brok2 = new Brok(1,4);

		int tallLest = Integer.parseInt(showInputDialog("1. addisjon \n2. subtraksjon \n3. multiplikasjon \n4. divisjon \n5. avslutt"));

		if(tallLest == 1){
			brok1.getSum(brok2);
			System.out.println(brok1.toString());
		}

		else if(tallLest == 2){
			brok1.getDifferanse(brok2);
			System.out.println(brok1.toString());
		}

		else if(tallLest == 3){
			brok1.getProdukt(brok2);
			System.out.println(brok1.toString());
		}

		else if(tallLest == 4){
			brok1.getKvotient(brok2);
			System.out.println(brok1.toString());
		}
	}
}
