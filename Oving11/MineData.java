import java.io.*;
import static javax.swing.JOptionPane.*;
class MineData{
	public static void main(String[]args) throws IOException{
		String filnavn = "minedata.txt";

		try{
			FileReader leseforbTilFil = new FileReader(filnavn);
			BufferedReader leser = new BufferedReader(leseforbTilFil);

			String enLinje = leser.readLine();
			int antLinjer = 0;

			while(enLinje != null){
				antLinjer++;
				enLinje = leser.readLine();
			}
			leser.close();
			System.out.println("Antall linjer: " + antLinjer);
		}catch(FileNotFoundException e){
			System.out.println("Fil ikke funnet");
		}

		FileWriter skriveforbTilFil = new FileWriter(filnavn, true);
		PrintWriter skriver = new PrintWriter(new BufferedWriter(skriveforbTilFil));
		String tekst = showInputDialog("Tekst");
		skriver.println(tekst);

		skriver.close();
	}
}