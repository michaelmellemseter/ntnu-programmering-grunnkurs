class Student{
	private String navn;
	private int antOppg;

	public Student(String navn, int antOppg){
		this.navn = navn;
		this.antOppg = antOppg;
	}

	public String getNavn(){
		return navn;
	}

	public int getAntOppg(){
		return antOppg;
	}

	public void økAntOppg(){
		antOppg++;
	}

	public String toString(){
		return navn + " har gjort " + antOppg + " oppgaver.";
	}
}