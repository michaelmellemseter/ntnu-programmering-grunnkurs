//Klasse for et terningspill
public class Spiller{
	java.util.Random terning = new java.util.Random();

	private int sumPoeng;
	private final String navn;

	public Spiller(int sumPoeng, String navn){
		this.sumPoeng = sumPoeng;
		this.navn = navn;
	}

	public int kastTerningen(){
		int terningkast = terning.nextInt(6);
		terningkast ++;
		if(terningkast == 1){
			sumPoeng = 0;
		}else{
			this.sumPoeng += terningkast;
		}
		return terningkast;
	}

	public int getSumPoeng(){
		return sumPoeng;
	}
}