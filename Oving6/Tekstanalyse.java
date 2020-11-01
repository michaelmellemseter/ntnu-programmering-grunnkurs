import static javax.swing.JOptionPane.*;
class Tekstanalyse{
	private String tekst;
	private finalint[] antallTegn;


	public Tekstanalyse(String tekst, int[] antallTegn){
		this.tekst = tekst
		this.antallTegn = new int[30];
		for(int i = 0; i < tekst.lenght(); i++){
			char tegn = tekst.charAt(i);
			int verdi = tegn;
			antallTegn[verdi]++;
		}
	}

	public int finnAntallForskjellige(){
		for(int i = 0; i < 29; i++){
			return antall[i];
			return i;
	}

	public int finnAntall(){
		return tekst.lenght;
	}

	public int prosentIkkeBokstaver(){

	}

	public int bestemtBokstav(char tegn){

	}

	public forekommerMest(){

	}


	public static void main(String[]args){
		tekst = showInputdialog("Tekst:");

