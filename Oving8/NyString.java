//Klasse for å skrive forkortelse og ta ut bokstaver fra en tekst
class NyString{
	private String tekst;

	public NyString(String tekst){
		this.tekst = tekst;
	}

	public String forkort(){
		String[] ord = tekst.split(" ");
		String forkortelsen = " ";
		for(int i = 0; i < ord.length; i++){
			String ord1 = ord[i];
			char forsteBokstav = ord1.charAt(0);
			forkortelsen += String.valueOf(forsteBokstav);
		}
		return forkortelsen;
	}

	public String fjerne(String bokstav){
		String tekst1 = tekst.replace(bokstav, "");
		return tekst1;
	}
}
