//fast setup MF
import static javax.swing.JOptionPane.*;
class Tekst{
	int[] antallTegn = new int[30];
	String[] bokstaver = {"a", "b", "c", "d", "e", "f", "g", "h", "i", "j", "k", "l", "m", "n", "o", "p", "q", "r", "s", "t", "u", "v", "w", "x", "y", "z", "æ", "ø", "å"};

	public Tekst(String skrift){
		int i = 0;
		int verdi = 0;
		while(i < skrift.length()){
			char tegn = skrift.charAt(i);
			if(tegn == 230){
				this.antallTegn[26] += 1;
			}
			else if(tegn == 248){
				this.antallTegn[27] += 1;
			}
			else if(tegn == 229){
				this.antallTegn[28] += 1;
			}
			verdi = tegn-97;
			if(verdi>=0 && verdi<=25){
				this.antallTegn[verdi] += 1;
			}
			else if(tegn != 230 && tegn != 248 && tegn != 229){
				this.antallTegn[29] += 1;
			}
			i++;
		}
	}

	public String forskjellige(){
		int a = 0;
		for(int i=0; i<=antallTegn.length - 2; i++){
			if(antallTegn[i]>0){
				a++;
			}
		}
		String utskrift="Antall forskjellige bokstaver: " + a;
		return utskrift;
	}

	public String antall(){
		int a = 0;
		for(int i=0; i<=antallTegn.length - 2; i++){
			a += antallTegn[i];
		}
		String utskrift = "antall bokstaver i teksten er: " + a;
		return utskrift;
	}

	public String ikkeBokstav(){
		int tegn = 0;
		for(int i=0; i<=antallTegn.length - 1; i++){
			tegn += antallTegn[i];
		}
		double prosent = ((double) antallTegn[29] / (double) tegn) * 100;
		String utskrift = "Det er " + prosent + "% ikke-bokstaver";
		return utskrift;
	}

	public String bestemtBokstav(String bokstav){
		String utskrift;
		char tegn = bokstav.charAt(0);
		int verdi = tegn-97;
		if(tegn == 230){
			verdi = 26;
		}
		else if(tegn == 248){
			verdi = 27;
		}
		else if(tegn == 229){
			verdi = 28;
		}
		utskrift = "Det er " + antallTegn[verdi] + " av " + bokstav;
		return utskrift;
	}

	public String oftest(){
		int storstPlass=0;
		for(int i=1; i<=antallTegn.length - 2; i++){
			if(antallTegn[i]>antallTegn[storstPlass]){
				storstPlass = i;
			}
		}
		String utskrift = antallTegn[storstPlass] + " er det største antall ganger en bokstav blir gjentatt. Den/disse bokstavene er: " + bokstaver[storstPlass];
		for(int i=storstPlass+1; i<=antallTegn.length - 2; i++){
			if(antallTegn[i]==antallTegn[storstPlass]){
				utskrift += ", " + bokstaver[i];
			}
		}
		return utskrift;
	}
}
class analyseTekst {
	public static void main(String[]args) {
	String tLest = showInputDialog("Skriv inn en tekst(Alt i små bokstaver)");
	Tekst tekst1 = new Tekst(tLest);
	String utskrift = "";
	boolean fortsett = true;
		while(fortsett==true){
			String valgLest = showInputDialog("Tast nummer for kommando: \n 1. for å avslutte \n 2. for antall forskjellige bokstaver \n 3. total mengde bokstaver \n 4. prosent av ikke bokstaver \n 5. antall forekomster av en bestemt bokstav \n 6. hvilke bokstav(er) forekommer oftest");
			char valg = valgLest.charAt(0);
			switch(valg){
			case '1':
				fortsett = false;
				break;
			case '2':
				utskrift = tekst1.forskjellige();
				break;
			case '3':
				utskrift = tekst1.antall();
				break;
			case '4':
				utskrift = tekst1.ikkeBokstav();
				break;
			case '5':
				String bLest = showInputDialog("Skriv inn en bokstav");
				utskrift = tekst1.bestemtBokstav(bLest);
				break;
			case '6':
				utskrift = tekst1.oftest();
				break;
			}
			if(fortsett==true){
			showMessageDialog(null, utskrift);
			}

		}
	}
}
/* Eksempeldata:
test
*/