//Klasse for temperaturer i en måned
class Temperaturer{
	java.util.Random random = new java.util.Random();

	private int[][] temperatur;

	public Temperaturer(int antDager, int antTimer){
		this.temperatur = new int[antDager][antTimer];
		this.antTimer = antTimer;
		this.antDager = antDager;
	}
	int antTimer = this.antTimer;
	int antDager = this.antDager;

	public void initialisere(){
		for(int i = 0; i<antDager; i++){
			for(int j = 0; j<antTimer; j++){
				temperatur[i][j] = random.nextInt(60)-30;
			}
		}
	}

	public double[] gjennomsnittDag(){
		double time = 0;
		double[] gjennomsnittet = new double[antDager];
		for(int i = 0; i<antDager; i++){
			for(int j = 0; j<antTimer; j++){
				time += temperatur[i][j];
			}
			gjennomsnittet[i] = time/antTimer;
			time = 0;
		}
		return gjennomsnittet;
	}

	public double[] gjennomsnittTime(){
		double dag = 0;
		double[] gjennomsnittet = new double[antTimer];
		for(int j = 0; j<antTimer; j++){
			for(int i = 0; i<antDager; i++){
				dag += temperatur[i][j];
			}
			gjennomsnittet[j] = dag/antDager;
			dag = 0;
		}
		return gjennomsnittet;
	}

	public double gjennomsnittManed(){
		double dag = 0;
		for(int j = 0; j<antTimer; j++){
			for(int i = 0; i<antDager; i++){
				dag += temperatur[i][j];
			}
		}
		return dag/(antTimer * antDager);
	}

	public int[] antall(){
		int underMinusFem = 0;
		int mellomMinusFemNull = 0;
		int mellomNullFem = 0;
		int mellomFemTi = 0;
		int overTi = 0;

		double time = 0;
		double[] gjennomsnittet = new double[antDager];
		for(int i = 0; i<antDager; i++){
			for(int j = 0; j<antTimer; j++){
				time += temperatur[i][j];
			}
			gjennomsnittet[i] = time/antTimer;
			time = 0;
		}
		for(int k = 0; k<gjennomsnittet.length ; k++){
			if(gjennomsnittet[k] < -5){
				underMinusFem++;
			}else if(gjennomsnittet[k] < 0 && gjennomsnittet[k] >= -5){
				mellomMinusFemNull++;
			}else if(gjennomsnittet[k] < 5 && gjennomsnittet[k] >= 0){
				mellomNullFem++;
			}else if(gjennomsnittet[k] < 10 && gjennomsnittet[k] >= 5){
				mellomFemTi++;
			}else if(gjennomsnittet[k] > 10){
				overTi++;
			}
		}

		int[] antall = new int[5];
		antall[0] = underMinusFem;
		antall[1] = mellomMinusFemNull;
		antall[2] = mellomNullFem;
		antall[3] = mellomFemTi;
		antall[4] = overTi;

		return antall;
	}
}