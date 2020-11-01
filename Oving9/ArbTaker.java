class ArbTaker{
	java.util.GregorianCalendar kalender = new java.util.GregorianCalendar();

	private Person personalia;
	private int arbtakernr;
	private int ansettelsesar;
	private double manedslonn;
	private double skatteprosent;

	public ArbTaker(Person personalia, int arbtakernr, int ansettelsesar, double manedslonn, double skatteprosent){
		this.personalia = personalia;
		this.arbtakernr = arbtakernr;
		this.ansettelsesar = ansettelsesar;
		this.manedslonn = manedslonn;
		this.skatteprosent = skatteprosent;
	}

	int år = kalender.get(java.util.Calendar.YEAR);

	public int getArbtakernr(){
		return arbtakernr;
	}

	public int getAnsettelsesar(){
		return ansettelsesar;
	}

	public double getManedslonn(){
		return manedslonn;
	}

	public double getSkatteprosent(){
		return skatteprosent;
	}


	public void setManedslonn(double nyManedslonn){
		manedslonn = nyManedslonn;
	}

	public void setSkatteprosent(double nySkatteprosent){
		skatteprosent = nySkatteprosent;
	}


	public double skattetrekk(){
		return manedslonn*skatteprosent;
	}

	public double bruttolonn(){
		return manedslonn*12;
	}

	public double skattetrekkPrAr(){
		return manedslonn*skatteprosent*10+manedslonn*(skatteprosent/2);
	}

	public String getFormen(){
		String fornavn = personalia.getFornavn();
		String etternavn = personalia.getEtternavn();
		return etternavn + ", " + fornavn;
	}

	public int alder(){
		int fodselsar = personalia.getFodselsar();
		return år-fodselsar;
	}

	public int årAnsatt(){
		return år-ansettelsesar;
	}

	public String merEnnGittAr(int ar){
		String svar = " ";
		if ((år-ansettelsesar)< ar){
			svar = "Nei";
		}else if ((år-ansettelsesar)> ar){
			svar = "Ja";
		}
		return svar;
	}

	public String toString(){
		return "Den nye månedslønnen er " + manedslonn + ", den nye skatteprosenten er " + skatteprosent + ", det nye skattetrekket er " + (manedslonn*skatteprosent) + " og den nye bruttolønnen er " + (manedslonn*12);
	}
}