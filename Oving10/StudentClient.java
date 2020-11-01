class StudentClient{
	public static void main(String[]args){
		Student ole = new Student("Ole Nelson", 0);

		String navn = ole.getNavn();
		int antOppg = ole.getAntOppg();
		ole.økAntOppg();
		String tekst = ole.toString();

		System.out.println(navn + " " + antOppg + " " + tekst);
	}
}